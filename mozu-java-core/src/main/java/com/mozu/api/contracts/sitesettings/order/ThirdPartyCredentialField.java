/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.sitesettings.order;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import com.mozu.api.contracts.sitesettings.order.VocabularyValue;

/**
 *	The properties of the credentials required to communicate with the external payment processor.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ThirdPartyCredentialField implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * System-supplied API name required to communicate with the external payment processor.
	 */
	protected String apiName;

	public String getApiName() {
		return this.apiName;
	}

	public void setApiName(String apiName) {
		this.apiName = apiName;
	}

	/**
	 * System-supplied name that displays for the third party credential field.
	 */
	protected String displayName;

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	protected String inputType;

	public String getInputType() {
		return this.inputType;
	}

	public void setInputType(String inputType) {
		this.inputType = inputType;
	}

	protected Boolean isSensitive;

	public Boolean getIsSensitive() {
		return this.isSensitive;
	}

	public void setIsSensitive(Boolean isSensitive) {
		this.isSensitive = isSensitive;
	}

	/**
	 * The value supplied for the third party credential.
	 */
	protected String value;

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	protected List<VocabularyValue> vocabularyValues;
	public List<VocabularyValue> getVocabularyValues() {
		return this.vocabularyValues;
	}
	public void setVocabularyValues(List<VocabularyValue> vocabularyValues) {
		this.vocabularyValues = vocabularyValues;
	}

}
