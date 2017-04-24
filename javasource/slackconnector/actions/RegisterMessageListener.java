// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package slackconnector.actions;

import com.mendix.core.Core;
import com.mendix.logging.ILogNode;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;
import slackconnector.impl.SlackConnector;

public class RegisterMessageListener extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.String authenticationToken;
	private java.lang.String onMessageMicroflow;

	public RegisterMessageListener(IContext context, java.lang.String authenticationToken, java.lang.String onMessageMicroflow)
	{
		super(context);
		this.authenticationToken = authenticationToken;
		this.onMessageMicroflow = onMessageMicroflow;
	}

	@Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
        try {
            SlackConnector connector = new SlackConnector(authenticationToken, logger);
            connector.registeringAListener(this.onMessageMicroflow);
        } catch (Exception e) {
            logger.info(String.format("Failed to register listener: %s", e.getMessage()));
            throw e;
        }
        return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@Override
	public java.lang.String toString()
	{
		return "RegisterMessageListener";
	}

	// BEGIN EXTRA CODE
    private ILogNode logger = Core.getLogger(SlackConnector.LOGNODE);
	// END EXTRA CODE
}
