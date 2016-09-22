/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.customer.credits;

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
 * Use the Customer Credit Audit Entries subresource to retrieve entries logged in the audit report of a store credit or gift card applied to a customer account. The system creates a new audit entry when the credit is created, deleted, activated, or deactivated. The system then creates a new audit entry each time the credit is updated or redeemed in a transaction.
 * </summary>
 */
public class CreditAuditEntryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public CreditAuditEntryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves the list of audit entries for the credit, according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	CreditAuditEntry creditauditentry = new CreditAuditEntry();
	 *	CreditAuditEntryCollection creditAuditEntryCollection = creditauditentry.getAuditEntries( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection getAuditEntries(String code) throws Exception
	{
		return getAuditEntries( code,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves the list of audit entries for the credit, according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	CreditAuditEntry creditauditentry = new CreditAuditEntry();
	 *	CountDownLatch latch = creditauditentry.getAuditEntries( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public CountDownLatch getAuditEntriesAsync(String code, AsyncCallback<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> callback) throws Exception
	{
		return getAuditEntriesAsync( code,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves the list of audit entries for the credit, according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	CreditAuditEntry creditauditentry = new CreditAuditEntry();
	 *	CreditAuditEntryCollection creditAuditEntryCollection = creditauditentry.getAuditEntries( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection getAuditEntries(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> client = com.mozu.api.clients.commerce.customer.credits.CreditAuditEntryClient.getAuditEntriesClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the list of audit entries for the credit, according to any filter or sort criteria specified in the request.
	 * <p><pre><code>
	 *	CreditAuditEntry creditauditentry = new CreditAuditEntry();
	 *	CountDownLatch latch = creditauditentry.getAuditEntries( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 * @see com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection
	 */
	public CountDownLatch getAuditEntriesAsync(String code, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.customer.credit.CreditAuditEntryCollection> client = com.mozu.api.clients.commerce.customer.credits.CreditAuditEntryClient.getAuditEntriesClient( code,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



