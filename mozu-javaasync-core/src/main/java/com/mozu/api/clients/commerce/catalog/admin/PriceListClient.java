/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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
 * Allows you to create and manage products that you will offer on your storefront. You can create products with options that a shopper configures (such as a T-shirt color and size). You can set discounts and sale prices for your products, manage product inventory, and more.
 * </summary>
 */
public class PriceListClient {
	
	/**
	 * admin-pricelists Get GetPriceLists description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> mozuClient=GetPriceListsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListCollection priceListCollection = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListCollection>
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> getPriceListsClient() throws Exception
	{
		return getPriceListsClient( null,  null,  null,  null,  null);
	}

	/**
	 * admin-pricelists Get GetPriceLists description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> mozuClient=GetPriceListsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceListCollection priceListCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceListCollection>
	 * @see com.mozu.api.contracts.productadmin.PriceListCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> getPriceListsClient(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PriceListUrl.getPriceListsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceListCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceListCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * admin-pricelists Get GetPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient=GetPriceListClient( priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceList>
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceList> getPriceListClient(String priceListCode) throws Exception
	{
		return getPriceListClient( priceListCode,  null);
	}

	/**
	 * admin-pricelists Get GetPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient=GetPriceListClient( priceListCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceList>
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceList> getPriceListClient(String priceListCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PriceListUrl.getPriceListUrl(priceListCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceList.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * admin-pricelists Post AddPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient=AddPriceListClient( priceList);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceList>
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceList> addPriceListClient(com.mozu.api.contracts.productadmin.PriceList priceList) throws Exception
	{
		return addPriceListClient( priceList,  null);
	}

	/**
	 * admin-pricelists Post AddPriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient=AddPriceListClient( priceList,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceList>
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceList> addPriceListClient(com.mozu.api.contracts.productadmin.PriceList priceList, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PriceListUrl.addPriceListUrl(responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceList.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceList);
		return mozuClient;

	}

	/**
	 * admin-pricelists Put UpdatePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient=UpdatePriceListClient( priceList,  priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceList>
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceList> updatePriceListClient(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode) throws Exception
	{
		return updatePriceListClient( priceList,  priceListCode,  null);
	}

	/**
	 * admin-pricelists Put UpdatePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient=UpdatePriceListClient( priceList,  priceListCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * PriceList priceList = client.Result();
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param priceList Mozu.ProductAdmin.Contracts.PriceList ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.PriceList>
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 * @see com.mozu.api.contracts.productadmin.PriceList
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.PriceList> updatePriceListClient(com.mozu.api.contracts.productadmin.PriceList priceList, String priceListCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PriceListUrl.updatePriceListUrl(priceListCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.PriceList.class;
		MozuClient<com.mozu.api.contracts.productadmin.PriceList> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.PriceList>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(priceList);
		return mozuClient;

	}

	/**
	 * admin-pricelists Delete DeletePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePriceListClient( priceListCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePriceListClient(String priceListCode) throws Exception
	{
		return deletePriceListClient( priceListCode,  null);
	}

	/**
	 * admin-pricelists Delete DeletePriceList description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePriceListClient( priceListCode,  cascadeDeleteEntries);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cascadeDeleteEntries Specifies whether to deletes all price list entries associated with the price list.
	 * @param priceListCode The unique, user-defined code of the price list.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePriceListClient(String priceListCode, Boolean cascadeDeleteEntries) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.PriceListUrl.deletePriceListUrl(cascadeDeleteEntries, priceListCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



