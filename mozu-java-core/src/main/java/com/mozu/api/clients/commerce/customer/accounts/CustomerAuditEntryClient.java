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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * 
 * </summary>
 */
public class CustomerAuditEntryClient {
	
	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> mozuClient=GetAccountAuditLogClient( accountId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuditEntryCollection customerAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.customer.CustomerAuditEntryCollection>
	 * @see com.mozu.api.contracts.customer.CustomerAuditEntryCollection
	 */
	public static MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> getAccountAuditLogClient(Integer accountId) throws Exception
	{
		return getAccountAuditLogClient( accountId,  null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.customer.CustomerAuditEntryCollection> mozuClient=GetAccountAuditLogClient( accountId,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * CustomerAuditEntryCollection customerAuditEntryCollection = client.Result();
	 * </code></pre></p>
	 * @param accountId 
	 * @param filter 
	 * @param pageSize 
	 * @param responseFields 
	 * @param sortBy 
	 * @param startIndex 
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



