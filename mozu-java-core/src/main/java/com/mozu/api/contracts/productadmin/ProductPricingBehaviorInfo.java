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

/**
 *	Properties that describe the behavior the system uses when determining the price of the product.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductPricingBehaviorInfo implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * If true, the system cannot apply any discounts to this product. Discount restrictions are defined at the master catalog level. Client administrators cannot override discount restrictions at the catalog level, but they can limit the restriction to a defined time interval.
	 */
	protected Boolean discountsRestricted;

	public Boolean getDiscountsRestricted() {
		return this.discountsRestricted;
	}

	public void setDiscountsRestricted(Boolean discountsRestricted) {
		this.discountsRestricted = discountsRestricted;
	}

	/**
	 * If discounts are restricted for this product, the date and time the discount restriction ends, in UTC datetime.
	 */
	protected DateTime discountsRestrictedEndDate;

	public DateTime getDiscountsRestrictedEndDate() {
		return this.discountsRestrictedEndDate;
	}

	public void setDiscountsRestrictedEndDate(DateTime discountsRestrictedEndDate) {
		this.discountsRestrictedEndDate = discountsRestrictedEndDate;
	}

	/**
	 * If discounts are restricted for this product, the date and time the discount restriction begins, in UTC datetime.
	 */
	protected DateTime discountsRestrictedStartDate;

	public DateTime getDiscountsRestrictedStartDate() {
		return this.discountsRestrictedStartDate;
	}

	public void setDiscountsRestrictedStartDate(DateTime discountsRestrictedStartDate) {
		this.discountsRestrictedStartDate = discountsRestrictedStartDate;
	}

	protected String variationPricingMethod;

	public String getVariationPricingMethod() {
		return this.variationPricingMethod;
	}

	public void setVariationPricingMethod(String variationPricingMethod) {
		this.variationPricingMethod = variationPricingMethod;
	}

}
