/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.platform.entitylists;

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
 * 
 * </summary>
 */
public class ListViewResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ListViewResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	JObject json = listview.getViewEntity( entityListFullName,  viewName,  entityId);
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getViewEntity(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntity( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntity( entityListFullName,  viewName,  entityId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getViewEntityAsync(String entityListFullName, String viewName, String entityId, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		return getViewEntityAsync( entityListFullName,  viewName,  entityId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	JObject json = listview.getViewEntity( entityListFullName,  viewName,  entityId,  responseFields);
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @return JObject
	 * @see JObject
	 */
	public com.fasterxml.jackson.databind.JsonNode getViewEntity(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityClient( entityListFullName,  viewName,  entityId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntity( entityListFullName,  viewName,  entityId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return JObject
	 * @see JObject
	 */
	public CountDownLatch getViewEntityAsync(String entityListFullName, String viewName, String entityId, String responseFields, AsyncCallback<com.fasterxml.jackson.databind.JsonNode> callback) throws Exception
	{
		MozuClient<com.fasterxml.jackson.databind.JsonNode> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityClient( entityListFullName,  viewName,  entityId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityCollection entityCollection = listview.getViewEntities( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntities( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntities( entityListFullName,  viewName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public CountDownLatch getViewEntitiesAsync(String entityListFullName, String viewName, AsyncCallback<com.mozu.api.contracts.mzdb.EntityCollection> callback) throws Exception
	{
		return getViewEntitiesAsync( entityListFullName,  viewName,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityCollection entityCollection = listview.getViewEntities( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityCollection getViewEntities(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntitiesClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntities( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityCollection
	 * @see com.mozu.api.contracts.mzdb.EntityCollection
	 */
	public CountDownLatch getViewEntitiesAsync(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntitiesClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainer entityContainer = listview.getViewEntityContainer( entityListFullName,  viewName,  entityId);
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public com.mozu.api.contracts.mzdb.EntityContainer getViewEntityContainer(String entityListFullName, String viewName, String entityId) throws Exception
	{
		return getViewEntityContainer( entityListFullName,  viewName,  entityId,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntityContainer( entityListFullName,  viewName,  entityId, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public CountDownLatch getViewEntityContainerAsync(String entityListFullName, String viewName, String entityId, AsyncCallback<com.mozu.api.contracts.mzdb.EntityContainer> callback) throws Exception
	{
		return getViewEntityContainerAsync( entityListFullName,  viewName,  entityId,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainer entityContainer = listview.getViewEntityContainer( entityListFullName,  viewName,  entityId,  responseFields);
	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public com.mozu.api.contracts.mzdb.EntityContainer getViewEntityContainer(String entityListFullName, String viewName, String entityId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainerClient( entityListFullName,  viewName,  entityId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntityContainer( entityListFullName,  viewName,  entityId,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityId 
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityContainer
	 * @see com.mozu.api.contracts.mzdb.EntityContainer
	 */
	public CountDownLatch getViewEntityContainerAsync(String entityListFullName, String viewName, String entityId, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityContainer> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainer> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainerClient( entityListFullName,  viewName,  entityId,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainerCollection entityContainerCollection = listview.getViewEntityContainers( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(String entityListFullName, String viewName) throws Exception
	{
		return getViewEntityContainers( entityListFullName,  viewName,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntityContainers( entityListFullName,  viewName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public CountDownLatch getViewEntityContainersAsync(String entityListFullName, String viewName, AsyncCallback<com.mozu.api.contracts.mzdb.EntityContainerCollection> callback) throws Exception
	{
		return getViewEntityContainersAsync( entityListFullName,  viewName,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	EntityContainerCollection entityContainerCollection = listview.getViewEntityContainers( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public com.mozu.api.contracts.mzdb.EntityContainerCollection getViewEntityContainers(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainersClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getViewEntityContainers( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param startIndex 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.EntityContainerCollection
	 * @see com.mozu.api.contracts.mzdb.EntityContainerCollection
	 */
	public CountDownLatch getViewEntityContainersAsync(String entityListFullName, String viewName, Integer pageSize, Integer startIndex, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.EntityContainerCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.EntityContainerCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getViewEntityContainersClient( entityListFullName,  viewName,  pageSize,  startIndex,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.getEntityListView( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView getEntityListView(String entityListFullName, String viewName) throws Exception
	{
		return getEntityListView( entityListFullName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getEntityListView( entityListFullName,  viewName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public CountDownLatch getEntityListViewAsync(String entityListFullName, String viewName, AsyncCallback<com.mozu.api.contracts.mzdb.ListView> callback) throws Exception
	{
		return getEntityListViewAsync( entityListFullName,  viewName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.getEntityListView( entityListFullName,  viewName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView getEntityListView(String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewClient( entityListFullName,  viewName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getEntityListView( entityListFullName,  viewName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public CountDownLatch getEntityListViewAsync(String entityListFullName, String viewName, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.ListView> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewClient( entityListFullName,  viewName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListViewCollection listViewCollection = listview.getEntityListViews( entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @return com.mozu.api.contracts.mzdb.ListViewCollection
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public com.mozu.api.contracts.mzdb.ListViewCollection getEntityListViews(String entityListFullName) throws Exception
	{
		return getEntityListViews( entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getEntityListViews( entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.ListViewCollection
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public CountDownLatch getEntityListViewsAsync(String entityListFullName, AsyncCallback<com.mozu.api.contracts.mzdb.ListViewCollection> callback) throws Exception
	{
		return getEntityListViewsAsync( entityListFullName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListViewCollection listViewCollection = listview.getEntityListViews( entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return com.mozu.api.contracts.mzdb.ListViewCollection
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public com.mozu.api.contracts.mzdb.ListViewCollection getEntityListViews(String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewsClient( entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.getEntityListViews( entityListFullName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.mzdb.ListViewCollection
	 * @see com.mozu.api.contracts.mzdb.ListViewCollection
	 */
	public CountDownLatch getEntityListViewsAsync(String entityListFullName, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.ListViewCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListViewCollection> client = com.mozu.api.clients.platform.entitylists.ListViewClient.getEntityListViewsClient( entityListFullName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.createEntityListView( listView,  entityListFullName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView createEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName) throws Exception
	{
		return createEntityListView( listView,  entityListFullName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.createEntityListView( listView,  entityListFullName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param  callback callback handler for asynchronous operations
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public CountDownLatch createEntityListViewAsync(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, AsyncCallback<com.mozu.api.contracts.mzdb.ListView> callback) throws Exception
	{
		return createEntityListViewAsync( listView,  entityListFullName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.createEntityListView( listView,  entityListFullName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView createEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.createEntityListViewClient( listView,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.createEntityListView( listView,  entityListFullName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public CountDownLatch createEntityListViewAsync(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.ListView> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.createEntityListViewClient( listView,  entityListFullName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.updateEntityListView( listView,  entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView updateEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName) throws Exception
	{
		return updateEntityListView( listView,  entityListFullName,  viewName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.updateEntityListView( listView,  entityListFullName,  viewName, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public CountDownLatch updateEntityListViewAsync(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, AsyncCallback<com.mozu.api.contracts.mzdb.ListView> callback) throws Exception
	{
		return updateEntityListViewAsync( listView,  entityListFullName,  viewName,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	ListView listView = listview.updateEntityListView( listView,  entityListFullName,  viewName,  responseFields);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public com.mozu.api.contracts.mzdb.ListView updateEntityListView(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.updateEntityListViewClient( listView,  entityListFullName,  viewName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	CountDownLatch latch = listview.updateEntityListView( listView,  entityListFullName,  viewName,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param viewName 
	 * @param  callback callback handler for asynchronous operations
	 * @param listView 
	 * @return com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 * @see com.mozu.api.contracts.mzdb.ListView
	 */
	public CountDownLatch updateEntityListViewAsync(com.mozu.api.contracts.mzdb.ListView listView, String entityListFullName, String viewName, String responseFields, AsyncCallback<com.mozu.api.contracts.mzdb.ListView> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.mzdb.ListView> client = com.mozu.api.clients.platform.entitylists.ListViewClient.updateEntityListViewClient( listView,  entityListFullName,  viewName,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	ListView listview = new ListView();
	 *	listview.deleteEntityListView( entityListFullName,  viewName);
	 * </code></pre></p>
	 * @param entityListFullName 
	 * @param viewName 
	 * @return 
	 */
	public void deleteEntityListView(String entityListFullName, String viewName) throws Exception
	{
		MozuClient client = com.mozu.api.clients.platform.entitylists.ListViewClient.deleteEntityListViewClient( entityListFullName,  viewName);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



