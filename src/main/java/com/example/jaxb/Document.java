package com.example.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Document")
public class Document {
	Properties properties;

	public Properties getProperties() {
		return properties;
	}

	@XmlElement(name = "Properties")
	public void setProperties(Properties properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		return "Document [properties=" + properties + "]";
	}

}
