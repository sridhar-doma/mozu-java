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
import com.mozu.api.resources.commerce.orders.BillingInfoResource;

/** <summary>
 * Use the Billing Info subresource to manage the billing information stored for an order.
 * </summary>
 */
public class BillingInfoFactory
{

	public static com.mozu.api.contracts.commerceruntime.payments.BillingInfo getBillingInfo(ApiContext apiContext, String orderId, int expectedCode) throws Exception
	{
		return getBillingInfo(apiContext,  orderId,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.payments.BillingInfo getBillingInfo(ApiContext apiContext, String orderId, Boolean draft, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.payments.BillingInfo returnObj = new com.mozu.api.contracts.commerceruntime.payments.BillingInfo();
		BillingInfoResource resource = new BillingInfoResource(apiContext);
		try
		{
			returnObj = resource.getBillingInfo( orderId,  draft,  responseFields);
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

	public static com.mozu.api.contracts.commerceruntime.payments.BillingInfo setBillingInfo(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId, int expectedCode) throws Exception
	{
		return setBillingInfo(apiContext,  billingInfo,  orderId,  null,  null,  null, expectedCode);
	}

	public static com.mozu.api.contracts.commerceruntime.payments.BillingInfo setBillingInfo(ApiContext apiContext, com.mozu.api.contracts.commerceruntime.payments.BillingInfo billingInfo, String orderId, String updateMode, String version, String responseFields, int expectedCode) throws Exception
	{
		com.mozu.api.contracts.commerceruntime.payments.BillingInfo returnObj = new com.mozu.api.contracts.commerceruntime.payments.BillingInfo();
		BillingInfoResource resource = new BillingInfoResource(apiContext);
		try
		{
			returnObj = resource.setBillingInfo( billingInfo,  orderId,  updateMode,  version,  responseFields);
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



