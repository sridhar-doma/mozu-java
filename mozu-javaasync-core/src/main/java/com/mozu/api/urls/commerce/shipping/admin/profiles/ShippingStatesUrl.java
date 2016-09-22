/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.urls.commerce.shipping.admin.profiles;

import com.mozu.api.MozuUrl;
import com.mozu.api.utils.UrlFormatter;
import org.joda.time.DateTime;

public class ShippingStatesUrl
{

	/**
	 * Get Resource Url for GetStates
	 * @param profileCode The unique, user-defined code of the profile with which the shipping state is associated.
	 * @return   String Resource Url
	 */
	public static MozuUrl getStatesUrl(String profileCode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/shippingstates");
		formatter.formatUrl("profileCode", profileCode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

	/**
	 * Get Resource Url for UpdateStates
	 * @param profilecode The unique, user-defined code of the profile with which the shipping state is associated.
	 * @return   String Resource Url
	 */
	public static MozuUrl updateStatesUrl(String profilecode)
	{
		UrlFormatter formatter = new UrlFormatter("/api/commerce/shipping/admin/profiles/{profilecode}/shippingstates");
		formatter.formatUrl("profilecode", profilecode);
		return new MozuUrl(formatter.getResourceUrl(), MozuUrl.UrlLocation.TENANT_POD) ;
	}

}

