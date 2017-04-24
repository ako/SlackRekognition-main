package awslex.impl;

import awslex.proxies.*;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.lexruntime.AmazonLexRuntime;
import com.amazonaws.services.lexruntime.AmazonLexRuntimeClientBuilder;
import com.amazonaws.services.lexruntime.model.PostTextRequest;
import com.amazonaws.services.lexruntime.model.PostTextResult;
import com.mendix.logging.ILogNode;

import java.util.Map;

/**
 * Created by ako on 2/20/2017.
 */
public class MxAwsLexConnector {
    public static final String LOGNODE_NAME = "AwsLex";
    private static ILogNode logger = null;

    public void train(String AwsAccessKeyId, String AwsSecretAccessKey, String awsRegion){
        AWSCredentials credentials = new BasicAWSCredentials(AwsAccessKeyId, AwsSecretAccessKey);

        AmazonLexRuntime client = AmazonLexRuntimeClientBuilder.standard().
                withCredentials(new AWSStaticCredentialsProvider(credentials)).
                withRegion(awsRegion).
                build();


    }
    public LexResult getIntentForUtterance(String AwsAccessKeyId, String AwsSecretAccessKey, String awsRegion, String botName, String botAlias, String userId, String utterance) {
        AWSCredentials credentials = new BasicAWSCredentials(AwsAccessKeyId, AwsSecretAccessKey);
        awslex.impl.LexResult mxResult = new LexResult();
        AmazonLexRuntime client = AmazonLexRuntimeClientBuilder.standard().
                withCredentials(new AWSStaticCredentialsProvider(credentials)).
                withRegion(awsRegion).
                build();
        PostTextRequest request = new PostTextRequest().
                withInputText(utterance).
                withBotName(botName).
                withBotAlias(botAlias).
                withUserId(userId);
        PostTextResult result = client.postText(request);
        String intentName = result.getIntentName();
        mxResult.setUtterance(utterance);
        mxResult.setIntent(intentName);
        mxResult.setDialogState(result.getDialogState());
        mxResult.setMessage(result.getMessage());
        info(String.format("Found slots in result: %d", result.getSlots().size()));
        info(String.format("Found dialog state in result: %s", result.getDialogState()));
        info(String.format("Found message in result: %s", result.getMessage()));
        Map<String, String> slots = result.getSlots();
        for (String slot : slots.keySet()) {
            String slotName = slot;
            String slotValue = slots.get(slotName);
            info(String.format("Found slot: %s -> %s", slotName, slotValue));
        }
        mxResult.setSlots(slots);
        return mxResult;
    }


    public void setLogger(ILogNode logger) {
        this.logger = logger;
    }

    private void info(String message) {
        if (logger != null) {
            logger.info(message);

        } else {
            System.out.println(message);
        }
    }
}
