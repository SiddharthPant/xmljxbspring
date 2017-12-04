package com.example.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Documents")
public class Documents {
	List<Document> documentList;

	public List<Document> getDocumentList() {
		return documentList;
	}

	@XmlElement(name = "Document")
	public void setDocumentList(List<Document> documentList) {
		this.documentList = documentList;
	}

	@Override
	public String toString() {
		return "Documents [documentList=" + documentList + "]";
	}

}
