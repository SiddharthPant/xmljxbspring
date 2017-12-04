package com.example.xmljxbspring;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;

import com.example.beans.BatchReport;
import com.example.jaxb.*;

public class CustomItemProcessor implements ItemProcessor<Batch, BatchReport> {

	@Override
	public BatchReport process(Batch item) throws Exception {

		Headers headers = item.getHeaders();
		String dirname = "xyz";
		String batchid = headers.getBatchid();
		String customerid = headers.getCustomerid();
		String documentCount = headers.getDocumentcount();
		List<Document> documentList = item.getDocuments().getDocumentList();
		System.out.println(item.getDocuments());
		List<Property> propertyList = documentList.get(0).getProperties().getPropertyList();
		Map<String, String> values = new HashMap<String, String>();
		for (Property property : propertyList) {
			List<String> valueList = property.getValues().getValueList();
			values.put(property.getName(), valueList.get(0));
		}
		BatchReport batchReport = new BatchReport(
				dirname,
				batchid,
				customerid,
				documentCount,
				values
		);
		
		return batchReport;
	}
}
