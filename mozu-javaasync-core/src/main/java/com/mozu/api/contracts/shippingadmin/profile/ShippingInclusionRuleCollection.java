/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.shippingadmin.profile;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.shippingadmin.profile.ShippingInclusionRule;

/**
 *	Mozu.ShippingAdmin.Contracts.Profile.ShippingInclusionRuleCollection ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShippingInclusionRuleCollection implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Total number of objects in am item collection. Total counts are calculated for numerous objects in Mozu, including location inventory, products, options, product types, product reservations, categories, addresses, carriers, tax rates, time zones, and much more.
	 */
	protected  Integer totalCount;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	/**
	 * Collection list of items. All returned data is provided in an items array. For a failed request, the returned response may be success with an empty item collection. Items are used throughout APIs for carts, wish lists, documents, payments, returns, properties, and more.
	 */
	protected List<ShippingInclusionRule> items;
	public List<ShippingInclusionRule> getItems() {
		return this.items;
	}
	public void setItems(List<ShippingInclusionRule> items) {
		this.items = items;
	}


}
