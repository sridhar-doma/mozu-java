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
import com.mozu.api.contracts.reference.FieldData;

/**
 *	A property that is a wrapper for additional properties pertaining to the schema such as the type, label, any associated data, an ID, and the order of the response.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Field implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Identifier of the field.
	 */
	protected Integer id;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Label for the field.
	 */
	protected String label;

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * Sequence of the field.
	 */
	protected Integer order;

	public Integer getOrder() {
		return this.order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	/**
	 * Type of field.
	 */
	protected String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Data for the field property.
	 */
	protected List<FieldData> data;
	public List<FieldData> getData() {
		return this.data;
	}
	public void setData(List<FieldData> data) {
		this.data = data;
	}

}
