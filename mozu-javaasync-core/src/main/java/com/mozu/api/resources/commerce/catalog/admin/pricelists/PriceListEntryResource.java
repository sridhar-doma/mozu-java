/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin.pricelists;

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
public class PriceListEntryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PriceListEntryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.getPriceListEntry( priceListCode,  productCode,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry getPriceListEntry(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return getPriceListEntry( priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.getPriceListEntry( priceListCode,  productCode,  currencyCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public CountDownLatch getPriceListEntryAsync(String priceListCode, String productCode, String currencyCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntry> callback) throws Exception
	{
		return getPriceListEntryAsync( priceListCode,  productCode,  currencyCode,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.getPriceListEntry( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param startDate 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry getPriceListEntry(String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.getPriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.getPriceListEntry( priceListCode,  productCode,  currencyCode,  startDate,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param startDate 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public CountDownLatch getPriceListEntryAsync(String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntry> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.getPriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntryCollection priceListEntryCollection = pricelistentry.getPriceListEntries( priceListCode);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntryCollection getPriceListEntries(String priceListCode) throws Exception
	{
		return getPriceListEntries( priceListCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.getPriceListEntries( priceListCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public CountDownLatch getPriceListEntriesAsync(String priceListCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntryCollection> callback) throws Exception
	{
		return getPriceListEntriesAsync( priceListCode,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntryCollection priceListEntryCollection = pricelistentry.getPriceListEntries( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param priceListCode 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntryCollection getPriceListEntries(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.getPriceListEntriesClient( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.getPriceListEntries( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param priceListCode 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public CountDownLatch getPriceListEntriesAsync(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntryCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.getPriceListEntriesClient( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.addPriceListEntry( priceListEntryIn,  priceListCode);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry addPriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode) throws Exception
	{
		return addPriceListEntry( priceListEntryIn,  priceListCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.addPriceListEntry( priceListEntryIn,  priceListCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public CountDownLatch addPriceListEntryAsync(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntry> callback) throws Exception
	{
		return addPriceListEntryAsync( priceListEntryIn,  priceListCode,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.addPriceListEntry( priceListEntryIn,  priceListCode,  responseFields);
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields 
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry addPriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.addPriceListEntryClient( priceListEntryIn,  priceListCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.addPriceListEntry( priceListEntryIn,  priceListCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public CountDownLatch addPriceListEntryAsync(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntry> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.addPriceListEntryClient( priceListEntryIn,  priceListCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry updatePriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public CountDownLatch updatePriceListEntryAsync(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntry> callback) throws Exception
	{
		return updatePriceListEntryAsync( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	PriceListEntry priceListEntry = pricelistentry.updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param startDate 
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public com.mozu.api.contracts.productadmin.PriceListEntry updatePriceListEntry(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.updatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	CountDownLatch latch = pricelistentry.updatePriceListEntry( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param startDate 
	 * @param  callback callback handler for asynchronous operations
	 * @param priceListEntryIn 
	 * @return com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public CountDownLatch updatePriceListEntryAsync(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.PriceListEntry> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.updatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	pricelistentry.deletePriceListEntry( priceListCode,  productCode,  currencyCode);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @return 
	 */
	public void deletePriceListEntry(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		deletePriceListEntry( priceListCode,  productCode,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	PriceListEntry pricelistentry = new PriceListEntry();
	 *	pricelistentry.deletePriceListEntry( priceListCode,  productCode,  currencyCode,  startDate);
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param startDate 
	 * @return 
	 */
	public void deletePriceListEntry(String priceListCode, String productCode, String currencyCode, DateTime startDate) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.pricelists.PriceListEntryClient.deletePriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



