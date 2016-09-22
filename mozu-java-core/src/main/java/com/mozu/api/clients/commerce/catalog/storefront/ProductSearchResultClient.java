/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.storefront;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Product Search resource to provide dynamic search results to shoppers as they browse and search for products on the web storefront, and to suggest possible search terms as the shopper enters text.
 * </summary>
 */
public class ProductSearchResultClient {
	
	/**
	 * Searches the categories displayed on the web storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchResult productSearchResult = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient() throws Exception
	{
		return searchClient( null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null,  null);
	}

	/**
	 * Searches the categories displayed on the web storefront for products or product options that the shopper types in a search query.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient=SearchClient( query,  filter,  facetTemplate,  facetTemplateSubset,  facet,  facetFieldRangeQuery,  facetHierPrefix,  facetHierValue,  facetHierDepth,  facetStartIndex,  facetPageSize,  facetSettings,  facetValueFilter,  sortBy,  pageSize,  startIndex,  searchSettings,  enableSearchTuningRules,  searchTuningRuleContext,  searchTuningRuleCode,  facetTemplateExclude,  facetPrefix,  responseOptions,  cursorMark,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductSearchResult productSearchResult = client.Result();
	 * </code></pre></p>
	 * @param cursorMark 
	 * @param enableSearchTuningRules Enables search tuning rules on your site.
	 * @param facet Individually list the facet fields you want to display in a web storefront product search.
	 * @param facetFieldRangeQuery Display a range facet not specified in a template in a web storefront product search by listing the facet field and the range to display.
	 * @param facetHierDepth If filtering using category facets in a hierarchy, the number of category hierarchy levels to return for the facet. This option is only available for category facets.
	 * @param facetHierPrefix If filtering using category facets in a hierarchy, the parent categories you want to skip in the storefront product search. This parameter is only available for category facets.
	 * @param facetHierValue If filtering using category facets in a hierarchy, the category in the hierarchy to begin faceting on. This parameter is only available for category facets.
	 * @param facetPageSize The number of facet values to return for one or more facets.
	 * @param facetPrefix Use this parameter to filter facet values that are returned by an associated search result by a prefix.For example, to filter on colors that start with b, such as blue, black, or brown you can specify the following:
	 * @param facetSettings Settings reserved for future facet search functionality on a web storefront product search.
	 * @param facetStartIndex When paging through multiple facets, the startIndex value for each facet.
	 * @param facetTemplate The facet template to use on the storefront. A template displays all facets associated with the template on the web storefront product search. Currently, only category-level facet templates are available.
	 * @param facetTemplateExclude A comma-separated list of the facets to exclude from the facetTemplate.
        
	 * @param facetTemplateSubset Display a subset of the facets defined in the template specified in facetTemplate parameter.
	 * @param facetValueFilter The facet values to apply to the filter.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param responseOptions 
	 * @param searchSettings The settings to control product search and indexing behavior.
	 * @param searchTuningRuleCode The unique identifier of the search tuning rule.
	 * @param searchTuningRuleContext The category ID that the search tuning rule applies to.
	 * @param sortBy 
	 * @param startIndex 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.ProductSearchResult>
	 * @see com.mozu.api.contracts.productruntime.ProductSearchResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> searchClient(String query, String filter, String facetTemplate, String facetTemplateSubset, String facet, String facetFieldRangeQuery, String facetHierPrefix, String facetHierValue, String facetHierDepth, String facetStartIndex, String facetPageSize, String facetSettings, String facetValueFilter, String sortBy, Integer pageSize, Integer startIndex, String searchSettings, Boolean enableSearchTuningRules, String searchTuningRuleContext, String searchTuningRuleCode, String facetTemplateExclude, String facetPrefix, String responseOptions, String cursorMark, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.searchUrl(cursorMark, enableSearchTuningRules, facet, facetFieldRangeQuery, facetHierDepth, facetHierPrefix, facetHierValue, facetPageSize, facetPrefix, facetSettings, facetStartIndex, facetTemplate, facetTemplateExclude, facetTemplateSubset, facetValueFilter, filter, pageSize, query, responseFields, responseOptions, searchSettings, searchTuningRuleCode, searchTuningRuleContext, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.ProductSearchResult.class;
		MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.ProductSearchResult>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient=SuggestClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSuggestionResult searchSuggestionResult = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestionResult>
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> suggestClient() throws Exception
	{
		return suggestClient( null,  null,  null,  null);
	}

	/**
	 * Suggests possible search terms as the shopper enters search text.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient=SuggestClient( query,  groups,  pageSize,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SearchSuggestionResult searchSuggestionResult = client.Result();
	 * </code></pre></p>
	 * @param groups 
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param query Properties for the product location inventory provided for queries to locate products by their location.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productruntime.SearchSuggestionResult>
	 * @see com.mozu.api.contracts.productruntime.SearchSuggestionResult
	 */
	public static MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> suggestClient(String query, String groups, Integer pageSize, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.storefront.ProductSearchResultUrl.suggestUrl(groups, pageSize, query, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productruntime.SearchSuggestionResult.class;
		MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult> mozuClient = (MozuClient<com.mozu.api.contracts.productruntime.SearchSuggestionResult>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



