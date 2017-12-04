package com.example.xmljxbspring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.batch.item.ItemProcessor;

import com.example.beans.BatchReport;
import com.example.beans.Doc;
import com.example.jaxb.*;

public class CustomItemProcessor implements ItemProcessor<Batch, BatchReport> {

	@Override
	public BatchReport process(Batch item) throws Exception {

		Headers headers = item.getHeaders();
		String dirname = "xyz";
		String batchid = headers.getBatchid();
		String customerid = headers.getCustomerid();
		int documentCount = headers.getDocumentcount();
		List<Document> documentList = item.getDocuments().getDocumentList();
		List<Doc> docs = new ArrayList<Doc>();
		Doc doc = new Doc();
		System.out.println(item.getDocuments());
		for (Document document : documentList) {
			List<Property> propertyList = document.getProperties().getPropertyList();
			Map<String, String> values = new HashMap<String, String>();
			for (Property property : propertyList) {
				List<String> valueList = property.getValues().getValueList();
				values.put(property.getName(), valueList.get(0));
			}
			doc.setValues(values);
			docs.add(doc);
		}
		if (docs.size() == documentCount) {
			System.out.println("True");
		}
		
		BatchReport batchReport = new BatchReport(
				dirname,
				batchid,
				customerid,
				documentCount,
				docs
		);
		
		return batchReport;
	}
}
