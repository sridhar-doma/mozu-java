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
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Facets resource to manage the facets shoppers use to filter product display results on a storefront. Facets can include categories, product attributes, or prices, and use either a range of values or discrete values.
 * </summary>
 */
public class FacetResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public FacetResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * Retrieves a facet specified by its unique identifier and displays its properties.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	Facet facet = facet.getFacet( facetId);
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @return com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public com.mozu.api.contracts.productadmin.Facet getFacet(Integer facetId) throws Exception
	{
		return getFacet( facetId,  null,  null);
	}

	/**
	 * Retrieves a facet specified by its unique identifier and displays its properties.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	Facet facet = facet.getFacet( facetId,  validate,  responseFields);
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to retrieve.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public com.mozu.api.contracts.productadmin.Facet getFacet(Integer facetId, Boolean validate, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Facet> client = com.mozu.api.clients.commerce.catalog.admin.FacetClient.getFacetClient( facetId,  validate,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Retrieves a list of the facets defined for the specified category.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	FacetSet facetSet = facet.getFacetCategoryList( categoryId);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category associated with the facets to retrieve.
	 * @return com.mozu.api.contracts.productadmin.FacetSet
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public com.mozu.api.contracts.productadmin.FacetSet getFacetCategoryList(Integer categoryId) throws Exception
	{
		return getFacetCategoryList( categoryId,  null,  null,  null);
	}

	/**
	 * Retrieves a list of the facets defined for the specified category.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	FacetSet facetSet = facet.getFacetCategoryList( categoryId,  includeAvailable,  validate,  responseFields);
	 * </code></pre></p>
	 * @param categoryId Unique identifier of the category associated with the facets to retrieve.
	 * @param includeAvailable If true, returns a list of the attributes and categories associated with a product type that have not been defined as a facet for the category.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param validate Validates that the product category associated with a facet is active. System-supplied and read only.
	 * @return com.mozu.api.contracts.productadmin.FacetSet
	 * @see com.mozu.api.contracts.productadmin.FacetSet
	 */
	public com.mozu.api.contracts.productadmin.FacetSet getFacetCategoryList(Integer categoryId, Boolean includeAvailable, Boolean validate, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.FacetSet> client = com.mozu.api.clients.commerce.catalog.admin.FacetClient.getFacetCategoryListClient( categoryId,  includeAvailable,  validate,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Creates a new category, price, or attribute facet. Define the category or attribute source to use for the facet values.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	Facet facet = facet.addFacet( facet);
	 * </code></pre></p>
	 * @param facet Properties of the new facet to create. You must specify the source, type, and category.
	 * @return com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public com.mozu.api.contracts.productadmin.Facet addFacet(com.mozu.api.contracts.productadmin.Facet facet) throws Exception
	{
		return addFacet( facet,  null);
	}

	/**
	 * Creates a new category, price, or attribute facet. Define the category or attribute source to use for the facet values.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	Facet facet = facet.addFacet( facet,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param facet Properties of the new facet to create. You must specify the source, type, and category.
	 * @return com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public com.mozu.api.contracts.productadmin.Facet addFacet(com.mozu.api.contracts.productadmin.Facet facet, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Facet> client = com.mozu.api.clients.commerce.catalog.admin.FacetClient.addFacetClient( facet,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Modifies one or more properties of a defined facet.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	Facet facet = facet.updateFacet( facet,  facetId);
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to modify.
	 * @param facet Properties of the defined facet to modify.
	 * @return com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public com.mozu.api.contracts.productadmin.Facet updateFacet(com.mozu.api.contracts.productadmin.Facet facet, Integer facetId) throws Exception
	{
		return updateFacet( facet,  facetId,  null);
	}

	/**
	 * Modifies one or more properties of a defined facet.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	Facet facet = facet.updateFacet( facet,  facetId,  responseFields);
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to modify.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param facet Properties of the defined facet to modify.
	 * @return com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 * @see com.mozu.api.contracts.productadmin.Facet
	 */
	public com.mozu.api.contracts.productadmin.Facet updateFacet(com.mozu.api.contracts.productadmin.Facet facet, Integer facetId, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.productadmin.Facet> client = com.mozu.api.clients.commerce.catalog.admin.FacetClient.updateFacetClient( facet,  facetId,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * Deletes the facet specified by its unique identifier.
	 * <p><pre><code>
	 *	Facet facet = new Facet();
	 *	facet.deleteFacetById( facetId);
	 * </code></pre></p>
	 * @param facetId Unique identifier of the facet to delete.
	 * @return 
	 */
	public void deleteFacetById(Integer facetId) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.catalog.admin.FacetClient.deleteFacetByIdClient( facetId);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



