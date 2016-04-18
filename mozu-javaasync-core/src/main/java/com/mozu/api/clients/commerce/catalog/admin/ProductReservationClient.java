/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin;

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
 * Temporarily hold a product from inventory while a shopper is filling out payment information. Create a product reservation when a shopper proceeds to check out and then release the reservation when the order process is complete.
 * </summary>
 */
public class ProductReservationClient {
	
	/**
	 * Retrieves a list of product reservations according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> mozuClient=GetProductReservationsClient(dataViewMode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservationCollection productReservationCollection = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductReservationCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> getProductReservationsClient(com.mozu.api.DataViewMode dataViewMode) throws Exception
	{
		return getProductReservationsClient(dataViewMode,  null,  null,  null,  null,  null);
	}

	/**
	 * Retrieves a list of product reservations according to any specified filter criteria and sort options.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> mozuClient=GetProductReservationsClient(dataViewMode,  startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservationCollection productReservationCollection = client.Result();
	 * </code></pre></p>
	 * @param filter A set of expressions that consist of a field, operator, and value and represent search parameter syntax when filtering results of a query. Valid operators include equals (eq), does not equal (ne), greater than (gt), less than (lt), greater than or equal to (ge), less than or equal to (le), starts with (sw), or contains (cont). For example - "filter=IsDisplayed+eq+true"
	 * @param pageSize The number of results to display on each page when creating paged results from a query. The maximum value is 200.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param sortBy 
	 * @param startIndex 
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductReservationCollection>
	 * @see com.mozu.api.contracts.productadmin.ProductReservationCollection
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> getProductReservationsClient(com.mozu.api.DataViewMode dataViewMode, Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.getProductReservationsUrl(filter, pageSize, responseFields, sortBy, startIndex);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductReservationCollection.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductReservationCollection>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of a product reservation.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> mozuClient=GetProductReservationClient(dataViewMode,  productReservationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> getProductReservationClient(com.mozu.api.DataViewMode dataViewMode, Integer productReservationId) throws Exception
	{
		return getProductReservationClient(dataViewMode,  productReservationId,  null);
	}

	/**
	 * Retrieves the details of a product reservation.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> mozuClient=GetProductReservationClient(dataViewMode,  productReservationId,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param productReservationId Unique identifier of the product reservation.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductReservation>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> getProductReservationClient(com.mozu.api.DataViewMode dataViewMode, Integer productReservationId, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.getProductReservationUrl(productReservationId, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductReservation.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductReservation> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductReservation>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Creates a new product reservation for a product. This action places a hold on the product inventory for the quantity specified during the ordering process.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=AddProductReservationsClient(dataViewMode,  productReservations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productReservations Details of the product reservations to add.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> addProductReservationsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception
	{
		return addProductReservationsClient(dataViewMode,  productReservations,  null);
	}

	/**
	 * Creates a new product reservation for a product. This action places a hold on the product inventory for the quantity specified during the ordering process.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=AddProductReservationsClient(dataViewMode,  productReservations,  skipInventoryCheck);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param skipInventoryCheck If true, skip the process to validate inventory when creating this product reservation.
	 * @param dataViewMode DataViewMode
	 * @param productReservations Details of the product reservations to add.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> addProductReservationsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, Boolean skipInventoryCheck) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.addProductReservationsUrl(skipInventoryCheck);
		String verb = "POST";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productReservations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Commits a product reservation to decrement the product's inventory by the quantity specified then release the reservation once the order process completed successfully.
	 * <p><pre><code>
	 * MozuClient mozuClient=CommitReservationsClient(dataViewMode,  productReservations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productReservations List of unique identifiers of the reservations to commit.
	 * @return Mozu.Api.MozuClient 
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient commitReservationsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.commitReservationsUrl();
		String verb = "POST";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productReservations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates an existing product reservation for a product.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=UpdateProductReservationsClient(dataViewMode,  productReservations);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param dataViewMode DataViewMode
	 * @param productReservations Properties of the product reservations to update.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> updateProductReservationsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations) throws Exception
	{
		return updateProductReservationsClient(dataViewMode,  productReservations,  null);
	}

	/**
	 * Updates an existing product reservation for a product.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient=UpdateProductReservationsClient(dataViewMode,  productReservations,  skipInventoryCheck);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductReservation productReservation = client.Result();
	 * </code></pre></p>
	 * @param skipInventoryCheck If true, skip the inventory validation process when updating this product reservation.
	 * @param dataViewMode DataViewMode
	 * @param productReservations Properties of the product reservations to update.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductReservation>>
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 * @see com.mozu.api.contracts.productadmin.ProductReservation
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> updateProductReservationsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductReservation> productReservations, Boolean skipInventoryCheck) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.updateProductReservationsUrl(skipInventoryCheck);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductReservation>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductReservation>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productReservations);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes a product reservation. For example, delete a reservation when an order is not processed to return the product quantity back to inventory.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteProductReservationClient(dataViewMode,  productReservationId);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param productReservationId Unique identifier of the reservation.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteProductReservationClient(com.mozu.api.DataViewMode dataViewMode, Integer productReservationId) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.ProductReservationUrl.deleteProductReservationUrl(productReservationId);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



