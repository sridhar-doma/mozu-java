/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content.documentlists;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the facets subresource to allow a merchant to add information for product indexing and searching.
 * </summary>
 */
public class FacetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public FacetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the properties of facets that aid in indexing and searching.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	Facet facet = facet.getFacets( documentListName,  propertyName);
	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param propertyName The property name associated with the facets to retrieve.
	 * @return List<com.mozu.api.contracts.content.Facet>
	 * @see com.mozu.api.contracts.content.Facet
	 */
	public List<com.mozu.api.contracts.content.Facet> getFacets(String documentListName, String propertyName) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.content.Facet>> client = com.mozu.api.clients.content.documentlists.FacetClient.getFacetsClient( documentListName,  propertyName);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the properties of facets that aid in indexing and searching.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	CountDownLatch latch = facet.getFacets( documentListName,  propertyName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param documentListName Name of content documentListName to delete
	 * @param propertyName The property name associated with the facets to retrieve.
	 * @param  callback callback handler for asynchronous operations
	 * @return List<com.mozu.api.contracts.content.Facet>
	 * @see com.mozu.api.contracts.content.Facet
	 */
	public CountDownLatch getFacetsAsync(String documentListName, String propertyName, AsyncCallback<List<com.mozu.api.contracts.content.Facet>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.content.Facet>> client = com.mozu.api.clients.content.documentlists.FacetClient.getFacetsClient( documentListName,  propertyName);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



