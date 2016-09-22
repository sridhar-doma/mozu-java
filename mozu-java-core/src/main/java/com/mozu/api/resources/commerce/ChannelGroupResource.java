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
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Channel Groups resource to manage groups of channels with common information.
 * </summary>
 */
public class ChannelGroupResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ChannelGroupResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a list of defined channel groups according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroupCollection channelGroupCollection = channelgroup.getChannelGroups();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection getChannelGroups() throws Exception
	{
		return getChannelGroups( null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of defined channel groups according to any filter and sort criteria specified in the request.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroupCollection channelGroupCollection = channelgroup.getChannelGroups( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection getChannelGroups(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroupCollection> client = com.mozu.api.clients.commerce.ChannelGroupClient.getChannelGroupsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a defined channel group.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.getChannelGroup( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup getChannelGroup(String code) throws Exception
	{
		return getChannelGroup( code,  null);
	}

	/**
	 * Retrieves the details of a defined channel group.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.getChannelGroup( code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup getChannelGroup(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> client = com.mozu.api.clients.commerce.ChannelGroupClient.getChannelGroupClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new group of channels with common information.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.createChannelGroup( channelGroup);
	 * </code></pre></p>
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup createChannelGroup(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup) throws Exception
	{
		return createChannelGroup( channelGroup,  null);
	}

	/**
	 * Creates a new group of channels with common information.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.createChannelGroup( channelGroup,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup createChannelGroup(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> client = com.mozu.api.clients.commerce.ChannelGroupClient.createChannelGroupClient( channelGroup,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates one or more properties of a defined channel group.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.updateChannelGroup( channelGroup,  code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup updateChannelGroup(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code) throws Exception
	{
		return updateChannelGroup( channelGroup,  code,  null);
	}

	/**
	 * Updates one or more properties of a defined channel group.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	ChannelGroup channelGroup = channelgroup.updateChannelGroup( channelGroup,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param channelGroup Properties of a group of channels that share common information.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelGroup
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelGroup updateChannelGroup(com.mozu.api.contracts.commerceruntime.channels.ChannelGroup channelGroup, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelGroup> client = com.mozu.api.clients.commerce.ChannelGroupClient.updateChannelGroupClient( channelGroup,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes a defined group of channels, which removes the group association with each channel in the group but does not delete the channel definitions themselves.
	 * <p><pre><code>
	 *	ChannelGroup channelgroup = new ChannelGroup();
	 *	channelgroup.deleteChannelGroup( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return 
	 */
	public void deleteChannelGroup(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.ChannelGroupClient.deleteChannelGroupClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



