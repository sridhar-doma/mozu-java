/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * The Reference resource retrieves collections of standards the Mozu system currently supports. This includes content locales, top-level domains, units of measure, countries, currencies, time zones, and shipping or billing address schemas.
 * </summary>
 */
public class ReferenceDataResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ReferenceDataResource() 
		{
			_apiContext = null;
	}
public ReferenceDataResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a specific address schema based on the country code provided. This operation allows the creation of custom shipping and billing address fields.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	AddressSchema addressSchema = referencedata.getAddressSchema();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.AddressSchema
	 * @see com.mozu.api.contracts.reference.AddressSchema
	 */
	public com.mozu.api.contracts.reference.AddressSchema getAddressSchema() throws Exception
	{
		return getAddressSchema( null,  null);
	}

	/**
	 * Retrieves a specific address schema based on the country code provided. This operation allows the creation of custom shipping and billing address fields.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	AddressSchema addressSchema = referencedata.getAddressSchema( countryCode,  responseFields);
	 * </code></pre></p>
	 * @param countryCode The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.AddressSchema
	 * @see com.mozu.api.contracts.reference.AddressSchema
	 */
	public com.mozu.api.contracts.reference.AddressSchema getAddressSchema(String countryCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.AddressSchema> client = com.mozu.api.clients.platform.ReferenceDataClient.getAddressSchemaClient( countryCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of address schemas that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	AddressSchemaCollection addressSchemaCollection = referencedata.getAddressSchemas();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.AddressSchemaCollection
	 * @see com.mozu.api.contracts.reference.AddressSchemaCollection
	 */
	public com.mozu.api.contracts.reference.AddressSchemaCollection getAddressSchemas() throws Exception
	{
		return getAddressSchemas( null);
	}

	/**
	 * Retrieves the entire list of address schemas that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	AddressSchemaCollection addressSchemaCollection = referencedata.getAddressSchemas( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.AddressSchemaCollection
	 * @see com.mozu.api.contracts.reference.AddressSchemaCollection
	 */
	public com.mozu.api.contracts.reference.AddressSchemaCollection getAddressSchemas(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.AddressSchemaCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getAddressSchemasClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a behavior based on the behavior ID specified in the request.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	Behavior behavior = referencedata.getBehavior( behaviorId);
	 * </code></pre></p>
	 * @param behaviorId Unique identifier of the behavior.
	 * @return com.mozu.api.contracts.core.Behavior
	 * @see com.mozu.api.contracts.core.Behavior
	 */
	public com.mozu.api.contracts.core.Behavior getBehavior(Integer behaviorId) throws Exception
	{
		return getBehavior( behaviorId,  null);
	}

	/**
	 * Retrieves the details of a behavior based on the behavior ID specified in the request.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	Behavior behavior = referencedata.getBehavior( behaviorId,  responseFields);
	 * </code></pre></p>
	 * @param behaviorId Unique identifier of the behavior.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.core.Behavior
	 * @see com.mozu.api.contracts.core.Behavior
	 */
	public com.mozu.api.contracts.core.Behavior getBehavior(Integer behaviorId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.Behavior> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorClient( behaviorId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of the behavior category specified in the request.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCategory behaviorCategory = referencedata.getBehaviorCategory( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @return com.mozu.api.contracts.core.BehaviorCategory
	 * @see com.mozu.api.contracts.core.BehaviorCategory
	 */
	public com.mozu.api.contracts.core.BehaviorCategory getBehaviorCategory(Integer categoryId) throws Exception
	{
		return getBehaviorCategory( categoryId,  null);
	}

	/**
	 * Retrieves the details of the behavior category specified in the request.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCategory behaviorCategory = referencedata.getBehaviorCategory( categoryId,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.core.BehaviorCategory
	 * @see com.mozu.api.contracts.core.BehaviorCategory
	 */
	public com.mozu.api.contracts.core.BehaviorCategory getBehaviorCategory(Integer categoryId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.BehaviorCategory> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorCategoryClient( categoryId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of behavior categories.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCategoryCollection behaviorCategoryCollection = referencedata.getBehaviorCategories();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.BehaviorCategoryCollection
	 * @see com.mozu.api.contracts.core.BehaviorCategoryCollection
	 */
	public com.mozu.api.contracts.core.BehaviorCategoryCollection getBehaviorCategories() throws Exception
	{
		return getBehaviorCategories( null);
	}

	/**
	 * Retrieves the list of behavior categories.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCategoryCollection behaviorCategoryCollection = referencedata.getBehaviorCategories( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.core.BehaviorCategoryCollection
	 * @see com.mozu.api.contracts.core.BehaviorCategoryCollection
	 */
	public com.mozu.api.contracts.core.BehaviorCategoryCollection getBehaviorCategories(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.BehaviorCategoryCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorCategoriesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of application behaviors.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCollection behaviorCollection = referencedata.getBehaviors();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.core.BehaviorCollection
	 * @see com.mozu.api.contracts.core.BehaviorCollection
	 */
	public com.mozu.api.contracts.core.BehaviorCollection getBehaviors() throws Exception
	{
		return getBehaviors( null,  null);
	}

	/**
	 * Retrieves a list of application behaviors.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	BehaviorCollection behaviorCollection = referencedata.getBehaviors( userType,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param userType The user type associated with the behaviors to retrieve.
	 * @return com.mozu.api.contracts.core.BehaviorCollection
	 * @see com.mozu.api.contracts.core.BehaviorCollection
	 */
	public com.mozu.api.contracts.core.BehaviorCollection getBehaviors(String userType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.core.BehaviorCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getBehaviorsClient( userType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of content locales the system supports. Content locales indicate the language used and the country where the language is used.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	ContentLocaleCollection contentLocaleCollection = referencedata.getContentLocales();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.ContentLocaleCollection
	 * @see com.mozu.api.contracts.reference.ContentLocaleCollection
	 */
	public com.mozu.api.contracts.reference.ContentLocaleCollection getContentLocales() throws Exception
	{
		return getContentLocales( null);
	}

	/**
	 * Retrieves the list of content locales the system supports. Content locales indicate the language used and the country where the language is used.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	ContentLocaleCollection contentLocaleCollection = referencedata.getContentLocales( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.ContentLocaleCollection
	 * @see com.mozu.api.contracts.reference.ContentLocaleCollection
	 */
	public com.mozu.api.contracts.reference.ContentLocaleCollection getContentLocales(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.ContentLocaleCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getContentLocalesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of countries that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CountryCollection countryCollection = referencedata.getCountries();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.CountryCollection
	 * @see com.mozu.api.contracts.reference.CountryCollection
	 */
	public com.mozu.api.contracts.reference.CountryCollection getCountries() throws Exception
	{
		return getCountries( null);
	}

	/**
	 * Retrieves the entire list of countries that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CountryCollection countryCollection = referencedata.getCountries( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.CountryCollection
	 * @see com.mozu.api.contracts.reference.CountryCollection
	 */
	public com.mozu.api.contracts.reference.CountryCollection getCountries(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.CountryCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getCountriesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of countries that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CountryWithStatesCollection countryWithStatesCollection = referencedata.getCountriesWithStates();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.CountryWithStatesCollection
	 * @see com.mozu.api.contracts.reference.CountryWithStatesCollection
	 */
	public com.mozu.api.contracts.reference.CountryWithStatesCollection getCountriesWithStates() throws Exception
	{
		return getCountriesWithStates( null);
	}

	/**
	 * Retrieves the entire list of countries that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CountryWithStatesCollection countryWithStatesCollection = referencedata.getCountriesWithStates( responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.reference.CountryWithStatesCollection
	 * @see com.mozu.api.contracts.reference.CountryWithStatesCollection
	 */
	public com.mozu.api.contracts.reference.CountryWithStatesCollection getCountriesWithStates(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.CountryWithStatesCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getCountriesWithStatesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of currencies that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CurrencyCollection currencyCollection = referencedata.getCurrencies();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.CurrencyCollection
	 * @see com.mozu.api.contracts.reference.CurrencyCollection
	 */
	public com.mozu.api.contracts.reference.CurrencyCollection getCurrencies() throws Exception
	{
		return getCurrencies( null);
	}

	/**
	 * Retrieves the entire list of currencies that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	CurrencyCollection currencyCollection = referencedata.getCurrencies( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.CurrencyCollection
	 * @see com.mozu.api.contracts.reference.CurrencyCollection
	 */
	public com.mozu.api.contracts.reference.CurrencyCollection getCurrencies(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.CurrencyCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getCurrenciesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of time zones that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	TimeZoneCollection timeZoneCollection = referencedata.getTimeZones();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.TimeZoneCollection
	 * @see com.mozu.api.contracts.reference.TimeZoneCollection
	 */
	public com.mozu.api.contracts.reference.TimeZoneCollection getTimeZones() throws Exception
	{
		return getTimeZones( null);
	}

	/**
	 * Retrieves the entire list of time zones that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	TimeZoneCollection timeZoneCollection = referencedata.getTimeZones( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.TimeZoneCollection
	 * @see com.mozu.api.contracts.reference.TimeZoneCollection
	 */
	public com.mozu.api.contracts.reference.TimeZoneCollection getTimeZones(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.TimeZoneCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getTimeZonesClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the entire list of top-level internet domains that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	TopLevelDomainCollection topLevelDomainCollection = referencedata.getTopLevelDomains();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.TopLevelDomainCollection
	 * @see com.mozu.api.contracts.reference.TopLevelDomainCollection
	 */
	public com.mozu.api.contracts.reference.TopLevelDomainCollection getTopLevelDomains() throws Exception
	{
		return getTopLevelDomains( null);
	}

	/**
	 * Retrieves the entire list of top-level internet domains that the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	TopLevelDomainCollection topLevelDomainCollection = referencedata.getTopLevelDomains( responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.TopLevelDomainCollection
	 * @see com.mozu.api.contracts.reference.TopLevelDomainCollection
	 */
	public com.mozu.api.contracts.reference.TopLevelDomainCollection getTopLevelDomains(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.TopLevelDomainCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getTopLevelDomainsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves an array list of all units of measure the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	UnitOfMeasureCollection unitOfMeasureCollection = referencedata.getUnitsOfMeasure();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 * @see com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 */
	public com.mozu.api.contracts.reference.UnitOfMeasureCollection getUnitsOfMeasure() throws Exception
	{
		return getUnitsOfMeasure( null,  null);
	}

	/**
	 * Retrieves an array list of all units of measure the system supports.
	 * <p><pre><code>
	 *	ReferenceData referencedata = new ReferenceData();
	 *	UnitOfMeasureCollection unitOfMeasureCollection = referencedata.getUnitsOfMeasure( filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 * @see com.mozu.api.contracts.reference.UnitOfMeasureCollection
	 */
	public com.mozu.api.contracts.reference.UnitOfMeasureCollection getUnitsOfMeasure(String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.reference.UnitOfMeasureCollection> client = com.mozu.api.clients.platform.ReferenceDataClient.getUnitsOfMeasureClient( filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



