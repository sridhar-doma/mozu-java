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
import com.mozu.api.resources.commerce.catalog.admin.MasterCatalogResource;

/** <summary>
 * Use the Master Catalog resource to view details of the master catalogs associated with a tenant and to manage the product publishing mode for each master catalog.
 * </summary>
 */
public class MasterCatalogFactory
{

	public static com.mozu.api.contracts.productadmin.MasterCatalogCollection getMasterCatalogs(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getMasterCatalogs(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.MasterCatalogCollection getMasterCatalogs(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.MasterCatalogCollection returnObj = new com.mozu.api.contracts.productadmin.MasterCatalogCollection();
		MasterCatalogResource resource = new MasterCatalogResource(apiContext);
		try
		{
			returnObj = resource.getMasterCatalogs( responseFields);
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

	public static com.mozu.api.contracts.productadmin.MasterCatalog getMasterCatalog(ApiContext apiContext, Integer masterCatalogId, int expectedCode) throws Exception
	{
		return getMasterCatalog(apiContext,  masterCatalogId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.MasterCatalog getMasterCatalog(ApiContext apiContext, Integer masterCatalogId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.MasterCatalog returnObj = new com.mozu.api.contracts.productadmin.MasterCatalog();
		MasterCatalogResource resource = new MasterCatalogResource(apiContext);
		try
		{
			returnObj = resource.getMasterCatalog( masterCatalogId,  responseFields);
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

	public static com.mozu.api.contracts.productadmin.MasterCatalog updateMasterCatalog(ApiContext apiContext, com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId, int expectedCode) throws Exception
	{
		return updateMasterCatalog(apiContext,  masterCatalog,  masterCatalogId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.productadmin.MasterCatalog updateMasterCatalog(ApiContext apiContext, com.mozu.api.contracts.productadmin.MasterCatalog masterCatalog, Integer masterCatalogId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.MasterCatalog returnObj = new com.mozu.api.contracts.productadmin.MasterCatalog();
		MasterCatalogResource resource = new MasterCatalogResource(apiContext);
		try
		{
			returnObj = resource.updateMasterCatalog( masterCatalog,  masterCatalogId,  responseFields);
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



