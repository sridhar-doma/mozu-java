/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PriceListEntryPrice implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected Double listPrice;

	public Double getListPrice() {
		return this.listPrice;
	}

	public void setListPrice(Double listPrice) {
		this.listPrice = listPrice;
	}

	protected String listPriceMode;

	public String getListPriceMode() {
		return this.listPriceMode;
	}

	public void setListPriceMode(String listPriceMode) {
		this.listPriceMode = listPriceMode;
	}

	protected Integer minQty;

	public Integer getMinQty() {
		return this.minQty;
	}

	public void setMinQty(Integer minQty) {
		this.minQty = minQty;
	}

	protected Double salePrice;

	public Double getSalePrice() {
		return this.salePrice;
	}

	public void setSalePrice(Double salePrice) {
		this.salePrice = salePrice;
	}

	protected String salePriceMode;

	public String getSalePriceMode() {
		return this.salePriceMode;
	}

	public void setSalePriceMode(String salePriceMode) {
		this.salePriceMode = salePriceMode;
	}

}
