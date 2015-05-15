/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.payments;

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
 * 
 * </summary>
 */
public class PublicCardResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public PublicCardResource() 
		{
			_apiContext = null;
	}
public PublicCardResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.create( request);
	 * </code></pre></p>
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse create(com.mozu.api.contracts.paymentservice.PublicCard request) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.createClient( request);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	SyncResponse syncResponse = publiccard.update( request,  cardId);
	 * </code></pre></p>
	 * @param cardId 
	 * @param request 
	 * @return com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.response.SyncResponse
	 * @see com.mozu.api.contracts.paymentservice.PublicCard
	 */
	public com.mozu.api.contracts.paymentservice.response.SyncResponse update(com.mozu.api.contracts.paymentservice.PublicCard request, String cardId) throws Exception
	{
		MozuClient<com.mozu.api.contracts.paymentservice.response.SyncResponse> client = com.mozu.api.clients.commerce.payments.PublicCardClient.updateClient( request,  cardId);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	PublicCard publiccard = new PublicCard();
	 *	publiccard.delete( cardId);
	 * </code></pre></p>
	 * @param cardId 
	 * @return 
	 */
	public void delete(String cardId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.payments.PublicCardClient.deleteClient( cardId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



