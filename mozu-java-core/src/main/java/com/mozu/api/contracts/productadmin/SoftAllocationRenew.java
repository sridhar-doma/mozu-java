/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.productadmin;

import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SoftAllocationRenew implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	protected DateTime expiresAt;

	public DateTime getExpiresAt() {
		return this.expiresAt;
	}

	public void setExpiresAt(DateTime expiresAt) {
		this.expiresAt = expiresAt;
	}

	protected List<Integer> ids;
	public List<Integer> getIds() {
		return this.ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}

}