/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.platform.applications.AuthTicketResource;

/** <summary>
 * Use the Authetickets for applications resource to manage authentication tickets for your apps.
 * </summary>
 */
public class AuthTicketFactory
{

	public static com.mozu.api.contracts.appdev.AuthTicket authenticateApp(ApiContext apiContext, com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, int expectedCode) throws Exception
	{
		return authenticateApp(apiContext,  appAuthInfo,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.AuthTicket authenticateApp(ApiContext apiContext, com.mozu.api.contracts.appdev.AppAuthInfo appAuthInfo, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.AuthTicket returnObj = new com.mozu.api.contracts.appdev.AuthTicket();
		AuthTicketResource resource = new AuthTicketResource(apiContext);
		try
		{
			returnObj = resource.authenticateApp( appAuthInfo,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static com.mozu.api.contracts.appdev.AuthTicket refreshAppAuthTicket(ApiContext apiContext, com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, int expectedCode) throws Exception
	{
		return refreshAppAuthTicket(apiContext,  authTicketRequest,  null, expectedCode);
	}

	public static com.mozu.api.contracts.appdev.AuthTicket refreshAppAuthTicket(ApiContext apiContext, com.mozu.api.contracts.appdev.AuthTicketRequest authTicketRequest, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.appdev.AuthTicket returnObj = new com.mozu.api.contracts.appdev.AuthTicket();
		AuthTicketResource resource = new AuthTicketResource(apiContext);
		try
		{
			returnObj = resource.refreshAppAuthTicket( authTicketRequest,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

	public static void deleteAppAuthTicket(ApiContext apiContext, String refreshToken, int expectedCode) throws Exception
	{
		AuthTicketResource resource = new AuthTicketResource(apiContext);
		try
		{
			resource.deleteAppAuthTicket( refreshToken);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
	}

}



