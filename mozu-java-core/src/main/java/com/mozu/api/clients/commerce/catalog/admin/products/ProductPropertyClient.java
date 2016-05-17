/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.products;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Properties resource to configure a property attribute for an individual product associated with a product type that uses the property attribute, as well as set property values for the product.
 * </summary>
 */
public class ProductPropertyClient {
	
	/**
	 * Retrieves a list of the property attributes configured for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductProperty>> mozuClient=GetPropertiesClient(dataViewMode,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductProperty productProperty = client.Result();
	 * </code></pre></p>
	 * @param productCode 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductProperty>>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductProperty>> getPropertiesClient(com.mozu.api.DataViewMode dataViewMode, String productCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.getPropertiesUrl(productCode);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductProperty>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductProperty>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductProperty>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>> mozuClient=GetPropertyValueLocalizedContentsClient(dataViewMode,  productCode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>> getPropertyValueLocalizedContentsClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.getPropertyValueLocalizedContentsUrl(attributeFQN, productCode, value);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient=GetPropertyValueLocalizedContentClient(dataViewMode,  productCode,  attributeFQN,  value,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode 
	 * @param value 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> getPropertyValueLocalizedContentClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String localeCode) throws Exception
	{
		return getPropertyValueLocalizedContentClient(dataViewMode,  productCode,  attributeFQN,  value,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient=GetPropertyValueLocalizedContentClient(dataViewMode,  productCode,  attributeFQN,  value,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> getPropertyValueLocalizedContentClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.getPropertyValueLocalizedContentUrl(attributeFQN, localeCode, productCode, responseFields, value);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves the details of a property attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient=GetPropertyClient(dataViewMode,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductProperty productProperty = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductProperty>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> getPropertyClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		return getPropertyClient(dataViewMode,  productCode,  attributeFQN,  null);
	}

	/**
	 * Retrieves the details of a property attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient=GetPropertyClient(dataViewMode,  productCode,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductProperty productProperty = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode Merchant-created code that uniquely identifies the product such as a SKU or item number. Once created, the product code is read-only.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductProperty>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> getPropertyClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.getPropertyUrl(attributeFQN, productCode, responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductProperty.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductProperty>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient=AddPropertyValueLocalizedContentClient(dataViewMode,  localizedContent,  productCode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @param localizedContent Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> addPropertyValueLocalizedContentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value) throws Exception
	{
		return addPropertyValueLocalizedContentClient(dataViewMode,  localizedContent,  productCode,  attributeFQN,  value,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient=AddPropertyValueLocalizedContentClient(dataViewMode,  localizedContent,  productCode,  attributeFQN,  value,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @param localizedContent Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> addPropertyValueLocalizedContentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.addPropertyValueLocalizedContentUrl(attributeFQN, productCode, responseFields, value);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Configures a property attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient=AddPropertyClient(dataViewMode,  productProperty,  productCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductProperty productProperty = client.Result();
	 * </code></pre></p>
	 * @param productCode 
	 * @param productProperty Properties of the property attribute to configure for a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductProperty>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> addPropertyClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode) throws Exception
	{
		return addPropertyClient(dataViewMode,  productProperty,  productCode,  null);
	}

	/**
	 * Configures a property attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient=AddPropertyClient(dataViewMode,  productProperty,  productCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductProperty productProperty = client.Result();
	 * </code></pre></p>
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productProperty Properties of the property attribute to configure for a product.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductProperty>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> addPropertyClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.addPropertyUrl(productCode, responseFields);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductProperty.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductProperty>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productProperty);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>> mozuClient=UpdatePropertyValueLocalizedContentsClient(dataViewMode,  localizedContent,  productCode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param productCode 
	 * @param value 
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>> updatePropertyValueLocalizedContentsClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> localizedContent, String productCode, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.updatePropertyValueLocalizedContentsUrl(attributeFQN, productCode, value);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>> mozuClient = (MozuClient<List<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient=UpdatePropertyValueLocalizedContentClient(dataViewMode,  localizedContent,  productCode,  attributeFQN,  value,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode 
	 * @param value 
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> updatePropertyValueLocalizedContentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value, String localeCode) throws Exception
	{
		return updatePropertyValueLocalizedContentClient(dataViewMode,  localizedContent,  productCode,  attributeFQN,  value,  localeCode,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient=UpdatePropertyValueLocalizedContentClient(dataViewMode,  localizedContent,  productCode,  attributeFQN,  value,  localeCode,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductPropertyValueLocalizedContent productPropertyValueLocalizedContent = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param value 
	 * @param localizedContent 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 * @see com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> updatePropertyValueLocalizedContentClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent localizedContent, String productCode, String attributeFQN, String value, String localeCode, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.updatePropertyValueLocalizedContentUrl(attributeFQN, localeCode, productCode, responseFields, value);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductPropertyValueLocalizedContent>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(localizedContent);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Update one or more details of a property attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient=UpdatePropertyClient(dataViewMode,  productProperty,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductProperty productProperty = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode 
	 * @param productProperty Details of the property attribute to update for the product configuration.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductProperty>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> updatePropertyClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, String attributeFQN) throws Exception
	{
		return updatePropertyClient(dataViewMode,  productProperty,  productCode,  attributeFQN,  null);
	}

	/**
	 * Update one or more details of a property attribute configuration for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient=UpdatePropertyClient(dataViewMode,  productProperty,  productCode,  attributeFQN,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * ProductProperty productProperty = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode 
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param productProperty Details of the property attribute to update for the product configuration.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.ProductProperty>
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 * @see com.mozu.api.contracts.productadmin.ProductProperty
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> updatePropertyClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductProperty productProperty, String productCode, String attributeFQN, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.updatePropertyUrl(attributeFQN, productCode, responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.ProductProperty.class;
		MozuClient<com.mozu.api.contracts.productadmin.ProductProperty> mozuClient = (MozuClient<com.mozu.api.contracts.productadmin.ProductProperty>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(productProperty);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes the configuration of a property attribute for the product specified in the request.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePropertyClient(dataViewMode,  productCode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param productCode 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePropertyClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.deletePropertyUrl(attributeFQN, productCode);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * 
	 * <p><pre><code>
	 * MozuClient mozuClient=DeletePropertyValueLocalizedContentClient(dataViewMode,  productCode,  attributeFQN,  value,  localeCode);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN 
	 * @param localeCode Language used for the entity. Currently, only "en-US" is supported.
	 * @param productCode 
	 * @param value 
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deletePropertyValueLocalizedContentClient(com.mozu.api.DataViewMode dataViewMode, String productCode, String attributeFQN, String value, String localeCode) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.products.ProductPropertyUrl.deletePropertyValueLocalizedContentUrl(attributeFQN, localeCode, productCode, value);
		String verb = "DELETE";
				MozuClient mozuClient = (MozuClient) MozuClientFactory.getInstance();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}



