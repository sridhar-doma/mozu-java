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
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Orders resource to manage all components of order processing, payment, and fulfillment.
 * </summary>
 */
public class OrderResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	
	public OrderResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}
	
	/**
	 * Retrieves a list of orders according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.GetOrders();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders() throws Exception
	{
		return getOrders( null,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of orders according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	OrderCollection orderCollection = order.GetOrders( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. You can filter an order's search results by any of its properties, including status, contact information, or total. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=Status+eq+Submitted"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param q A list of order search terms to use in the query when searching across order number and the name or email of the billing contact. Separate multiple search terms with a space character.
	 * @param qLimit The maximum number of search results to return in the response. You can limit any range between 1-100.
	 * @param sortBy 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderCollection
	 */
	public com.mozu.api.contracts.commerceruntime.orders.OrderCollection getOrders(Integer startIndex, Integer pageSize, String sortBy, String filter, String q, Integer qLimit) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.OrderCollection> client = com.mozu.api.clients.commerce.OrderClient.getOrdersClient( startIndex,  pageSize,  sortBy,  filter,  q,  qLimit);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves available order actions which depends on the status of the order. Actions are "CreateOrder," "SubmitOrder," "SetOrderAsProcessing," "CloseOrder," or "CancelOrder."
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	string string = order.GetAvailableActions( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the available order actions to get.
	 * @return List<string>
	 * @see string
	 */
	public List<String> getAvailableActions(String orderId) throws Exception
	{
		MozuClient<List<String>> client = com.mozu.api.clients.commerce.OrderClient.getAvailableActionsClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	TaxableOrder taxableOrder = order.GetTaxableOrders( orderId);
	 * </code></pre></p>
	 * @param orderId 
	 * @return List<com.mozu.api.contracts.pricingruntime.TaxableOrder>
	 * @see com.mozu.api.contracts.pricingruntime.TaxableOrder
	 */
	public List<com.mozu.api.contracts.pricingruntime.TaxableOrder> getTaxableOrders(String orderId) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.pricingruntime.TaxableOrder>> client = com.mozu.api.clients.commerce.OrderClient.getTaxableOrdersClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of an order specified by the order ID.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.GetOrder( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order details to get.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId) throws Exception
	{
		return getOrder( orderId,  null);
	}

	/**
	 * Retrieves the details of an order specified by the order ID.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.GetOrder( orderId,  draft);
	 * </code></pre></p>
	 * @param draft If true, retrieve the draft version of the order, which might include uncommitted changes to the order or its components.
	 * @param orderId Unique identifier of the order details to get.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order getOrder(String orderId, Boolean draft) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.getOrderClient( orderId,  draft);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new order for no-cart quick-ordering scenarios.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.CreateOrder( order);
	 * </code></pre></p>
	 * @param order All properties of the order to place.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrder(com.mozu.api.contracts.commerceruntime.orders.Order order) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderClient( order);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new order from an existing cart when the customer chooses to proceed to checkout.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.CreateOrderFromCart( cartId);
	 * </code></pre></p>
	 * @param cartId Unique identifier of the cart. This is the original cart ID expressed as a GUID.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order createOrderFromCart(String cartId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.createOrderFromCartClient( cartId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Perform the specified action for an order. Available actions depend on the current status of the order. When in doubt, first get a list of available order actions.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.PerformOrderAction( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action Action to perform, which can be "CreateOrder," "SubmitOrder," "SetOrderAsProcessing," "CloseOrder," or "CancelOrder."
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.OrderAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performOrderAction(com.mozu.api.contracts.commerceruntime.orders.OrderAction action, String orderId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.performOrderActionClient( action,  orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Update the properties of a discount applied to an order.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrderDiscount( discount,  orderId,  discountId);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param discount Properties of the order discount to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId) throws Exception
	{
		return updateOrderDiscount( discount,  orderId,  discountId,  null,  null);
	}

	/**
	 * Update the properties of a discount applied to an order.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrderDiscount( discount,  orderId,  discountId,  updateMode,  version);
	 * </code></pre></p>
	 * @param discountId Unique identifier of the discount. System-supplied and read only.
	 * @param orderId Unique identifier of the order discount. System-supplied and read only.
	 * @param updateMode Specifies whether to modify the discount by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param discount Properties of the order discount to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrderDiscount(com.mozu.api.contracts.commerceruntime.discounts.AppliedDiscount discount, String orderId, Integer discountId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderDiscountClient( discount,  orderId,  discountId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the current draft version of the order, which also deletes any uncommitted changes made to the order in draft mode.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.DeleteOrderDraft( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @return 
	 */
	public void deleteOrderDraft(String orderId) throws Exception
	{
		deleteOrderDraft( orderId,  null);
	}

	/**
	 * Deletes the current draft version of the order, which also deletes any uncommitted changes made to the order in draft mode.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	order.DeleteOrderDraft( orderId,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order associated with the draft to delete.
	 * @param version If applicable, the version of the order draft to delete.
	 * @return 
	 */
	public void deleteOrderDraft(String orderId, String version) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.OrderClient.deleteOrderDraftClient( orderId,  version);
		client.setContext(_apiContext);
		client.executeRequest();

	}

	/**
	 * Updates the user ID of the shopper who placed the order to the current user.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.ChangeOrderUserId( orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order changeOrderUserId(String orderId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.changeOrderUserIdClient( orderId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the specified order when additional order information, such as shipping or billing information, is modified during the checkout process.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrder( order,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param order The properties of the order to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId) throws Exception
	{
		return updateOrder( order,  orderId,  null,  null);
	}

	/**
	 * Updates the specified order when additional order information, such as shipping or billing information, is modified during the checkout process.
	 * <p><pre><code>
	 *	Order order = new Order();
	 *	Order order = order.UpdateOrder( order,  orderId,  updateMode,  version);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order to update.
	 * @param updateMode Specifies whether to update the original order, update the order in draft mode, or update the order in draft mode and then commit the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @param order The properties of the order to update.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order updateOrder(com.mozu.api.contracts.commerceruntime.orders.Order order, String orderId, String updateMode, String version) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.OrderClient.updateOrderClient( order,  orderId,  updateMode,  version);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}


