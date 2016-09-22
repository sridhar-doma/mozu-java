/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.customer.accounts;

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
 * commerce/customer/accounts/auditLog related resources. DOCUMENT_HERE 
 * </summary>
 */
public class CustomerAuditEntryClient {
	
	/**
	 * accounts-auditLog Get GetAccountAuditLog description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> mozuClient=GetAccountAuditLogClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuditEntryCollection customerAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuditEntryCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAuditEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> getAccountAuditLogClient(Integer accountId) throws Exception
	{
		return getAccountAuditLogClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * accounts-auditLog Get GetAccountAuditLog description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> mozuClient=GetAccountAuditLogClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuditEntryCollection customerAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId Unique identifier of the customer account.
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/applications/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuditEntryCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAuditEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> getAccountAuditLogClient(Integer accountId, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.customer.accounts.CustomerAuditEntryUrl.getAccountAuditLogUrl(accountId, filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.customer.CustomerAuditEntryCollection.class;
		MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> mozuClient = (MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



