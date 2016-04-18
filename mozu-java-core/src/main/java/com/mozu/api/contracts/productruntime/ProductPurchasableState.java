/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productruntime;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.productruntime.ValidationMessage;

/**
 *	The current state of the product purchase determines whether or not the product is eligible for purchase. Products with options are only purchasable if the shopper has selected all required options. If the product is not ready for purchase, a message lists missing options that are required.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPurchasableState implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the entity has met all requirements and considered a purchasable entity.
	 */
	protected Boolean isPurchasable;

	public Boolean getIsPurchasable() {
		return this.isPurchasable;
	}

	public void setIsPurchasable(Boolean isPurchasable) {
		this.isPurchasable = isPurchasable;
	}

	/**
	 * List of messages associated with the product if the product is not ready for purchase.
	 */
	protected List<ValidationMessage> messages;
	public List<ValidationMessage> getMessages() {
		return this.messages;
	}
	public void setMessages(List<ValidationMessage> messages) {
		this.messages = messages;
	}

}
