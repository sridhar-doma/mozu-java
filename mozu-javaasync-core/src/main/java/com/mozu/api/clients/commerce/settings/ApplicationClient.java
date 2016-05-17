/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.commerce.settings;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Applications resource to update site-specific settings for installed applications.
 * </summary>
 */
public class ApplicationClient {
	
	/**
	 * Retrieve the settings of a third-party application.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient=ThirdPartyGetApplicationClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.application.Application>
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.application.Application> thirdPartyGetApplicationClient() throws Exception
	{
		return thirdPartyGetApplicationClient( null);
	}

	/**
	 * Retrieve the settings of a third-party application.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient=ThirdPartyGetApplicationClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.application.Application>
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.application.Application> thirdPartyGetApplicationClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.ApplicationUrl.thirdPartyGetApplicationUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.sitesettings.application.Application.class;
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.application.Application>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * Initializes an application with the necessary configured settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient=ThirdPartyUpdateApplicationClient( application);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param application Properties of the application to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.application.Application>
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.application.Application> thirdPartyUpdateApplicationClient(com.mozu.api.contracts.sitesettings.application.Application application) throws Exception
	{
		return thirdPartyUpdateApplicationClient( application,  null);
	}

	/**
	 * Initializes an application with the necessary configured settings.
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient=ThirdPartyUpdateApplicationClient( application,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * Application application = client.Result();
	 * </code></pre></p>
	 * @param responseFields Use this field to include those fields which are not included by default.
	 * @param application Properties of the application to update.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.sitesettings.application.Application>
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 * @see com.mozu.api.contracts.sitesettings.application.Application
	 */
	public static MozuClient<com.mozu.api.contracts.sitesettings.application.Application> thirdPartyUpdateApplicationClient(com.mozu.api.contracts.sitesettings.application.Application application, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.commerce.settings.ApplicationUrl.thirdPartyUpdateApplicationUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.sitesettings.application.Application.class;
		MozuClient<com.mozu.api.contracts.sitesettings.application.Application> mozuClient = (MozuClient<com.mozu.api.contracts.sitesettings.application.Application>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(application);
		return mozuClient;

	}

}



