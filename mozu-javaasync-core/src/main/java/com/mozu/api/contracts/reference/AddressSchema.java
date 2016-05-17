/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.reference;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.reference.Field;

/**
 *	Describes the structure of postal addresses based on the country specified. Because addresses vary from country to country, this schema allows a flexible storage structure.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressSchema implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The 2-letter geographic code representing the country for the physical or mailing address. Currently limited to the US.
	 */
	protected String countryCode;

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	/**
	 * The label associated with this country.
	 */
	protected String countryLabel;

	public String getCountryLabel() {
		return this.countryLabel;
	}

	public void setCountryLabel(String countryLabel) {
		this.countryLabel = countryLabel;
	}

	/**
	 * The unique identifier of this postal address schema.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * The fields to display for postal addresses associated with this country.
	 */
	protected List<Field> fields;
	public List<Field> getFields() {
		return this.fields;
	}
	public void setFields(List<Field> fields) {
		this.fields = fields;
	}

}
