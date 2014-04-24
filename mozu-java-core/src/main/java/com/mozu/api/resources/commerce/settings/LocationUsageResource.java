/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.settings;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Location Usages resource to define the locations and location types that interact with the specified site. The system creates three default location usage types for each site after provisioning a new tenant - one for direct ship (DS), one for in-store pickup (SP), and one for store finder (storeFinder). Each site can only use a single location for the direct ship location usage type, and the location must support the direct ship fulfillment type (DS). For the in-store pickup location usage type, each site can use one or more location types. The location service identifies all locations of the specified type that support the in-store pickup fulfillment type (SP). For the store finder location usage type, each site can use one or more location types. The location service identifies all locations of the type. Locations configured for the store finder type do not typically maintain inventory. You cannot create additional location usage types at this time.
 * </summary>
 */
public class LocationUsageResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public LocationUsageResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves the configured site location usages for the location usage code specified in the request.
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsageCollection locationUsageCollection = locationusage.GetLocationUsages();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.location.LocationUsageCollection
	 * @see com.mozu.api.contracts.location.LocationUsageCollection
	 */
	public com.mozu.api.contracts.location.LocationUsageCollection getLocationUsages() throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationUsageCollection> client = com.mozu.api.clients.commerce.settings.LocationUsageClient.getLocationUsagesClient();
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the location usages for the site specified in the request header.
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsage locationUsage = locationusage.GetLocationUsage( code);
	 * </code></pre></p>
	 * @param code Code that identifies the location usage type, which is "DS" for direct ship, "SP" for in-store pickup, or "storeFinder" for store finder.
	 * @return com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public com.mozu.api.contracts.location.LocationUsage getLocationUsage(String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationUsage> client = com.mozu.api.clients.commerce.settings.LocationUsageClient.getLocationUsageClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the location usage for the site based on the location usage code specified in the request.
	 * <p><pre><code>
	 *	LocationUsage locationusage = new LocationUsage();
	 *	LocationUsage locationUsage = locationusage.UpdateLocationUsage( usage,  code);
	 * </code></pre></p>
	 * @param code Code that identifies the location usage type, which is "DS" for direct ship, "SP" for in-store pickup, or "storeFinder" for store finder.
	 * @param usage Properties of the location usage type to update.
	 * @return com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 * @see com.mozu.api.contracts.location.LocationUsage
	 */
	public com.mozu.api.contracts.location.LocationUsage updateLocationUsage(com.mozu.api.contracts.location.LocationUsage usage, String code) throws Exception
	{
		MozuClient<com.mozu.api.contracts.location.LocationUsage> client = com.mozu.api.clients.commerce.settings.LocationUsageClient.updateLocationUsageClient( usage,  code);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


