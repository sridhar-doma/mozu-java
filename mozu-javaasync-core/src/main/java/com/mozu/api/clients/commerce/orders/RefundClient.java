/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.orders;

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
 * Use the refunds resource to create a refund.
 * </summary>
 */
public class RefundClient {
	
	/**
	 * Creates a refund based on the information supplied in the request.  
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> mozuClient=CreateRefundClient( refund,  orderId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Refund refund = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refund Mozu.CommerceRuntime.Contracts.Refunds.Refund ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.refunds.Refund>
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> createRefundClient(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId) throws Exception
	{
		return createRefundClient( refund,  orderId,  null);
	}

	/**
	 * Creates a refund based on the information supplied in the request.  
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> mozuClient=CreateRefundClient( refund,  orderId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Refund refund = client.Result();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param refund Mozu.CommerceRuntime.Contracts.Refunds.Refund ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.commerceruntime.refunds.Refund>
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 * @see com.mozu.api.contracts.commerceruntime.refunds.Refund
	 */
	public static MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> createRefundClient(com.mozu.api.contracts.commerceruntime.refunds.Refund refund, String orderId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.RefundUrl.createRefundUrl(orderId, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.commerceruntime.refunds.Refund.class;
		MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund> mozuClient = (MozuClient<com.mozu.api.contracts.commerceruntime.refunds.Refund>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(refund);
		return mozuClient;

	}

	/**
	 * Resends the order refund email previously sent to the shopper. 
	 * <p><pre><code>
	 * MozuClient mozuClient=ResendRefundEmailClient( orderId,  refundId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param orderId Unique identifier of the order.
	 * @param refundId Unique ID of the refund.
        
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient resendRefundEmailClient(String orderId, String refundId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.orders.RefundUrl.resendRefundEmailUrl(orderId, refundId);
		String verb = "PUT";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



