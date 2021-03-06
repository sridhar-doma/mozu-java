/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.appdev;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.appdev.Attribute;

/**
 *	Mozu.AppDev.Contracts.ApplicationAttribute ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationAttribute implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Comma delimited list of attribute codes.
	 */
	protected  String attributeCodes;

	public String getAttributeCodes() {
		return this.attributeCodes;
	}

	public void setAttributeCodes(String attributeCodes) {
		this.attributeCodes = attributeCodes;
	}

	/**
	 * json representation of attribute definitions
	 */
	protected  String attributeJson;

	public String getAttributeJson() {
		return this.attributeJson;
	}

	public void setAttributeJson(String attributeJson) {
		this.attributeJson = attributeJson;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationAttribute isAppliedToBase ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Boolean isAppliedToBase;

	public Boolean getIsAppliedToBase() {
		return this.isAppliedToBase;
	}

	public void setIsAppliedToBase(Boolean isAppliedToBase) {
		this.isAppliedToBase = isAppliedToBase;
	}

	/**
	 * Mozu.AppDev.Contracts.ApplicationAttribute packageId ApiTypeMember DOCUMENT_HERE 
	 */
	protected  Integer packageId;

	public Integer getPackageId() {
		return this.packageId;
	}

	public void setPackageId(Integer packageId) {
		this.packageId = packageId;
	}

	/**
	 * Will contain ProductTypeCollection if Product, else AttributeSet
	 */
	protected  String productTypeJson;

	public String getProductTypeJson() {
		return this.productTypeJson;
	}

	public void setProductTypeJson(String productTypeJson) {
		this.productTypeJson = productTypeJson;
	}

	/**
	 * Source Tenant Id
	 */
	protected  Integer sourceTenantId;

	public Integer getSourceTenantId() {
		return this.sourceTenantId;
	}

	public void setSourceTenantId(Integer sourceTenantId) {
		this.sourceTenantId = sourceTenantId;
	}

	/**
	 * Source Tenant Name
	 */
	protected  String sourceTenantName;

	public String getSourceTenantName() {
		return this.sourceTenantName;
	}

	public void setSourceTenantName(String sourceTenantName) {
		this.sourceTenantName = sourceTenantName;
	}

	/**
	 * Customer, Order, or Product
	 */
	protected  String subsystem;

	public String getSubsystem() {
		return this.subsystem;
	}

	public void setSubsystem(String subsystem) {
		this.subsystem = subsystem;
	}

	/**
	 * Collection of attributes that may be paged list or a list, depending on the usage per object and API type. 
	 */
	protected List<Attribute> attributes;
	public List<Attribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<Attribute> attributes) {
		this.attributes = attributes;
	}


}
