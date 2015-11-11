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
import com.mozu.api.resources.platform.ReferenceDataResource;

/** <summary>
 * The Reference resource retrieves collections of standards the Mozu system currently supports. This includes content locales, top-level domains, units of measure, countries, currencies, time zones, and shipping or billing address schemas.
 * </summary>
 */
public class ReferenceDataFactory
{

	public static com.mozu.api.contracts.reference.AddressSchema getAddressSchema(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getAddressSchema(apiContext,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.AddressSchema getAddressSchema(ApiContext apiContext, String countryCode, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.AddressSchema returnObj = new com.mozu.api.contracts.reference.AddressSchema();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getAddressSchema( countryCode,  responseFields);
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

	public static com.mozu.api.contracts.reference.AddressSchemaCollection getAddressSchemas(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getAddressSchemas(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.AddressSchemaCollection getAddressSchemas(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.AddressSchemaCollection returnObj = new com.mozu.api.contracts.reference.AddressSchemaCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getAddressSchemas( responseFields);
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

	public static com.mozu.api.contracts.core.Behavior getBehavior(ApiContext apiContext, Integer behaviorId, int expectedCode) throws Exception
	{
		return getBehavior(apiContext,  behaviorId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.Behavior getBehavior(ApiContext apiContext, Integer behaviorId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.Behavior returnObj = new com.mozu.api.contracts.core.Behavior();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getBehavior( behaviorId,  responseFields);
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

	public static com.mozu.api.contracts.core.BehaviorCategory getBehaviorCategory(ApiContext apiContext, Integer categoryId, int expectedCode) throws Exception
	{
		return getBehaviorCategory(apiContext,  categoryId,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.BehaviorCategory getBehaviorCategory(ApiContext apiContext, Integer categoryId, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.BehaviorCategory returnObj = new com.mozu.api.contracts.core.BehaviorCategory();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getBehaviorCategory( categoryId,  responseFields);
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

	public static com.mozu.api.contracts.core.BehaviorCategoryCollection getBehaviorCategories(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getBehaviorCategories(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.BehaviorCategoryCollection getBehaviorCategories(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.BehaviorCategoryCollection returnObj = new com.mozu.api.contracts.core.BehaviorCategoryCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getBehaviorCategories( responseFields);
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

	public static com.mozu.api.contracts.core.BehaviorCollection getBehaviors(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getBehaviors(apiContext,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.core.BehaviorCollection getBehaviors(ApiContext apiContext, String userType, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.core.BehaviorCollection returnObj = new com.mozu.api.contracts.core.BehaviorCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getBehaviors( userType,  responseFields);
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

	public static com.mozu.api.contracts.reference.ContentLocaleCollection getContentLocales(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getContentLocales(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.ContentLocaleCollection getContentLocales(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.ContentLocaleCollection returnObj = new com.mozu.api.contracts.reference.ContentLocaleCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getContentLocales( responseFields);
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

	public static com.mozu.api.contracts.reference.CountryCollection getCountries(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getCountries(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.CountryCollection getCountries(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.CountryCollection returnObj = new com.mozu.api.contracts.reference.CountryCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getCountries( responseFields);
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

	public static com.mozu.api.contracts.reference.CountryWithStatesCollection getCountriesWithStates(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getCountriesWithStates(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.CountryWithStatesCollection getCountriesWithStates(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.CountryWithStatesCollection returnObj = new com.mozu.api.contracts.reference.CountryWithStatesCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getCountriesWithStates( responseFields);
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

	public static com.mozu.api.contracts.reference.CurrencyCollection getCurrencies(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getCurrencies(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.CurrencyCollection getCurrencies(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.CurrencyCollection returnObj = new com.mozu.api.contracts.reference.CurrencyCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getCurrencies( responseFields);
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

	public static com.mozu.api.contracts.reference.TimeZoneCollection getTimeZones(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getTimeZones(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.TimeZoneCollection getTimeZones(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.TimeZoneCollection returnObj = new com.mozu.api.contracts.reference.TimeZoneCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getTimeZones( responseFields);
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

	public static com.mozu.api.contracts.reference.TopLevelDomainCollection getTopLevelDomains(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getTopLevelDomains(apiContext,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.TopLevelDomainCollection getTopLevelDomains(ApiContext apiContext, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.TopLevelDomainCollection returnObj = new com.mozu.api.contracts.reference.TopLevelDomainCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getTopLevelDomains( responseFields);
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

	public static com.mozu.api.contracts.reference.UnitOfMeasureCollection getUnitsOfMeasure(ApiContext apiContext, int expectedCode) throws Exception
	{
		return getUnitsOfMeasure(apiContext,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.reference.UnitOfMeasureCollection getUnitsOfMeasure(ApiContext apiContext, String filter, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.reference.UnitOfMeasureCollection returnObj = new com.mozu.api.contracts.reference.UnitOfMeasureCollection();
		ReferenceDataResource resource = new ReferenceDataResource(apiContext);
		try
		{
			returnObj = resource.getUnitsOfMeasure( filter,  responseFields);
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



