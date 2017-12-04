package com.example.beans;

import java.util.Map;

public class BatchReport {
	String dirname;
	String batchid;
	String customerid;
	String documentCount;
	Map<String, String> values;

	public BatchReport() {

	}

	public BatchReport(String dirname, String batchid, String customerid, String documentCount,
			Map<String, String> values) {
		this.dirname = dirname;
		this.batchid = batchid;
		this.customerid = customerid;
		this.documentCount = documentCount;
		this.values = values;
	}

	public String getDirname() {
		return dirname;
	}

	public Map<String, String> getValues() {
		return values;
	}

	public void setValues(Map<String, String> values) {
		this.values = values;
	}

	public void addValues(String key, String value) {
		this.values.put(key, value);
	}

	public void setDirname(String dirname) {
		this.dirname = dirname;
	}

	public String getBatchid() {
		return batchid;
	}

	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}

	public String getCustomerid() {
		return customerid;
	}

	public void setCustomerid(String customerid) {
		this.customerid = customerid;
	}

	public String getDocumentCount() {
		return documentCount;
	}

	public void setDocumentCount(String documentCount) {
		this.documentCount = documentCount;
	}

	@Override
	public String toString() {
		return "BatchReport [dirname=" + dirname + ", batchid=" + batchid + ", customerid=" + customerid
				+ ", documentCount=" + documentCount + ", values=" + values + "]";
	}

}
