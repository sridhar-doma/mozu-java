/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.clients.platform;

import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * platform/extensions related resources. DOCUMENT_HERE 
 * </summary>
 */
public class TenantExtensionsClient {
	
	/**
	 * platform-extensions Get GetExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=GetExtensionsClient();
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> getExtensionsClient() throws Exception
	{
		return getExtensionsClient( null);
	}

	/**
	 * platform-extensions Get GetExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=GetExtensionsClient( responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> getExtensionsClient(String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.TenantExtensionsUrl.getExtensionsUrl(responseFields);
		String verb = "GET";
		Class<?> clz = com.mozu.api.contracts.installedapplications.TenantExtensions.class;
		MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient = (MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		return mozuClient;

	}

	/**
	 * platform-extensions Put UpdateExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=UpdateExtensionsClient( extensions);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @param extensions Mozu.InstalledApplications.Contracts.TenantExtensions ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> updateExtensionsClient(com.mozu.api.contracts.installedapplications.TenantExtensions extensions) throws Exception
	{
		return updateExtensionsClient( extensions,  null);
	}

	/**
	 * platform-extensions Put UpdateExtensions description DOCUMENT_HERE 
	 * <p><pre><code>
	 * MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient=UpdateExtensionsClient( extensions,  responseFields);
	 * client.setBaseAddress(url);
	 * client.executeRequest();
	 * TenantExtensions tenantExtensions = client.Result();
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param extensions Mozu.InstalledApplications.Contracts.TenantExtensions ApiType DOCUMENT_HERE 
	 * @return Mozu.Api.MozuClient <com.mozu.api.contracts.installedapplications.TenantExtensions>
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 * @see com.mozu.api.contracts.installedapplications.TenantExtensions
	 */
	public static MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> updateExtensionsClient(com.mozu.api.contracts.installedapplications.TenantExtensions extensions, String responseFields) throws Exception
	{
		MozuUrl url = com.mozu.api.urls.platform.TenantExtensionsUrl.updateExtensionsUrl(responseFields);
		String verb = "PUT";
		Class<?> clz = com.mozu.api.contracts.installedapplications.TenantExtensions.class;
		MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions> mozuClient = (MozuClient<com.mozu.api.contracts.installedapplications.TenantExtensions>) MozuClientFactory.getInstance(clz);
		mozuClient.setVerb(verb);
		mozuClient.setResourceUrl(url);
		mozuClient.setBody(extensions);
		return mozuClient;

	}

}



