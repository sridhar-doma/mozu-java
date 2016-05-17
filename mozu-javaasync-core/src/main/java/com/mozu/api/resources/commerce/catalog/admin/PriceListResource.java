/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

import com.mozu.api.ApiContext;
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
 * 
 * </summary>
 */
public class PriceListResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PriceListResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceListCollection priceListCollection = pricelist.getPriceLists();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListCollection getPriceLists() throws Exception
	{
		return getPriceLists( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceLists( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public CountDownLatch getPriceListsAsync( AsyncCallback<com.mozu.api.contracts.productadmin.PriceListCollection> callback) throws Exception
	{
		return getPriceListsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceListCollection priceListCollection = pricelist.getPriceLists( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListCollection getPriceLists(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceLists( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public CountDownLatch getPriceListsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.getPriceList( priceListCode);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList getPriceList(String priceListCode) throws Exception
	{
		return getPriceList( priceListCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceList( priceListCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch getPriceListAsync(String priceListCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		return getPriceListAsync( priceListCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.getPriceList( priceListCode,  responseFields);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList getPriceList(String priceListCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListClient( priceListCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.getPriceList( priceListCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch getPriceListAsync(String priceListCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.getPriceListClient( priceListCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.addPriceList( priceList);
	 * </code></pre></p>
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList addPriceList(com.mozu.api.contracts.productadmin.PriceList priceList) throws Exception
	{
		return addPriceList( priceList,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.addPriceList( priceList, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch addPriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		return addPriceListAsync( priceList,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.addPriceList( priceList,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList addPriceList(com.mozu.api.contracts.productadmin.PriceList priceList, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.addPriceListClient( priceList,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.addPriceList( priceList,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch addPriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.addPriceListClient( priceList,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.updatePriceList( priceList,  priceListCode);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList updatePriceList(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode) throws Exception
	{
		return updatePriceList( priceList,  priceListCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.updatePriceList( priceList,  priceListCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch updatePriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		return updatePriceListAsync( priceList,  priceListCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	PriceList priceList = pricelist.updatePriceList( priceList,  priceListCode,  responseFields);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields 
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public com.mozu.api.contracts.productadmin.PriceList updatePriceList(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.updatePriceListClient( priceList,  priceListCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	CountDownLatch latch = pricelist.updatePriceList( priceList,  priceListCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceList 
	 * @return com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public CountDownLatch updatePriceListAsync(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceList> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.updatePriceListClient( priceList,  priceListCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	pricelist.deletePriceList( priceListCode);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @return 
	 */
	public void deletePriceList(String priceListCode) throws Exception
	{
		deletePriceList( priceListCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceList pricelist = new PriceList();
	 *	pricelist.deletePriceList( priceListCode,  cascadeDeleteEntries);
	 * </code></pre></p>
	 * @param cascadeDeleteEntries 
	 * @param priceListCode 
	 * @return 
	 */
	public void deletePriceList(String priceListCode, Boolean cascadeDeleteEntries) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.PriceListClient.deletePriceListClient( priceListCode,  cascadeDeleteEntries);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



