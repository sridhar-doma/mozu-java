/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.core.extensible;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;

/**
 *	Properties of a metadata item defined for an attribute.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AttributeMetadataItem implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * Key used for metadata defined for objects, including extensible attributes, custom attributes associated with a shipping provider, and search synonyms definitions. This content may be user-defined depending on the object and usage.
	 */
	protected  String key;

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * The value of a property, used by numerous objects within Mozu including facets, attributes, products, localized content, metadata, capabilities (Mozu and third-party), location inventory adjustment, and more. The value may be a string, integer, or double. Validation may be run against the entered and saved values depending on the object type.
	 */
	protected  String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}


}
