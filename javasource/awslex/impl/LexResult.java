package awslex.impl;

import java.util.Map;

/**
 * Created by ako on 4/2/2017.
 */
public class LexResult {
    String utterance;
    String intent;
    private String message;
    private String dialogState;

    public String getUtterance() {
        return utterance;
    }

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public Map<String, String> getSlots() {
        return slots;
    }

    public void setSlots(Map<String, String> slots) {
        this.slots = slots;
    }

    Map<String, String> slots;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setDialogState(String dialogState) {
        this.dialogState = dialogState;
    }

    public String getDialogState() {
        return dialogState;
    }
}
