/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Location resource to retrieve details about a location from a Mozu hosted storefront.
 * </summary>
 */
public class LocationClient {
	
	/**
	 * Retrieves the details of the location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that identifies the location.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String code) throws Exception
	{
		return getLocationClient( code,  null);
	}

	/**
	 * Retrieves the details of the location specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetLocationClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param code User-defined code that identifies the location.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getLocationClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getLocationUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = (MozuClient<com.mozu.api.contracts.location.Location>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of the locations configured for a specified location usage type for the specified site, according to any defined filter or sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsInUsageTypeClient( locationUsageType);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param locationUsageType System-defined location usage type code, which is DS for direct ship, SP for in-store pickup, or storeFinder.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsInUsageTypeClient(String locationUsageType) throws Exception
	{
		return getLocationsInUsageTypeClient( locationUsageType,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the locations configured for a specified location usage type for the specified site, according to any defined filter or sort criteria.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetLocationsInUsageTypeClient( locationUsageType,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param locationUsageType System-defined location usage type code, which is DS for direct ship, SP for in-store pickup, or storeFinder.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getLocationsInUsageTypeClient(String locationUsageType, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getLocationsInUsageTypeUrl(filter, locationUsageType, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the location configured for the direct shipping (DS) location usage type for the site specified in the request. This location acts as an origin address from which order packages will ship, as well as the location where product reservations are created when order items are submitted with the direct ship fulfillment type (DS). If the direct ship location usage type is not configured for this site, the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetDirectShipLocationClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getDirectShipLocationClient() throws Exception
	{
		return getDirectShipLocationClient( null);
	}

	/**
	 * Retrieves the details of the location configured for the direct shipping (DS) location usage type for the site specified in the request. This location acts as an origin address from which order packages will ship, as well as the location where product reservations are created when order items are submitted with the direct ship fulfillment type (DS). If the direct ship location usage type is not configured for this site, the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetDirectShipLocationClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getDirectShipLocationClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getDirectShipLocationUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = (MozuClient<com.mozu.api.contracts.location.Location>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves the details of the location configured for the in-store pickup (SP) location usage type for the site specified in the request. If the location is not associated with a location type configured for the in-store pickup location usage type (SP), the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetInStorePickupLocationClient( code);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param code The user-defined code that identifies the location to retrieve.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getInStorePickupLocationClient(String code) throws Exception
	{
		return getInStorePickupLocationClient( code,  null);
	}

	/**
	 * Retrieves the details of the location configured for the in-store pickup (SP) location usage type for the site specified in the request. If the location is not associated with a location type configured for the in-store pickup location usage type (SP), the operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.Location> mozuClient=GetInStorePickupLocationClient( code,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Location location = client.Result();
	 * </code></pre></p>
	 * @param code The user-defined code that identifies the location to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.Location>
	 * @see com.mozu.api.contracts.location.Location
	 */
	public static MozuClient<com.mozu.api.contracts.location.Location> getInStorePickupLocationClient(String code, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getInStorePickupLocationUrl(code, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.Location.class;
		MozuClient<com.mozu.api.contracts.location.Location> mozuClient = (MozuClient<com.mozu.api.contracts.location.Location>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Retrieves a list of locations valid for in-store pickup of an item in an order according to any filter and sort criteria. For example, an application could use this operation to provide a store finder feature based on the shopper's GPS coordinates. If the location types for the in-store pickup location usage type are not configured for the site, this operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetInStorePickupLocationsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getInStorePickupLocationsClient() throws Exception
	{
		return getInStorePickupLocationsClient( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of locations valid for in-store pickup of an item in an order according to any filter and sort criteria. For example, an application could use this operation to provide a store finder feature based on the shopper's GPS coordinates. If the location types for the in-store pickup location usage type are not configured for the site, this operation returns an error.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient=GetInStorePickupLocationsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * LocationCollection locationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.location.LocationCollection>
	 * @see com.mozu.api.contracts.location.LocationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.location.LocationCollection> getInStorePickupLocationsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.LocationUrl.getInStorePickupLocationsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.location.LocationCollection.class;
		MozuClient<com.mozu.api.contracts.location.LocationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.location.LocationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



