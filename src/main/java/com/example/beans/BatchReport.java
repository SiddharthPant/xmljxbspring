package com.example.beans;

import java.util.List;

public class BatchReport {
	String dirname;
	String batchid;
	String customerid;
	int documentCount;
	List<Doc> docs;

	public BatchReport() {

	}

	public BatchReport(String dirname, String batchid, String customerid, int documentCount,
			List<Doc> docs) {
		this.dirname = dirname;
		this.batchid = batchid;
		this.customerid = customerid;
		this.documentCount = documentCount;
		this.docs = docs;
	}

	public String getDirname() {
		return dirname;
	}

	public List<Doc> getDocs() {
		return docs;
	}

	public void setDocs(List<Doc> docs) {
		this.docs = docs;
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

	public int getDocumentCount() {
		return documentCount;
	}

	public void setDocumentCount(int documentCount) {
		this.documentCount = documentCount;
	}

	@Override
	public String toString() {
		return "BatchReport [dirname=" + dirname + ", batchid=" + batchid + ", customerid=" + customerid
				+ ", documentCount=" + documentCount + ", docs=" + docs + "]";
	}


}
