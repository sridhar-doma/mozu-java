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
import com.mozu.api.resources.platform.entitylists.EntityResource;

/** <summary>
 * 
 * </summary>
 */
public class EntityFactory
{

	public static com.fasterxml.jackson.databind.JsonNode getEntity(ApiContext apiContext, String entityListFullName, String id, int expectedCode) throws Exception
	{
		return getEntity(apiContext,  entityListFullName,  id,  null, expectedCode);
	}

	public static com.fasterxml.jackson.databind.JsonNode getEntity(ApiContext apiContext, String entityListFullName, String id, String responseFields, int expectedCode) throws Exception
	{
		com.fasterxml.jackson.databind.JsonNode returnObj;
		EntityResource resource = new EntityResource(apiContext);
		try
		{
			returnObj = resource.getEntity( entityListFullName,  id,  responseFields);
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

	public static com.mozu.api.contracts.mzdb.EntityCollection getEntities(ApiContext apiContext, String entityListFullName, int expectedCode) throws Exception
	{
		return getEntities(apiContext,  entityListFullName,  null,  null,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.mzdb.EntityCollection getEntities(ApiContext apiContext, String entityListFullName, Integer pageSize, Integer startIndex, String filter, String sortBy, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.mzdb.EntityCollection returnObj = new com.mozu.api.contracts.mzdb.EntityCollection();
		EntityResource resource = new EntityResource(apiContext);
		try
		{
			returnObj = resource.getEntities( entityListFullName,  pageSize,  startIndex,  filter,  sortBy,  responseFields);
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

	public static com.fasterxml.jackson.databind.JsonNode insertEntity(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, int expectedCode) throws Exception
	{
		return insertEntity(apiContext,  item,  entityListFullName,  null, expectedCode);
	}

	public static com.fasterxml.jackson.databind.JsonNode insertEntity(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String responseFields, int expectedCode) throws Exception
	{
		com.fasterxml.jackson.databind.JsonNode returnObj;
		EntityResource resource = new EntityResource(apiContext);
		try
		{
			returnObj = resource.insertEntity( item,  entityListFullName,  responseFields);
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

	public static com.fasterxml.jackson.databind.JsonNode updateEntity(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, int expectedCode) throws Exception
	{
		return updateEntity(apiContext,  item,  entityListFullName,  id,  null, expectedCode);
	}

	public static com.fasterxml.jackson.databind.JsonNode updateEntity(ApiContext apiContext, com.fasterxml.jackson.databind.JsonNode item, String entityListFullName, String id, String responseFields, int expectedCode) throws Exception
	{
		com.fasterxml.jackson.databind.JsonNode returnObj;
		EntityResource resource = new EntityResource(apiContext);
		try
		{
			returnObj = resource.updateEntity( item,  entityListFullName,  id,  responseFields);
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

	public static void deleteEntity(ApiContext apiContext, String entityListFullName, String id, int expectedCode) throws Exception
	{
		EntityResource resource = new EntityResource(apiContext);
		try
		{
			resource.deleteEntity( entityListFullName,  id);
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



