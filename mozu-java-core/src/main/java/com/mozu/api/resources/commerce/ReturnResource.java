/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Returns resource to manage returned items that were previously fufilled. Returns can include any number of items associated with an original Mozu order. Each return must either be associated with an original order or a product definition to represent each returned item.
 * </summary>
 */
public class ReturnResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ReturnResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of all returns according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnCollection returnCollection = return.getReturns();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnCollection getReturns() throws Exception
	{
		return getReturns( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all returns according to any filter and sort criteria.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnCollection returnCollection = return.getReturns( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnCollection getReturns(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> client = com.mozu.api.clients.commerce.ReturnClient.getReturnsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the actions available to perform for the specified return based on its current state.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	string string = return.getAvailableReturnActions( returnId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return for which to retrieve available actions.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailableReturnActions(String returnId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.ReturnClient.getAvailableReturnActionsClient( returnId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnItem returnItem = return.getReturnItem( returnId,  returnItemId);
	 * </code></pre></p>
	 * @param returnId 
	 * @param returnItemId 
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnItem getReturnItem(String returnId, String returnItemId) throws Exception
	{
		return getReturnItem( returnId,  returnItemId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnItem returnItem = return.getReturnItem( returnId,  returnItemId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId 
	 * @param returnItemId 
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnItem getReturnItem(String returnId, String returnItemId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItem> client = com.mozu.api.clients.commerce.ReturnClient.getReturnItemClient( returnId,  returnItemId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnItemCollection returnItemCollection = return.getReturnItems( returnId);
	 * </code></pre></p>
	 * @param returnId 
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection getReturnItems(String returnId) throws Exception
	{
		return getReturnItems( returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnItemCollection returnItemCollection = return.getReturnItems( returnId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId 
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection getReturnItems(String returnId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnItemCollection> client = com.mozu.api.clients.commerce.ReturnClient.getReturnItemsClient( returnId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the payment actions available to perform for the specified return when a return results in a refund to the customer.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	string string = return.getAvailablePaymentActionsForReturn( returnId,  paymentId);
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the payment for which to perform the action.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailablePaymentActionsForReturn(String returnId, String paymentId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.ReturnClient.getAvailablePaymentActionsForReturnClient( returnId,  paymentId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a payment submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Payment payment = return.getPayment( returnId,  paymentId);
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to retrieve.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return com.mozu.api.contracts.commerceruntime.payments.Payment
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public com.mozu.api.contracts.commerceruntime.payments.Payment getPayment(String returnId, String paymentId) throws Exception
	{
		return getPayment( returnId,  paymentId,  null);
	}

	/**
	 * Retrieves the details of a payment submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Payment payment = return.getPayment( returnId,  paymentId,  responseFields);
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the payment.
	 * @return com.mozu.api.contracts.commerceruntime.payments.Payment
	 * @see com.mozu.api.contracts.commerceruntime.payments.Payment
	 */
	public com.mozu.api.contracts.commerceruntime.payments.Payment getPayment(String returnId, String paymentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.Payment> client = com.mozu.api.clients.commerce.ReturnClient.getPaymentClient( returnId,  paymentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of all payments submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	PaymentCollection paymentCollection = return.getPayments( returnId);
	 * </code></pre></p>
	 * @param returnId Returns the details of the refund payment associated with the return specified in the request.
	 * @return com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public com.mozu.api.contracts.commerceruntime.payments.PaymentCollection getPayments(String returnId) throws Exception
	{
		return getPayments( returnId,  null);
	}

	/**
	 * Retrieves a list of all payments submitted as part of a refund associated with a customer return.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	PaymentCollection paymentCollection = return.getPayments( returnId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Returns the details of the refund payment associated with the return specified in the request.
	 * @return com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentCollection
	 */
	public com.mozu.api.contracts.commerceruntime.payments.PaymentCollection getPayments(String returnId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.payments.PaymentCollection> client = com.mozu.api.clients.commerce.ReturnClient.getPaymentsClient( returnId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of properties for the specified return.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.getReturn( returnId);
	 * </code></pre></p>
	 * @param returnId Returns the properties of the return specified in the request as well as system-supplied information.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return getReturn(String returnId) throws Exception
	{
		return getReturn( returnId,  null);
	}

	/**
	 * Retrieves a list of properties for the specified return.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.getReturn( returnId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Returns the properties of the return specified in the request as well as system-supplied information.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return getReturn(String returnId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.getReturnClient( returnId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReasonCollection reasonCollection = return.getReasons();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReasonCollection getReasons() throws Exception
	{
		return getReasons( null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReasonCollection reasonCollection = return.getReasons( responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReasonCollection
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReasonCollection getReasons(String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReasonCollection> client = com.mozu.api.clients.commerce.ReturnClient.getReasonsClient( responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a return for previously fulfilled items. Each return must either be associated with an original order or a product definition to represent each returned item.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.createReturn( ret);
	 * </code></pre></p>
	 * @param ret Wrapper for the properties of the return to create.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return createReturn(com.mozu.api.contracts.commerceruntime.returns.Return ret) throws Exception
	{
		return createReturn( ret,  null);
	}

	/**
	 * Creates a return for previously fulfilled items. Each return must either be associated with an original order or a product definition to represent each returned item.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.createReturn( ret,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param ret Wrapper for the properties of the return to create.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return createReturn(com.mozu.api.contracts.commerceruntime.returns.Return ret, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.createReturnClient( ret,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.createReturnItem( returnItem,  returnId);
	 * </code></pre></p>
	 * @param returnId 
	 * @param returnItem 
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return createReturnItem(com.mozu.api.contracts.commerceruntime.returns.ReturnItem returnItem, String returnId) throws Exception
	{
		return createReturnItem( returnItem,  returnId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.createReturnItem( returnItem,  returnId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId 
	 * @param returnItem 
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnItem
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return createReturnItem(com.mozu.api.contracts.commerceruntime.returns.ReturnItem returnItem, String returnId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.createReturnItemClient( returnItem,  returnId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates a refund payment associated with a customer return by performing the specified action.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.performPaymentActionForReturn( action,  returnId,  paymentId);
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to update.
	 * @param returnId Unique identifier of the return associated with the refund payment.
	 * @param action The payment action to perform for the refund payment.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return performPaymentActionForReturn(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String paymentId) throws Exception
	{
		return performPaymentActionForReturn( action,  returnId,  paymentId,  null);
	}

	/**
	 * Updates a refund payment associated with a customer return by performing the specified action.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.performPaymentActionForReturn( action,  returnId,  paymentId,  responseFields);
	 * </code></pre></p>
	 * @param paymentId Unique identifier of the return payment to update.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the refund payment.
	 * @param action The payment action to perform for the refund payment.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return performPaymentActionForReturn(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String paymentId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.performPaymentActionForReturnClient( action,  returnId,  paymentId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new payment for a return that results in a refund to the customer.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.createPaymentActionForReturn( action,  returnId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return associated with the payment action.
	 * @param action The payment action to perform for the customer return.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return createPaymentActionForReturn(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId) throws Exception
	{
		return createPaymentActionForReturn( action,  returnId,  null);
	}

	/**
	 * Creates a new payment for a return that results in a refund to the customer.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.createPaymentActionForReturn( action,  returnId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return associated with the payment action.
	 * @param action The payment action to perform for the customer return.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.payments.PaymentAction
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return createPaymentActionForReturn(com.mozu.api.contracts.commerceruntime.payments.PaymentAction action, String returnId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.createPaymentActionForReturnClient( action,  returnId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the return by performing the action specified in the request.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnCollection returnCollection = return.performReturnActions( action);
	 * </code></pre></p>
	 * @param action The name of the return action to perform, such as "Reject" or "Authorize".
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnCollection performReturnActions(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action) throws Exception
	{
		return performReturnActions( action,  null);
	}

	/**
	 * Updates the return by performing the action specified in the request.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	ReturnCollection returnCollection = return.performReturnActions( action,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param action The name of the return action to perform, such as "Reject" or "Authorize".
	 * @return com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnCollection
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public com.mozu.api.contracts.commerceruntime.returns.ReturnCollection performReturnActions(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.ReturnCollection> client = com.mozu.api.clients.commerce.ReturnClient.performReturnActionsClient( action,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a return for items previously shipped in a completed order.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.updateReturn( ret,  returnId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return.
	 * @param ret Wrapper for the array of properties to update for the return.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return updateReturn(com.mozu.api.contracts.commerceruntime.returns.Return ret, String returnId) throws Exception
	{
		return updateReturn( ret,  returnId,  null);
	}

	/**
	 * Updates one or more properties of a return for items previously shipped in a completed order.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.updateReturn( ret,  returnId,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param returnId Unique identifier of the return.
	 * @param ret Wrapper for the array of properties to update for the return.
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return updateReturn(com.mozu.api.contracts.commerceruntime.returns.Return ret, String returnId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.updateReturnClient( ret,  returnId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	return.resendReturnEmail( action);
	 * </code></pre></p>
	 * @param action 
	 * @return 
	 * @see com.mozu.api.contracts.commerceruntime.returns.ReturnAction
	 */
	public void resendReturnEmail(com.mozu.api.contracts.commerceruntime.returns.ReturnAction action) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.ReturnClient.resendReturnEmailClient( action);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	Return return = return.deleteOrderItem( returnId,  returnItemId);
	 * </code></pre></p>
	 * @param returnId 
	 * @param returnItemId 
	 * @return com.mozu.api.contracts.commerceruntime.returns.Return
	 * @see com.mozu.api.contracts.commerceruntime.returns.Return
	 */
	public com.mozu.api.contracts.commerceruntime.returns.Return deleteOrderItem(String returnId, String returnItemId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.returns.Return> client = com.mozu.api.clients.commerce.ReturnClient.deleteOrderItemClient( returnId,  returnItemId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the return specified in the request.
	 * <p><pre><code>
	 *	Return return = new Return();
	 *	return.deleteReturn( returnId);
	 * </code></pre></p>
	 * @param returnId Unique identifier of the return to delete.
	 * @return 
	 */
	public void deleteReturn(String returnId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.ReturnClient.deleteReturnClient( returnId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



