/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.content;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang3.StringUtils;
import com.mozu.api.DataViewMode;
/** <summary>
 * Use the Document Types resource to view the document types supplied by the Content API.
 * </summary>
 */
public class DocumentTypeResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;

	private DataViewMode _dataViewMode;

	public DocumentTypeResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
		_dataViewMode = DataViewMode.Live;
	}

	public DocumentTypeResource(ApiContext apiContext, DataViewMode dataViewMode) 
	{
		_apiContext = apiContext;
		_dataViewMode = dataViewMode;
	}
		
	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentTypeCollection documentTypeCollection = documenttype.GetDocumentTypes(_dataViewMode);
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.content.DocumentTypeCollection
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public com.mozu.api.contracts.content.DocumentTypeCollection getDocumentTypes() throws Exception
	{
		return getDocumentTypes( null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentTypeCollection documentTypeCollection = documenttype.GetDocumentTypes(_dataViewMode,  pageSize,  startIndex,  responseFields);
	 * </code></pre></p>
	 * @param pageSize 
	 * @param responseFields 
	 * @param startIndex 
	 * @return com.mozu.api.contracts.content.DocumentTypeCollection
	 * @see com.mozu.api.contracts.content.DocumentTypeCollection
	 */
	public com.mozu.api.contracts.content.DocumentTypeCollection getDocumentTypes(Integer pageSize, Integer startIndex, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentTypeCollection> client = com.mozu.api.clients.content.DocumentTypeClient.getDocumentTypesClient(_dataViewMode,  pageSize,  startIndex,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.GetDocumentType(_dataViewMode,  documentTypeName);
	 * </code></pre></p>
	 * @param documentTypeName 
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType getDocumentType(String documentTypeName) throws Exception
	{
		return getDocumentType( documentTypeName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.GetDocumentType(_dataViewMode,  documentTypeName,  responseFields);
	 * </code></pre></p>
	 * @param documentTypeName 
	 * @param responseFields 
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType getDocumentType(String documentTypeName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.getDocumentTypeClient(_dataViewMode,  documentTypeName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.CreateDocumentType(_dataViewMode,  documentType);
	 * </code></pre></p>
	 * @param documentType 
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType createDocumentType(com.mozu.api.contracts.content.DocumentType documentType) throws Exception
	{
		return createDocumentType( documentType,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.CreateDocumentType(_dataViewMode,  documentType,  responseFields);
	 * </code></pre></p>
	 * @param responseFields 
	 * @param documentType 
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType createDocumentType(com.mozu.api.contracts.content.DocumentType documentType, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.createDocumentTypeClient(_dataViewMode,  documentType,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.UpdateDocumentType( documentType,  documentTypeName);
	 * </code></pre></p>
	 * @param documentTypeName 
	 * @param documentType 
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType updateDocumentType(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName) throws Exception
	{
		return updateDocumentType( documentType,  documentTypeName,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	DocumentType documenttype = new DocumentType();
	 *	DocumentType documentType = documenttype.UpdateDocumentType( documentType,  documentTypeName,  responseFields);
	 * </code></pre></p>
	 * @param documentTypeName 
	 * @param responseFields 
	 * @param documentType 
	 * @return com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 * @see com.mozu.api.contracts.content.DocumentType
	 */
	public com.mozu.api.contracts.content.DocumentType updateDocumentType(com.mozu.api.contracts.content.DocumentType documentType, String documentTypeName, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.content.DocumentType> client = com.mozu.api.clients.content.DocumentTypeClient.updateDocumentTypeClient( documentType,  documentTypeName,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

}



