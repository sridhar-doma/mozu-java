/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.orders;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class BillingInfoUrl
{

	/**
	 * Get Resource Url for GetBillingInfo
	 * @param draft If true, retrieve the draft version of the order billing information, which might include uncommitted changes.
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl getBillingInfoUrl(Boolean draft, String orderId, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/billinginfo?draft={draft}&responseFields={responseFields}");
		formatter.formatUrl("draft", draft);
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for SetBillingInfo
	 * @param orderId Unique identifier of the order.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param updateMode Specifies whether to set the billing information by updating the original order, updating the order in draft mode, or updating the order in draft mode and then committing the changes to the original. Draft mode enables users to make incremental order changes before committing the changes to the original order. Valid values are "ApplyToOriginal," "ApplyToDraft," or "ApplyAndCommit."
	 * @param version System-supplied integer that represents the current version of the order, which prevents users from unintentionally overriding changes to the order. When a user performs an operation for a defined order, the system validates that the version of the updated order matches the version of the order on the server. After the operation completes successfully, the system increments the version number by one.
	 * @return   String Resource Url
	 */
	public static MozuUrl setBillingInfoUrl(String orderId, String responseFields, String updateMode, String version)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/orders/{orderId}/billinginfo?updatemode={updateMode}&version={version}&responseFields={responseFields}");
		formatter.formatUrl("orderId", orderId);
		formatter.formatUrl("responseFields", responseFields);
		formatter.formatUrl("updateMode", updateMode);
		formatter.formatUrl("version", version);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

