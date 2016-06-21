/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.orders;

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
 * Use the Fulfillment resource to manage shipments or pickups of collections of packages for an order.
 * </summary>
 */
public class FulfillmentActionResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public FulfillmentActionResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.performFulfillmentAction( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		return performFulfillmentAction( action,  orderId,  null);
	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	CountDownLatch latch = fulfillmentaction.performFulfillmentAction( action,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public CountDownLatch performFulfillmentActionAsync(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		return performFulfillmentActionAsync( action,  orderId,  null, callback);
	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.performFulfillmentAction( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order performFulfillmentAction(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.performFulfillmentActionClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Sets the fulfillment action to "Ship" or "PickUp". To ship an order or prepare it for in-store pickup, the order must have a customer name, the "Open" or "OpenAndProcessing" status. To ship the order, it must also have the full shipping address and shipping method. Shipping all packages or picking up all pickups for an order will complete a paid order.
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	CountDownLatch latch = fulfillmentaction.performFulfillmentAction( action,  orderId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public CountDownLatch performFulfillmentActionAsync(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.performFulfillmentActionClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Resends an email with details about the package fulfillment to the shopper. 
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.resendPackageFulfillmentEmail( action,  orderId);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order resendPackageFulfillmentEmail(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId) throws Exception
	{
		return resendPackageFulfillmentEmail( action,  orderId,  null);
	}

	/**
	 * Resends an email with details about the package fulfillment to the shopper. 
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	CountDownLatch latch = fulfillmentaction.resendPackageFulfillmentEmail( action,  orderId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param  callback callback handler for asynchronous operations
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public CountDownLatch resendPackageFulfillmentEmailAsync(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		return resendPackageFulfillmentEmailAsync( action,  orderId,  null, callback);
	}

	/**
	 * Resends an email with details about the package fulfillment to the shopper. 
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	Order order = fulfillmentaction.resendPackageFulfillmentEmail( action,  orderId,  responseFields);
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public com.mozu.api.contracts.commerceruntime.orders.Order resendPackageFulfillmentEmail(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.resendPackageFulfillmentEmailClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Resends an email with details about the package fulfillment to the shopper. 
	 * <p><pre><code>
	 *	FulfillmentAction fulfillmentaction = new FulfillmentAction();
	 *	CountDownLatch latch = fulfillmentaction.resendPackageFulfillmentEmail( action,  orderId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param action Properties of an action to perform when fulfilling an item in an order, whether through in-store pickup or direct shipping.
	 * @return com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.orders.Order
	 * @see com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction
	 */
	public CountDownLatch resendPackageFulfillmentEmailAsync(com.mozu.api.contracts.commerceruntime.fulfillment.FulfillmentAction action, String orderId, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.orders.Order> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.orders.Order> client = com.mozu.api.clients.commerce.orders.FulfillmentActionClient.resendPackageFulfillmentEmailClient( action,  orderId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

}



