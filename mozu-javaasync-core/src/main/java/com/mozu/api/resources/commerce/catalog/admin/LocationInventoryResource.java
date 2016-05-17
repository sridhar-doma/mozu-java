/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce.catalog.admin;

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

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Location Inventory resource to manage the level of active product inventory maintained at each defined location, at the location level.
 * </summary>
 */
public class LocationInventoryResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public LocationInventoryResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public LocationInventoryResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * Retrieves the details of a product's active inventory at the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.getLocationInventory( locationCode,  productCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(String locationCode, String productCode) throws Exception
	{
		return getLocationInventory( locationCode,  productCode,  null);
	}

	/**
	 * Retrieves the details of a product's active inventory at the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventory( locationCode,  productCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch getLocationInventoryAsync(String locationCode, String productCode, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventory> callback) throws Exception
	{
		return getLocationInventoryAsync( locationCode,  productCode,  null, callback);
	}

	/**
	 * Retrieves the details of a product's active inventory at the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.getLocationInventory( locationCode,  productCode,  responseFields);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public com.mozu.api.contracts.productadmin.LocationInventory getLocationInventory(String locationCode, String productCode, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoryClient(_dataViewMode,  locationCode,  productCode,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves the details of a product's active inventory at the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventory( locationCode,  productCode,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch getLocationInventoryAsync(String locationCode, String productCode, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventory> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventory> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoryClient(_dataViewMode,  locationCode,  productCode,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.getLocationInventories( locationCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(String locationCode) throws Exception
	{
		return getLocationInventories( locationCode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventories( locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public CountDownLatch getLocationInventoriesAsync(String locationCode, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventoryCollection> callback) throws Exception
	{
		return getLocationInventoriesAsync( locationCode,  null,  null,  null,  null,  null, callback);
	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventoryCollection locationInventoryCollection = locationinventory.getLocationInventories( locationCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public com.mozu.api.contracts.productadmin.LocationInventoryCollection getLocationInventories(String locationCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoriesClient(_dataViewMode,  locationCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of all product inventory definitions for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.getLocationInventories( locationCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy The property by which to sort results and whether the results appear in ascending (a-z) order, represented by ASC or in descending (z-a) order, represented by DESC. The sortBy parameter follows an available property. For example: "sortBy=productCode+asc"
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with a PageSize of 25, to get the 51st through the 75th items, use startIndex=3.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @return com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryCollection
	 */
	public CountDownLatch getLocationInventoriesAsync(String locationCode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.productadmin.LocationInventoryCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.LocationInventoryCollection> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.getLocationInventoriesClient(_dataViewMode,  locationCode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.addLocationInventory( locationInventoryList,  locationCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Array list of product inventory definitions for all associated locations. For each location inventory in the list, define the productCode and stockOnHand values.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode) throws Exception
	{
		return addLocationInventory( locationInventoryList,  locationCode,  null);
	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.addLocationInventory( locationInventoryList,  locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Array list of product inventory definitions for all associated locations. For each location inventory in the list, define the productCode and stockOnHand values.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch addLocationInventoryAsync(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, AsyncCallback<List<com.mozu.api.contracts.productadmin.LocationInventory>> callback) throws Exception
	{
		return addLocationInventoryAsync( locationInventoryList,  locationCode,  null, callback);
	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.addLocationInventory( locationInventoryList,  locationCode,  performUpserts);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param performUpserts 
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Array list of product inventory definitions for all associated locations. For each location inventory in the list, define the productCode and stockOnHand values.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> addLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, Boolean performUpserts) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.addLocationInventoryClient(_dataViewMode,  locationInventoryList,  locationCode,  performUpserts);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates an array of product inventory definitions for the location specified in the request. When adding a new inventory definition, you must specify the productCode and stockOnHand value in each array you define. All other properties are system-supplied and read only.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.addLocationInventory( locationInventoryList,  locationCode,  performUpserts, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param performUpserts 
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryList Array list of product inventory definitions for all associated locations. For each location inventory in the list, define the productCode and stockOnHand values.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 */
	public CountDownLatch addLocationInventoryAsync(List<com.mozu.api.contracts.productadmin.LocationInventory> locationInventoryList, String locationCode, Boolean performUpserts, AsyncCallback<List<com.mozu.api.contracts.productadmin.LocationInventory>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.addLocationInventoryClient(_dataViewMode,  locationInventoryList,  locationCode,  performUpserts);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Updates the active stock on hand inventory of products for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	LocationInventory locationInventory = locationinventory.updateLocationInventory( locationInventoryAdjustments,  locationCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryAdjustments Properties of the inventory adjustments to perform for the specified location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public List<com.mozu.api.contracts.productadmin.LocationInventory> updateLocationInventory(List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String locationCode) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.updateLocationInventoryClient(_dataViewMode,  locationInventoryAdjustments,  locationCode);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Updates the active stock on hand inventory of products for the location code specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	CountDownLatch latch = locationinventory.updateLocationInventory( locationInventoryAdjustments,  locationCode, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param  callback callback handler for asynchronous operations
	 * @param dataViewMode DataViewMode
	 * @param locationInventoryAdjustments Properties of the inventory adjustments to perform for the specified location.
	 * @return List<com.mozu.api.contracts.productadmin.LocationInventory>
	 * @see com.mozu.api.contracts.productadmin.LocationInventory
	 * @see com.mozu.api.contracts.productadmin.LocationInventoryAdjustment
	 */
	public CountDownLatch updateLocationInventoryAsync(List<com.mozu.api.contracts.productadmin.LocationInventoryAdjustment> locationInventoryAdjustments, String locationCode, AsyncCallback<List<com.mozu.api.contracts.productadmin.LocationInventory>> callback) throws Exception
	{
		MozuClient<List<com.mozu.api.contracts.productadmin.LocationInventory>> client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.updateLocationInventoryClient(_dataViewMode,  locationInventoryAdjustments,  locationCode);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * Deletes the product code inventory definition for the location specified in the request.
	 * <p><pre><code>
	 *	LocationInventory locationinventory = new LocationInventory();
	 *	locationinventory.deleteLocationInventory( locationCode,  productCode);
	 * </code></pre></p>
	 * @param locationCode User-defined code that uniquely identifies the location.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param dataViewMode DataViewMode
	 * @return 
	 */
	public void deleteLocationInventory(String locationCode, String productCode) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.LocationInventoryClient.deleteLocationInventoryClient(_dataViewMode,  locationCode,  productCode);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



