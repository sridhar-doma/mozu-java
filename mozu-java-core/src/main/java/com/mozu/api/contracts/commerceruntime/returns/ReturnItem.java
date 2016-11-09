/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.returns;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.commerceruntime.returns.ReturnBundle;
import com.mozu.api.contracts.commerceruntime.orders.OrderNote;
import com.mozu.api.contracts.commerceruntime.products.Product;
import com.mozu.api.contracts.commerceruntime.returns.ReturnReason;

/**
 *	Properties of a previously fulfilled item associated with a return.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReturnItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the source product property. For a product field it will be the name of the field. For a product attribute it will be the Attribute FQN. 
	 */
	protected  String id;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/**
	 * Unique identifier of the order item associated with a validation message, order, or return.
	 */
	protected  String orderItemId;

	public String getOrderItemId() {
		return this.orderItemId;
	}

	public void setOrderItemId(String orderItemId) {
		this.orderItemId = orderItemId;
	}

	/**
	 * This is the Option attribute FQN for the item being returned .. typically only when the return item is a product bundle item.
	 */
	protected  String orderItemOptionAttributeFQN;

	public String getOrderItemOptionAttributeFQN() {
		return this.orderItemOptionAttributeFQN;
	}

	public void setOrderItemOptionAttributeFQN(String orderItemOptionAttributeFQN) {
		this.orderItemOptionAttributeFQN = orderItemOptionAttributeFQN;
	}

	/**
	 * The OrderLineId that this ReturnItem is associated with. If order item is present, the orderLineId should be present also.
	 */
	protected  Integer orderLineId;

	public Integer getOrderLineId() {
		return this.orderLineId;
	}

	public void setOrderLineId(Integer orderLineId) {
		this.orderLineId = orderLineId;
	}

	/**
	 * The total value of the product returned to the merchant for accounting purposes, calculated by multiplying the cost of the item by its quantity returned.
	 */
	protected  Double productLossAmount;

	public Double getProductLossAmount() {
		return this.productLossAmount;
	}

	public void setProductLossAmount(Double productLossAmount) {
		this.productLossAmount = productLossAmount;
	}

	/**
	 * The total tax amount levied on the product loss amount.
	 */
	protected  Double productLossTaxAmount;

	public Double getProductLossTaxAmount() {
		return this.productLossTaxAmount;
	}

	public void setProductLossTaxAmount(Double productLossTaxAmount) {
		this.productLossTaxAmount = productLossTaxAmount;
	}

	/**
	 * The actual quantity received for the return item.
	 */
	protected  Integer quantityReceived;

	public Integer getQuantityReceived() {
		return this.quantityReceived;
	}

	public void setQuantityReceived(Integer quantityReceived) {
		this.quantityReceived = quantityReceived;
	}

	protected  Integer quantityReplaced;

	public Integer getQuantityReplaced() {
		return this.quantityReplaced;
	}

	public void setQuantityReplaced(Integer quantityReplaced) {
		this.quantityReplaced = quantityReplaced;
	}

	/**
	 * The quantity of returned items that can be returned to active product stock.
	 */
	protected  Integer quantityRestockable;

	public Integer getQuantityRestockable() {
		return this.quantityRestockable;
	}

	public void setQuantityRestockable(Integer quantityRestockable) {
		this.quantityRestockable = quantityRestockable;
	}

	/**
	 * The quantity of the item shipped to the shopper in the event of a return item replacement.
	 */
	protected  Integer quantityShipped;

	public Integer getQuantityShipped() {
		return this.quantityShipped;
	}

	public void setQuantityShipped(Integer quantityShipped) {
		this.quantityShipped = quantityShipped;
	}

	protected  String receiveStatus;

	public String getReceiveStatus() {
		return this.receiveStatus;
	}

	public void setReceiveStatus(String receiveStatus) {
		this.receiveStatus = receiveStatus;
	}

	protected  Double refundAmount;

	public Double getRefundAmount() {
		return this.refundAmount;
	}

	public void setRefundAmount(Double refundAmount) {
		this.refundAmount = refundAmount;
	}

	protected  String refundStatus;

	public String getRefundStatus() {
		return this.refundStatus;
	}

	public void setRefundStatus(String refundStatus) {
		this.refundStatus = refundStatus;
	}

	protected  String replaceStatus;

	public String getReplaceStatus() {
		return this.replaceStatus;
	}

	public void setReplaceStatus(String replaceStatus) {
		this.replaceStatus = replaceStatus;
	}

	protected  Boolean returnNotRequired;

	public Boolean getReturnNotRequired() {
		return this.returnNotRequired;
	}

	public void setReturnNotRequired(Boolean returnNotRequired) {
		this.returnNotRequired = returnNotRequired;
	}

	protected  String returnType;

	public String getReturnType() {
		return this.returnType;
	}

	public void setReturnType(String returnType) {
		this.returnType = returnType;
	}

	/**
	 * The total value of shipping the returned product to the merchant for accounting purposes, calculated by multiplying the shipping cost of the item by its quantity returned.
	 */
	protected  Double shippingLossAmount;

	public Double getShippingLossAmount() {
		return this.shippingLossAmount;
	}

	public void setShippingLossAmount(Double shippingLossAmount) {
		this.shippingLossAmount = shippingLossAmount;
	}

	/**
	 * The total tax amount levied on the shipping loss amount.
	 */
	protected  Double shippingLossTaxAmount;

	public Double getShippingLossTaxAmount() {
		return this.shippingLossTaxAmount;
	}

	public void setShippingLossTaxAmount(Double shippingLossTaxAmount) {
		this.shippingLossTaxAmount = shippingLossTaxAmount;
	}

	protected  Double totalWithoutWeightedShippingAndHandling;

	public Double getTotalWithoutWeightedShippingAndHandling() {
		return this.totalWithoutWeightedShippingAndHandling;
	}

	public void setTotalWithoutWeightedShippingAndHandling(Double totalWithoutWeightedShippingAndHandling) {
		this.totalWithoutWeightedShippingAndHandling = totalWithoutWeightedShippingAndHandling;
	}

	protected  Double totalWithWeightedShippingAndHandling;

	public Double getTotalWithWeightedShippingAndHandling() {
		return this.totalWithWeightedShippingAndHandling;
	}

	public void setTotalWithWeightedShippingAndHandling(Double totalWithWeightedShippingAndHandling) {
		this.totalWithWeightedShippingAndHandling = totalWithWeightedShippingAndHandling;
	}

	/**
	 * Properties of a collection of component products that make up a single product bundle with its own product code. Tenants can define product bundles for any product type that supports the Bundle product usage.
	 */
	protected List<ReturnBundle> bundledProducts;
	public List<ReturnBundle> getBundledProducts() {
		return this.bundledProducts;
	}
	public void setBundledProducts(List<ReturnBundle> bundledProducts) {
		this.bundledProducts = bundledProducts;
	}

	/**
	 * Paged list collection of note content for objects including customers, orders, and returns. 
	 */
	protected List<OrderNote> notes;
	public List<OrderNote> getNotes() {
		return this.notes;
	}
	public void setNotes(List<OrderNote> notes) {
		this.notes = notes;
	}

	/**
	 * The properties of a product, referenced and used by carts, orders, wish lists, and returns.
	 */
	protected  Product product;

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * The list of return reasons for the item and the quantity associated with each return reason.
	 */
	protected List<ReturnReason> reasons;
	public List<ReturnReason> getReasons() {
		return this.reasons;
	}
	public void setReasons(List<ReturnReason> reasons) {
		this.reasons = reasons;
	}


}
