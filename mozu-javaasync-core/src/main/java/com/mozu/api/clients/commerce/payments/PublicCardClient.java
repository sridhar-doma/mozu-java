/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.payments;

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
 * commerce/payments/cards related resources. DOCUMENT_HERE 
 * </summary>
 */
public class PublicCardClient {
	
	/**
	 * payments-cards Post Create description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=CreateClient( request);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> createClient(com.mozu.api.contracts.paymentservice.PublicCard request) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.createUrl();
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.paymentservice.response.SyncResponse.class;
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient = (MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(request);
		return mozuClient;

	}

	/**
	 * payments-cards Put Update description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient=UpdateClient( request,  cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * SyncResponse syncResponse = client.Result();
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @param request Mozu.PaymentService.Contracts.PublicCard ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.paymentservice.response.SyncResponse>
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public static MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> updateClient(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.updateUrl(cardId);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.paymentservice.response.SyncResponse.class;
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> mozuClient = (MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(request);
		return mozuClient;

	}

	/**
	 * payments-cards Delete Delete description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteClient( cardId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param cardId Unique identifier of the card associated with the customer account billing contact.
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteClient(String cardId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.payments.PublicCardUrl.deleteUrl(cardId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

}



