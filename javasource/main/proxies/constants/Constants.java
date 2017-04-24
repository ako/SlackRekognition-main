// This file was generated by Mendix Modeler 7.1.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package main.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Main module

	public static java.lang.String getAWS_ACCESS_KEY_ID()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.AWS_ACCESS_KEY_ID");
	}

	public static java.lang.String getAWS_LEX_ACCESS_KEY_ID()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.AWS_LEX_ACCESS_KEY_ID");
	}

	public static java.lang.String getAWS_LEX_REGION()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.AWS_LEX_REGION");
	}

	public static java.lang.String getAWS_LEX_SECRET_ACCESS_KEY()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.AWS_LEX_SECRET_ACCESS_KEY");
	}

	public static java.lang.String getAWS_REGION()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.AWS_REGION");
	}

	public static java.lang.String getAWS_SECRET_ACCESS_KEY()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.AWS_SECRET_ACCESS_KEY");
	}

	public static java.lang.String getGOOGLE_ANALYTICS_TRACKING_ID()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.GOOGLE_ANALYTICS_TRACKING_ID");
	}

	public static java.lang.String getMIXPANEL_PROJECT_TOKEN()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.MIXPANEL_PROJECT_TOKEN");
	}

	public static java.lang.String getSLACK_TOKEN()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Main.SLACK_TOKEN");
	}
}