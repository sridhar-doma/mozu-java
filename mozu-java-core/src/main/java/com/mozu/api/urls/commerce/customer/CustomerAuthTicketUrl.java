/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.customer;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;


public class CustomerAuthTicketUrl
{

	/**
	 * Get Resource Url for CreateAnonymousShopperAuthTicket
	 * @return   String Resource Url
	 */
	public static MozuUrl createAnonymousShopperAuthTicketUrl()
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/anonymousshopper");
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for CreateUserAuthTicket
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl createUserAuthTicketUrl(String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/?responseFields={responseFields}");
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for RefreshUserAuthTicket
	 * @param refreshToken Alphanumeric string used for access tokens. This token refreshes access for accounts by generating a new developer or application account authentication ticket after an access token expires.
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return   String Resource Url
	 */
	public static MozuUrl refreshUserAuthTicketUrl(String refreshToken, String responseFields)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/customer/authtickets/refresh?refreshToken={refreshToken}&responseFields={responseFields}");
		formatter.formatUrl("refreshToken", refreshToken);
		formatter.formatUrl("responseFields", responseFields);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

