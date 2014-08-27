/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.admin.products.ProductVariationResource;

/** <summary>
 * Use the product variations sub-resource to manage the variations of a product based on its attributes. For example, a t-shirt product could be offered in six variations: Small Black, Medium Black, Large Black, Small White, Medium White, and Large White.
 * </summary>
 */
public class ProductVariationFactory
{

	public static com.mozu.api.contracts.productadmin.ProductVariation getProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariation returnObj = new com.mozu.api.contracts.productadmin.ProductVariation();
		ProductVariationResource resource = new ProductVariationResource(apiContext);
		try
		{
			returnObj = resource.getProductVariation(dataViewMode,  productCode,  variationKey);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productadmin.ProductVariationPagedCollection getProductVariations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, int expectedCode, int successCode) throws Exception
	{
		return getProductVariations(apiContext, dataViewMode,  productCode,  null,  null,  null,  null, expectedCode, successCode );
	}

	public static com.mozu.api.contracts.productadmin.ProductVariationPagedCollection getProductVariations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, Integer startIndex, Integer pageSize, String sortBy, String filter, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationPagedCollection returnObj = new com.mozu.api.contracts.productadmin.ProductVariationPagedCollection();
		ProductVariationResource resource = new ProductVariationResource(apiContext);
		try
		{
			returnObj = resource.getProductVariations(dataViewMode,  productCode,  startIndex,  pageSize,  sortBy,  filter);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productadmin.ProductVariationCollection updateProductVariations(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariationCollection productVariations, String productCode, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariationCollection returnObj = new com.mozu.api.contracts.productadmin.ProductVariationCollection();
		ProductVariationResource resource = new ProductVariationResource(apiContext);
		try
		{
			returnObj = resource.updateProductVariations(dataViewMode,  productVariations,  productCode);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static com.mozu.api.contracts.productadmin.ProductVariation updateProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, com.mozu.api.contracts.productadmin.ProductVariation productVariation, String productCode, String variationKey, int expectedCode, int successCode) throws Exception
	{
		com.mozu.api.contracts.productadmin.ProductVariation returnObj = new com.mozu.api.contracts.productadmin.ProductVariation();
		ProductVariationResource resource = new ProductVariationResource(apiContext);
		try
		{
			returnObj = resource.updateProductVariation(dataViewMode,  productVariation,  productCode,  variationKey);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
			else
				return null;
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		return returnObj;

	}

	public static void deleteProductVariation(ApiContext apiContext, com.mozu.api.DataViewMode dataViewMode, String productCode, String variationKey, int expectedCode, int successCode) throws Exception
	{
				ProductVariationResource resource = new ProductVariationResource(apiContext);
		try
		{
			resource.deleteProductVariation(dataViewMode,  productCode,  variationKey);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException(e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");
		}
		if(expectedCode != successCode)
			 throw new TestFailException(successCode, Thread.currentThread().getStackTrace()[2].getMethodName(), expectedCode, "");

	}

}



