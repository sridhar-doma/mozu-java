/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.commerceruntime.fulfillment;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.core.AuditInfo;
import com.mozu.api.contracts.core.Contact;

/**
 *	Properties of the information needed to fulfill an order, whether via in-store pickup or direct shipping.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FulfillmentInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the shipping destination for a shipment is a commercial address.
	 */
	protected Boolean isDestinationCommercial;

	public Boolean getIsDestinationCommercial() {
		return this.isDestinationCommercial;
	}

	public void setIsDestinationCommercial(Boolean isDestinationCommercial) {
		this.isDestinationCommercial = isDestinationCommercial;
	}

	/**
	 * The code associated with the carrier's shipping method service type. Service type codes include a prefix that indicates the carrier. For example: FEDEX_INTERNATIONAL_STANDARD
	 */
	protected String shippingMethodCode;

	public String getShippingMethodCode() {
		return this.shippingMethodCode;
	}

	public void setShippingMethodCode(String shippingMethodCode) {
		this.shippingMethodCode = shippingMethodCode;
	}

	/**
	 * The carrier-supplied name for the shipping service type, such as "UPS Ground" or "2nd Day Air".
	 */
	protected String shippingMethodName;

	public String getShippingMethodName() {
		return this.shippingMethodName;
	}

	public void setShippingMethodName(String shippingMethodName) {
		this.shippingMethodName = shippingMethodName;
	}

	/**
	 * Identifier and datetime stamp information recorded when a user or application creates, updates, or deletes a resource entity. This value is system-supplied and read-only.
	 */
	protected AuditInfo auditInfo;

	public AuditInfo getAuditInfo() {
		return this.auditInfo;
	}

	public void setAuditInfo(AuditInfo auditInfo) {
		this.auditInfo = auditInfo;
	}

	protected com.fasterxml.jackson.databind.JsonNode data;

	public com.fasterxml.jackson.databind.JsonNode getData() {
		return this.data;
	}

	public void setData(com.fasterxml.jackson.databind.JsonNode data) {
		this.data = data;
	}

	/**
	 * The contact information of the person receiving the shipment or performing the pickup.
	 */
	protected Contact fulfillmentContact;

	public Contact getFulfillmentContact() {
		return this.fulfillmentContact;
	}

	public void setFulfillmentContact(Contact fulfillmentContact) {
		this.fulfillmentContact = fulfillmentContact;
	}

}
