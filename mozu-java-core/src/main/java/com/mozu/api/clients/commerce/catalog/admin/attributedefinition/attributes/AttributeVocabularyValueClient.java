/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.catalog.admin.attributedefinition.attributes;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Vocabulary values are predefined for an attribute.
 * </summary>
 */
public class AttributeVocabularyValueClient {
	
	/**
	 * Retrieves a list of attribute vocabulary values. To target a query, use one or several valid optional response groups.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient=GetAttributeVocabularyValuesClient(dataViewMode,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> getAttributeVocabularyValuesClient(com.mozu.api.DataViewMode dataViewMode, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.getAttributeVocabularyValuesUrl(attributeFQN);
		String verb = "GET";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Retrieves an attribute vocabulary value by providing the attribute FQN and value.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=GetAttributeVocabularyValueClient(dataViewMode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The actual unique value of the attribute vocabulary to retrieve. A single attribute must have a unique value and match the attribute's data type. If a string value returns null, the system will generate a value. The actual string content displayed shoud be stored as "Content" and actual content is required for string values.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> getAttributeVocabularyValueClient(com.mozu.api.DataViewMode dataViewMode, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.getAttributeVocabularyValueUrl(attributeFQN, value);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValue.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Adds a new attribute vocabulary value.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=AddAttributeVocabularyValueClient(dataViewMode,  attributeVocabularyValue,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue The predefined vocabulary value to add to the attribute content.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> addAttributeVocabularyValueClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.addAttributeVocabularyValueUrl(attributeFQN);
		String verb = "POST";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValue.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeVocabularyValue);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Update existing vocabulary values for an attribute.
	 * <p><pre><code>
	 * MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient=UpdateAttributeVocabularyValuesClient(dataViewMode,  vocabularyValues,  attributeFQN);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param dataViewMode DataViewMode
	 * @param vocabularyValues The actual vocabulary values for the attribute being updated.
	 * @return Mozu.Api.MozuClient <List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> updateAttributeVocabularyValuesClient(com.mozu.api.DataViewMode dataViewMode, List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> vocabularyValues, String attributeFQN) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.updateAttributeVocabularyValuesUrl(attributeFQN);
		String verb = "PUT";
		Class<?> clz = new ArrayList<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>(){}.getClass();
		MozuClient<List<com.mozu.api.contracts.productadmin.AttributeVocabularyValue>> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(vocabularyValues);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Updates existing attribute vocabulary values.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient=UpdateAttributeVocabularyValueClient(dataViewMode,  attributeVocabularyValue,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * AttributeVocabularyValue attributeVocabularyValue = client.Result();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The actual unique value of the attribute vocabulary value to update. A single attribute must have a unique value and match the attribute's data type. If a string value returns null, the system will generate a value. The actual string content displayed shoud be stored as "Content" and actual content is required for string values.
	 * @param dataViewMode DataViewMode
	 * @param attributeVocabularyValue The predefined vocabulary value to add to the attribute content to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.productadmin.AttributeVocabularyValue>
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 * @see com.mozu.api.contracts.productadmin.AttributeVocabularyValue
	 */
	public static MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> updateAttributeVocabularyValueClient(com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.AttributeVocabularyValue attributeVocabularyValue, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.updateAttributeVocabularyValueUrl(attributeFQN, value);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.productadmin.AttributeVocabularyValue.class;
		MozuClient<com.mozu.api.contracts.productadmin.AttributeVocabularyValue> mozuClient = new MozuClient(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(attributeVocabularyValue);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

	/**
	 * Deletes an attribute's vocabulary value.
	 * <p><pre><code>
	 * MozuClient mozuClient=DeleteAttributeVocabularyValueClient(dataViewMode,  attributeFQN,  value);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * </code></pre></p>
	 * @param attributeFQN The fully qualified name of the attribute, which is a user defined attribute identifier.
	 * @param value The actual unique value of the attribute vocabulary to delete. A single attribute must have a unique value and match the attribute's data type. If a string value returns null, the system will generate a value. The actual string content displayed shoud be stored as "Content" and actual content is required for string values.
	 * @param dataViewMode DataViewMode
	 * @return Mozu.Api.MozuClient 
	 */
	public static MozuClient deleteAttributeVocabularyValueClient(com.mozu.api.DataViewMode dataViewMode, String attributeFQN, String value) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.catalog.admin.attributedefinition.attributes.AttributeVocabularyValueUrl.deleteAttributeVocabularyValueUrl(attributeFQN, value);
		String verb = "DELETE";
				MozuClient mozuClient = new MozuClient();
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.addHeader(Headers.X_VOL_DATAVIEW_MODE ,dataViewMode.toString());
		return mozuClient;

	}

}


