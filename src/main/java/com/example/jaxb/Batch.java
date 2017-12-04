package com.example.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "headers", "documents" })
@XmlRootElement(name = "batch")
public class Batch {
	Headers headers;
	Documents documents;

	public Headers getHeaders() {
		return headers;
	}

	@XmlElement(name = "Headers")
	public void setHeaders(Headers headers) {
		this.headers = headers;
	}

	public Documents getDocuments() {
		return documents;
	}

	@XmlElement(name = "Documents")
	public void setDocuments(Documents documents) {
		this.documents = documents;
	}

	@Override
	public String toString() {
		return "Batch [headers=" + headers + ", documents=" + documents + "]";
	}

}
