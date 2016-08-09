/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.productruntime.ProductPrice;
import com.mozu.api.contracts.productruntime.ProductPriceRange;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductVolumePrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected  Boolean isCurrent;

	public Boolean getIsCurrent() {
		return this.isCurrent;
	}

	public void setIsCurrent(Boolean isCurrent) {
		this.isCurrent = isCurrent;
	}

	protected  Integer maxQty;

	public Integer getMaxQty() {
		return this.maxQty;
	}

	public void setMaxQty(Integer maxQty) {
		this.maxQty = maxQty;
	}

	protected  Integer minQty;

	public Integer getMinQty() {
		return this.minQty;
	}

	public void setMinQty(Integer minQty) {
		this.minQty = minQty;
	}

	protected  ProductPrice price;

	public ProductPrice getPrice() {
		return this.price;
	}

	public void setPrice(ProductPrice price) {
		this.price = price;
	}

	protected  ProductPriceRange priceRange;

	public ProductPriceRange getPriceRange() {
		return this.priceRange;
	}

	public void setPriceRange(ProductPriceRange priceRange) {
		this.priceRange = priceRange;
	}


}