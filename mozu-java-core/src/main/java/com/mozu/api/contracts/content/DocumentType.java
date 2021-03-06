/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.contracts.content;

import java.util.List;
import java.util.HashMap;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.joda.time.DateTime;
import java.io.IOException;
import java.lang.ClassNotFoundException;
import com.mozu.api.contracts.content.Property;

/**
 *	The type of documents used in the CMS such as "web_page" or "template" or "image_url".
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentType implements Serializable
{
	// Default Serial Version UID
	private static final long serialVersionUID = 1L;

	/**
	 * The administrator name associated with the object/data.
	 */
	protected  String adminName;

	public String getAdminName() {
		return this.adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	/**
	 * Fully qualified name of the document type. 
	 */
	protected  String documentTypeFQN;

	public String getDocumentTypeFQN() {
		return this.documentTypeFQN;
	}

	public void setDocumentTypeFQN(String documentTypeFQN) {
		this.documentTypeFQN = documentTypeFQN;
	}

	/**
	 * The package of document lists and content documents to be installed.
	 */
	protected  String installationPackage;

	public String getInstallationPackage() {
		return this.installationPackage;
	}

	public void setInstallationPackage(String installationPackage) {
		this.installationPackage = installationPackage;
	}

	/**
	 * The user supplied name that appears in . You can use this field for identification purposes.
	 */
	protected  String name;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * The namespace for the accessible APIs and source capabilities in the core of  APIs.
	 */
	protected  String namespace;

	public String getNamespace() {
		return this.namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	/**
	 * The current version number of the order, wish list, document list, or document type list.
	 */
	protected  String version;

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	/**
	 * Metadata content for entities, used by document lists, document type lists, document type, views, entity lists, and list views.
	 */
	protected transient com.fasterxml.jackson.databind.JsonNode metadata;

	public com.fasterxml.jackson.databind.JsonNode getMetadata() {
		return this.metadata;
	}

	public void setMetadata(com.fasterxml.jackson.databind.JsonNode metadata) {
		this.metadata = metadata;
	}

	/**
	 * Collection of property attributes defined for the object. Properties are associated to all objects within , including documents, products, and product types.
	 */
	protected List<Property> properties;
	public List<Property> getProperties() {
		return this.properties;
	}
	public void setProperties(List<Property> properties) {
		this.properties = properties;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		out.defaultWriteObject();
		if(metadata == null){
			out.writeBoolean(false);
		} else {
			out.writeBoolean(true);
			new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_TARGET, false).writeValue(out, metadata);
		}
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		in.defaultReadObject();
		if(in.readBoolean()){
			this.metadata = new com.fasterxml.jackson.databind.ObjectMapper().configure(com.fasterxml.jackson.core.JsonParser.Feature.AUTO_CLOSE_SOURCE, false).readValue(in, com.fasterxml.jackson.databind.JsonNode.class);
		}
	}

}
