/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.paymentservice.response;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.paymentservice.FraudScreenResponseData;

/**
 *	Mozu.PaymentService.Contracts.Response.FraudScreen ApiType DOCUMENT_HERE 
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class FraudScreen implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Unique identifier of the payment interaction from the payment gateway.
	 */
	protected Integer gatewayInteractionId;

	public Integer getGatewayInteractionId() {
		return this.gatewayInteractionId;
	}

	public void setGatewayInteractionId(Integer gatewayInteractionId) {
		this.gatewayInteractionId = gatewayInteractionId;
	}

	/**
	 * The current status of an object. This status is specific to the object including payment (New, Authorized, Captured, Declined, Failed, Voided, Credited, CheckRequested, or RolledBack), discount (Active, Scheduled, or Expired), returns (ReturnAuthorized), tenant, package (Fulfilled or NotFulfilled), application, master and product catalogs, orders (Pending, Submitted, Processing, Pending Review, Closed, or Canceled), and order validation results (Pass, Fail, Error, or Review).
	 */
	protected String status;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * Mozu.PaymentService.Contracts.Response.FraudScreen transactionId ApiTypeMember DOCUMENT_HERE 
	 */
	protected String transactionId;

	public String getTransactionId() {
		return this.transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	/**
	 * Mozu.PaymentService.Contracts.Response.FraudScreen fraudScreenResponseData ApiTypeMember DOCUMENT_HERE 
	 */
	protected List<FraudScreenResponseData> fraudScreenResponseData;
	public List<FraudScreenResponseData> getFraudScreenResponseData() {
		return this.fraudScreenResponseData;
	}
	public void setFraudScreenResponseData(List<FraudScreenResponseData> fraudScreenResponseData) {
		this.fraudScreenResponseData = fraudScreenResponseData;
	}

}