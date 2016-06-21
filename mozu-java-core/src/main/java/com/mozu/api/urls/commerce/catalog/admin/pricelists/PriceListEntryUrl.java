/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.catalog.admin.pricelists;

import org.joda.time.DateTime;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class PriceListEntryUrl
{

	/**
	 * Get Resource Url for GetPriceListEntry
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startDate The start date of the price list entry.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPriceListEntryUrl(String currencyCode, String priceListCode, String productCode, String responseFields, DateTime startDate)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode}?startDate={startDate}&responseFields={responseFields}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("priceListCode", priceListCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startDate", startDate);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for GetPriceListEntries
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return   String Resource Url
	 */
	public static MozuUrl getPriceListEntriesUrl(String filter, Integer pageSize, String priceListCode, String responseFields, String sortBy, Integer startIndex)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}/entries?startIndex={startIndex}&pageSize={pageSize}&sortBy={sortBy}&filter={filter}&responseFields={responseFields}");
		formatter.formatUrl("filter", filter);
		formatter.formatUrl("pageSize", pageSize);
		formatter.formatUrl("priceListCode", priceListCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("sortBy", sortBy);
		formatter.formatUrl("startIndex", startIndex);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for AddPriceListEntry
	 * @param priceListCode The specified price list to which you want to add the price list entry.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return   String Resource Url
	 */
	public static MozuUrl addPriceListEntryUrl(String priceListCode, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}/entries?responseFields={responseFields}");
		formatter.formatUrl("priceListCode", priceListCode);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdatePriceListEntry
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The unique code of the price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param startDate The start date of the price list entry.
	 * @return   String Resource Url
	 */
	public static MozuUrl updatePriceListEntryUrl(String currencyCode, String priceListCode, String productCode, String responseFields, DateTime startDate)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode}?startDate={startDate}&responseFields={responseFields}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("priceListCode", priceListCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("startDate", startDate);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for DeletePriceListEntry
	 * @param currencyCode The three character ISO currency code, such as USD for US Dollars.
	 * @param priceListCode The code of the specified price list associated with the price list entry.
	 * @param productCode The unique, user-defined product code of a product, used throughout Mozu to reference and associate to a product.
	 * @param startDate The start date of the price list entry.
	 * @return   String Resource Url
	 */
	public static MozuUrl deletePriceListEntryUrl(String currencyCode, String priceListCode, String productCode, DateTime startDate)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/catalog/admin/pricelists/{priceListCode}/entries/{productCode}/{currencyCode}?startDate={startDate}");
		formatter.formatUrl("currencyCode", currencyCode);
		formatter.formatUrl("priceListCode", priceListCode);
		formatter.formatUrl("productCode", productCode);
		formatter.formatUrl("startDate", startDate);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

