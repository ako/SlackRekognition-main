package system;

import aQute.bnd.annotation.component.Component;
import aQute.bnd.annotation.component.Reference;

import com.mendix.core.actionmanagement.IActionRegistrator;

@Component(immediate = true)
public class UserActionsRegistrar
{
  @Reference
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(apiconnector.actions.ApiHeaderLocation.class);
    registrator.registerUserAction(apiconnector.actions.ApiResponseCacheControl.class);
    registrator.registerUserAction(apiconnector.actions.ApiResponseContentType.class);
    registrator.registerUserAction(apiconnector.actions.ApiStatus404NotFound.class);
    registrator.registerUserAction(apiconnector.actions.ApiStatusCreated201.class);
    registrator.registerUserAction(apiconnector.actions.RegisterApiEndpoint.class);
    registrator.registerUserAction(apiconnector.actions.RegisterApiEndpointOqlWithMappings.class);
    registrator.registerUserAction(apiconnector.actions.RegisterApiEndpointWithMappings.class);
    registrator.registerUserAction(apiconnector.actions.RegisterApiEndpointXpathWithMappings.class);
    registrator.registerUserAction(appcloudservices.actions.GenerateRandomPassword.class);
    registrator.registerUserAction(appcloudservices.actions.LogOutUser.class);
    registrator.registerUserAction(appcloudservices.actions.StartSignOnServlet.class);
    registrator.registerUserAction(awslex.actions.GetUtteranceIntent.class);
    registrator.registerUserAction(awslex.actions.GetUtteranceIntentV2.class);
    registrator.registerUserAction(main.actions.CleanupSlackMessage.class);
    registrator.registerUserAction(main.actions.SetConstant.class);
    registrator.registerUserAction(mixpanel.actions.SendEvent.class);
    registrator.registerUserAction(mxawsrekognition.actions.DetectFaces.class);
    registrator.registerUserAction(mxawsrekognition.actions.GetLabelsForImage.class);
    registrator.registerUserAction(mxawsrekognition.actions.IndexFaces.class);
    registrator.registerUserAction(mxawss3.actions.S3CopyFileDocumentToBucket.class);
    registrator.registerUserAction(mxgoogleanalytics.actions.GaTrackEvent.class);
    registrator.registerUserAction(mxgoogleanalytics.actions.GaTrackException.class);
    registrator.registerUserAction(mxgoogleanalytics.actions.GaTrackPageView.class);
    registrator.registerUserAction(mxmustache.actions.FillTemplate.class);
    registrator.registerUserAction(mxmustache.actions.FillTemplateFromMappingToFileDocument.class);
    registrator.registerUserAction(mxmustache.actions.FillTemplateToFileDocument.class);
    registrator.registerUserAction(mxmustache.actions.SendEmail.class);
    registrator.registerUserAction(slackconnector.actions.GetChannelNameById.class);
    registrator.registerUserAction(slackconnector.actions.GetUserNameById.class);
    registrator.registerUserAction(slackconnector.actions.PostMessageToChannel.class);
    registrator.registerUserAction(slackconnector.actions.RegisterMessageListener.class);
    registrator.registerUserAction(slackconnector.actions.SendDirectMessage.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
