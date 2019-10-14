package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
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
    registrator.registerUserAction(awslex.actions.GetUtteranceIntent.class);
    registrator.registerUserAction(awslex.actions.GetUtteranceIntentDetails.class);
    registrator.registerUserAction(main.actions.CleanupSlackMessage.class);
    registrator.registerUserAction(main.actions.SetConstant.class);
    registrator.registerUserAction(mendixsso.actions.CreateUserWithUserProfile.class);
    registrator.registerUserAction(mendixsso.actions.DecryptString.class);
    registrator.registerUserAction(mendixsso.actions.EncryptString.class);
    registrator.registerUserAction(mendixsso.actions.GenerateRandomPassword.class);
    registrator.registerUserAction(mendixsso.actions.GetTokenEndpointURI.class);
    registrator.registerUserAction(mendixsso.actions.InitializeUserMapper.class);
    registrator.registerUserAction(mendixsso.actions.LogOutUser.class);
    registrator.registerUserAction(mendixsso.actions.StartSignOnServlet.class);
    registrator.registerUserAction(mendixsso.actions.UpdateUserWithUserProfile.class);
    registrator.registerUserAction(mxappmetrics.actions.CounterDecrementMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.CounterIncrementMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.CounterMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.DurationMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.GaugeMetric.class);
    registrator.registerUserAction(mxappmetrics.actions.InitContainerMetrics.class);
    registrator.registerUserAction(mxappmetrics.actions.SetMetric.class);
    registrator.registerUserAction(mxawsrekognition.actions.DetectFaces.class);
    registrator.registerUserAction(mxawsrekognition.actions.GetLabelsForImage.class);
    registrator.registerUserAction(mxawsrekognition.actions.IndexFaces.class);
    registrator.registerUserAction(mxawss3.actions.S3CopyFileDocumentToBucket.class);
    registrator.registerUserAction(mxgoogleanalytics.actions.GaTrackEvent.class);
    registrator.registerUserAction(mxgoogleanalytics.actions.GaTrackException.class);
    registrator.registerUserAction(mxgoogleanalytics.actions.GaTrackPageView.class);
    registrator.registerUserAction(mxmustache.actions.FillTemplate.class);
    registrator.registerUserAction(mxmustache.actions.FillTemplateFromJson.class);
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
