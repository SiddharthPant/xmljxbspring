package com.example.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"batchid", "customerid", "documentcount"})
@XmlRootElement(name = "Headers")
public class Headers {
	String batchid;
	String customerid;
	String documentcount;

	public String getBatchid() {
		return batchid;
	}

	@XmlElement(name = "BatchID")
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public String getCustomerid() {
		return customerid;
	}

	@XmlElement(name = "CustomerID")
	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getDocumentcount() {
		return documentcount;
	}

	@XmlElement(name = "DocumentCount")
	public void setDocumentcount(String documentcount) {
		this.documentcount = documentcount;
	}

	@Override
	public String toString() {
		return "Headers [batchid=" + batchid + ", customerid=" + customerid + ", documentcount=" + documentcount + "]";
	}

}
