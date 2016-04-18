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
import com.mozu.api.resources.platform.TenantExtensionsResource;

/** <summary>
 * 
 * </summary>
 */
public class TenantExtensionsFactory
{

	public static com.mozu.api.contracts.installedapplications.TenantExtensions getExtensions(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getExtensions(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.installedapplications.TenantExtensions getExtensions(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.installedapplications.TenantExtensions returnObj = new com.mozu.api.contracts.installedapplications.TenantExtensions();
		TenantExtensionsResource resource = new TenantExtensionsResource(apiContext);
		try
		{
			returnObj = resource.getExtensions( responseFields);
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

	public static com.mozu.api.contracts.installedapplications.TenantExtensions updateExtensions(ApiContext apiContext, com.mozu.api.contracts.installedapplications.TenantExtensions extensions, int expectedCode) throws Exception
	{
		return updateExtensions(apiContext,  extensions,  null, expectedCode);
	}

	public static com.mozu.api.contracts.installedapplications.TenantExtensions updateExtensions(ApiContext apiContext, com.mozu.api.contracts.installedapplications.TenantExtensions extensions, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.installedapplications.TenantExtensions returnObj = new com.mozu.api.contracts.installedapplications.TenantExtensions();
		TenantExtensionsResource resource = new TenantExtensionsResource(apiContext);
		try
		{
			returnObj = resource.updateExtensions( extensions,  responseFields);
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

}



