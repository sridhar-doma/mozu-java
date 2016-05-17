/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.pricelists;

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
public class PriceListEntryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=GetPriceListEntryClient( priceListCode,  productCode,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> getPriceListEntryClient(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return getPriceListEntryClient( priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=GetPriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param startDate 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> getPriceListEntryClient(String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.getPriceListEntryUrl(currencyCode, priceListCode, productCode, responseFields, startDate);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntry.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> mozuClient=GetPriceListEntriesClient( priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntryCollection priceListEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param priceListCode 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntryCollection>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> getPriceListEntriesClient(String priceListCode) throws Exception
	{
		return getPriceListEntriesClient( priceListCode,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> mozuClient=GetPriceListEntriesClient( priceListCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntryCollection priceListEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param filter 
	 * @param pageSize 
	 * @param priceListCode 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntryCollection>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> getPriceListEntriesClient(String priceListCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.getPriceListEntriesUrl(filter, pageSize, priceListCode, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntryCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=AddPriceListEntryClient( priceListEntryIn,  priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param priceListEntryIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> addPriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode) throws Exception
	{
		return addPriceListEntryClient( priceListEntryIn,  priceListCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=AddPriceListEntryClient( priceListEntryIn,  priceListCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param priceListCode 
	 * @param responseFields 
	 * @param priceListEntryIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> addPriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.addPriceListEntryUrl(priceListCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntry.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceListEntryIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=UpdatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param priceListEntryIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> updatePriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return updatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient=UpdatePriceListEntryClient( priceListEntryIn,  priceListCode,  productCode,  currencyCode,  startDate,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListEntry priceListEntry = client.Result();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param responseFields 
	 * @param startDate 
	 * @param priceListEntryIn 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListEntry>
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 * @see com.mozu.api.contracts.productadmin.PriceListEntry
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> updatePriceListEntryClient(com.mozu.api.contracts.productadmin.PriceListEntry priceListEntryIn, String priceListCode, String productCode, String currencyCode, DateTime startDate, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.updatePriceListEntryUrl(currencyCode, priceListCode, productCode, responseFields, startDate);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListEntry.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListEntry>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceListEntryIn);
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePriceListEntryClient( priceListCode,  productCode,  currencyCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePriceListEntryClient(String priceListCode, String productCode, String currencyCode) throws Exception
	{
		return deletePriceListEntryClient( priceListCode,  productCode,  currencyCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePriceListEntryClient( priceListCode,  productCode,  currencyCode,  startDate);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param currencyCode 
	 * @param priceListCode 
	 * @param productCode 
	 * @param startDate 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePriceListEntryClient(String priceListCode, String productCode, String currencyCode, DateTime startDate) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.pricelists.PriceListEntryUrl.deletePriceListEntryUrl(currencyCode, priceListCode, productCode, startDate);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



