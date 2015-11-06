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
import com.mozu.api.resources.platform.entitylists.ListViewResource;

/** <summary>
 * Provides settings and options for displaying associated content within a context level of site, tenant, catalog, or master catalog. ListViews can be associated with entity lists and entities.
 * </summary>
 */
public class ListViewFactory
{

	public static com.fasterxml.jackson.databind.JsonNode getViewEntity(ApiContext apiContext, String entityListFullName, String viewName, String entityId, int expectedCode) throws Exception
	{
		return getViewEntity(apiContext,  entityListFullName,  viewName,  entityId,  null, expectedCode);
	}

	public static com.fasterxml.jackson.databind.JsonNode getViewEntity(ApiContext apiContext, String entityListFullName, String viewName, String entityId, String responseFields, int expectedCode) throws Exception
	{
		com.fasterxml.jackson.databind.JsonNode returnObj;
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.getViewEntity( entityListFullName,  viewName,  entityId,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(ApiContext apiContext, String entityListFullName, String viewName, int expectedCode) throws Exception
	{
		return getViewEntities(apiContext,  entityListFullName,  viewName,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(ApiContext apiContext, String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityCollection returnObj = new com.mozu.api.contracts.mzdb.EntityCollection();
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.getViewEntities( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.EntityContainer getViewEntityContainer(ApiContext apiContext, String entityListFullName, String viewName, String entityId, int expectedCode) throws Exception
	{
		return getViewEntityContainer(apiContext,  entityListFullName,  viewName,  entityId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityContainer getViewEntityContainer(ApiContext apiContext, String entityListFullName, String viewName, String entityId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityContainer returnObj = new com.mozu.api.contracts.mzdb.EntityContainer();
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.getViewEntityContainer( entityListFullName,  viewName,  entityId,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(ApiContext apiContext, String entityListFullName, String viewName, int expectedCode) throws Exception
	{
		return getViewEntityContainers(apiContext,  entityListFullName,  viewName,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(ApiContext apiContext, String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityContainerCollection returnObj = new com.mozu.api.contracts.mzdb.EntityContainerCollection();
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.getViewEntityContainers( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.ListView getEntityListView(ApiContext apiContext, String entityListFullName, String viewName, int expectedCode) throws Exception
	{
		return getEntityListView(apiContext,  entityListFullName,  viewName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.ListView getEntityListView(ApiContext apiContext, String entityListFullName, String viewName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.ListView returnObj = new com.mozu.api.contracts.mzdb.ListView();
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.getEntityListView( entityListFullName,  viewName,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.ListViewCollection getEntityListViews(ApiContext apiContext, String entityListFullName, int expectedCode) throws Exception
	{
		return getEntityListViews(apiContext,  entityListFullName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.ListViewCollection getEntityListViews(ApiContext apiContext, String entityListFullName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.ListViewCollection returnObj = new com.mozu.api.contracts.mzdb.ListViewCollection();
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.getEntityListViews( entityListFullName,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.ListView createEntityListView(ApiContext apiContext, com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, int expectedCode) throws Exception
	{
		return createEntityListView(apiContext,  listView,  entityListFullName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.ListView createEntityListView(ApiContext apiContext, com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.ListView returnObj = new com.mozu.api.contracts.mzdb.ListView();
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.createEntityListView( listView,  entityListFullName,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.ListView updateEntityListView(ApiContext apiContext, com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, int expectedCode) throws Exception
	{
		return updateEntityListView(apiContext,  listView,  entityListFullName,  viewName,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.ListView updateEntityListView(ApiContext apiContext, com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.ListView returnObj = new com.mozu.api.contracts.mzdb.ListView();
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			returnObj = resource.updateEntityListView( listView,  entityListFullName,  viewName,  responseFields);
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

	public static void deleteEntityListView(ApiContext apiContext, String entityListFullName, String viewName, int expectedCode) throws Exception
	{
		ListViewResource resource = new ListViewResource(apiContext);
		try
		{
			resource.deleteEntityListView( entityListFullName,  viewName);
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



