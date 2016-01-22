/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.installedapplications;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.installedapplications.Capability;

/**
 *	Properties of an app installed in a tenant.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Application implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of an app available in your Mozu tenant or within Mozu Dev Center. This ID is unique across all apps installed, initialized, and enabled in the Mozu Admin and those in development through the Dev Center Console.
	 */
	protected String appId;

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	/**
	 * denotes the Application Key for the app.
	 */
	protected String appKey;

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
	}

	/**
	 * Indicates if the capability or app is enabled for the tenant/site. If true, the capability/application is enabled for the tenant. System-supplied and read-only.
	 */
	protected Boolean enabled;

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * Indicates if an app is initialized and capable of being enabled in the tenant and site. Apps will need to be installed and configured to become initialized, such as validating credentials and/or API keys with a third-party service. If true, the app is initialized and can be enabled for usage.
	 */
	protected Boolean initialized;

	public Boolean getInitialized() {
		return this.initialized;
	}

	public void setInitialized(Boolean initialized) {
		this.initialized = initialized;
	}

	/**
	 * Indicates if the installed application is of type extension. If true, the application type is Extension.
	 */
	protected Boolean isExtension;

	public Boolean getIsExtension() {
		return this.isExtension;
	}

	public void setIsExtension(Boolean isExtension) {
		this.isExtension = isExtension;
	}

	/**
	 * denotes if the Application is certified to use extension
	 */
	protected Boolean isExtensionCertified;

	public Boolean getIsExtensionCertified() {
		return this.isExtensionCertified;
	}

	public void setIsExtensionCertified(Boolean isExtensionCertified) {
		this.isExtensionCertified = isExtensionCertified;
	}

	/**
	 * The URL defined for the application that represents the configuration website for the capability. This value is used by installed applications or the site.
	 */
	protected String uiConfigurationUrl;

	public String getUiConfigurationUrl() {
		return this.uiConfigurationUrl;
	}

	public void setUiConfigurationUrl(String uiConfigurationUrl) {
		this.uiConfigurationUrl = uiConfigurationUrl;
	}

	/**
	 * List of capabilities installed in a tenant.
	 */
	protected List<Capability> capabilities;
	public List<Capability> getCapabilities() {
		return this.capabilities;
	}
	public void setCapabilities(List<Capability> capabilities) {
		this.capabilities = capabilities;
	}

}
