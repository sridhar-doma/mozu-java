/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.pricingruntime;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.pricingruntime.TaxAttribute;
import com.mozu.api.contracts.pricingruntime.TaxableLineItem;
import com.mozu.api.contracts.pricingruntime.TaxContext;

/**
 *	Properties of an order to calculate tax against. When a tax capability is enabled for a tenant, Mozu sends the `TaxableOrder `properties to the capability as read-only, system-supplied information.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaxableOrder implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * 3-letter ISO 4217 standard global currency code. Currently, only "USD" (US Dollar) is supported.
	 */
	protected  String currencyCode;

	public String getCurrencyCode() {
		return this.currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	/**
	 * The combined price for all handling costs calculated together for shipped orders, not for digital or in-store pickup. This includes all handling costs per the product line items and options, excluding taxes and discounts. 
	 */
	protected  Double handlingFee;

	public Double getHandlingFee() {
		return this.handlingFee;
	}

	public void setHandlingFee(Double handlingFee) {
		this.handlingFee = handlingFee;
	}

	/**
	 * The date and time the order was submitted for purchase. 
	 */
	protected  DateTime orderDate;

	public DateTime getOrderDate() {
		return this.orderDate;
	}

	public void setOrderDate(DateTime orderDate) {
		this.orderDate = orderDate;
	}

	protected  Integer orderNumber;

	public Integer getOrderNumber() {
		return this.orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * The unique identifier of the original order, used to track order changes for tax purposes.
	 */
	protected  String originalDocumentCode;

	public String getOriginalDocumentCode() {
		return this.originalDocumentCode;
	}

	public void setOriginalDocumentCode(String originalDocumentCode) {
		this.originalDocumentCode = originalDocumentCode;
	}

	/**
	 * The date and time the original order was placed. This date is set when the order is submitted with payment. 
	 */
	protected  DateTime originalOrderDate;

	public DateTime getOriginalOrderDate() {
		return this.originalOrderDate;
	}

	public void setOriginalOrderDate(DateTime originalOrderDate) {
		this.originalOrderDate = originalOrderDate;
	}

	/**
	 * The calculated monetary amount of shipping for a line items within and an entire order.
	 */
	protected  Double shippingAmount;

	public Double getShippingAmount() {
		return this.shippingAmount;
	}

	public void setShippingAmount(Double shippingAmount) {
		this.shippingAmount = shippingAmount;
	}

	/**
	 * The type of request for which to tax this entity, which is Order or Return.
	 */
	protected  String taxRequestType;

	public String getTaxRequestType() {
		return this.taxRequestType;
	}

	public void setTaxRequestType(String taxRequestType) {
		this.taxRequestType = taxRequestType;
	}

	protected List<TaxAttribute> attributes;
	public List<TaxAttribute> getAttributes() {
		return this.attributes;
	}
	public void setAttributes(List<TaxAttribute> attributes) {
		this.attributes = attributes;
	}

	protected transient com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * List of line items associated with the order.
	 */
	protected List<TaxableLineItem> lineItems;
	public List<TaxableLineItem> getLineItems() {
		return this.lineItems;
	}
	public void setLineItems(List<TaxableLineItem> lineItems) {
		this.lineItems = lineItems;
	}

	/**
	 * The tax properties associated with the order.
	 */
	protected  TaxContext taxContext;

	public TaxContext getTaxContext() {
		return this.taxContext;
	}

	public void setTaxContext(TaxContext taxContext) {
		this.taxContext = taxContext;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(data == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, data);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.data = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
