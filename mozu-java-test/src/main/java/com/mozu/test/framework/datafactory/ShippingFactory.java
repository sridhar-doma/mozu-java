/**
 *     This code was auto-generated by a tool.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
*/
package com.mozu.test.framework.datafactory;

import java.util.List;
import java.util.ArrayList;
import org.apache.http.HttpStatus;
import com.mozu.api.ApiException;
import com.mozu.api.ApiContext;
import com.mozu.test.framework.core.TestFailException;
import com.mozu.api.resources.commerce.catalog.storefront.ShippingResource;

/** <summary>
 * Use the Storefront Shipping resource to retrieve shipping rate information from the website.
 * </summary>
 */
public class ShippingFactory
{

	public static com.mozu.api.contracts.shippingruntime.RatesResponse getRates(ApiContext apiContext, com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, int expectedCode) throws Exception
	{
		return getRates(apiContext,  rateRequest,  null, expectedCode);
	}

	public static com.mozu.api.contracts.shippingruntime.RatesResponse getRates(ApiContext apiContext, com.mozu.api.contracts.shippingruntime.RateRequest rateRequest, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.shippingruntime.RatesResponse returnObj = new com.mozu.api.contracts.shippingruntime.RatesResponse();
		ShippingResource resource = new ShippingResource(apiContext);
		try
		{
			returnObj = resource.getRates( rateRequest,  responseFields);
		}
		catch (ApiException e)
		{
			if(e.getHttpStatusCode() != expectedCode)
				throw new TestFailException("" + e.getHttpStatusCode(), Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
			else
				return null;
		}
		if(expectedCode != 304 && !(expectedCode >= 200 && expectedCode <= 300) && !(expectedCode == HttpStatus.SC_NOT_FOUND && returnObj == null))
			throw new TestFailException("304 or between 200 and 300", Thread.currentThread().getStackTrace()[2].getMethodName(), "" + expectedCode, "");
		return returnObj;
	}

}



