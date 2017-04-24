// This file was generated by Mendix Modeler 7.1.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package inviteapi.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;

public class Microflows
{
	// These are the microflows for the InviteAPI module
	public static void sendInvite(IContext context, java.lang.String _environmentUUID, java.lang.String _environmentPassword, java.lang.String _roleUUID, java.lang.String _inviteeEmailAddress, java.lang.String _inviterEmailAddress)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("EnvironmentUUID", _environmentUUID);
			params.put("EnvironmentPassword", _environmentPassword);
			params.put("RoleUUID", _roleUUID);
			params.put("InviteeEmailAddress", _inviteeEmailAddress);
			params.put("InviterEmailAddress", _inviterEmailAddress);
			Core.execute(context, "InviteAPI.SendInvite", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}