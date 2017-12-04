package com.example.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Values")
public class Values {
	List<String> valueList;

	public List<String> getValueList() {
		return valueList;
	}

	@XmlElement(name = "Value")
	public void setValueList(List<String> valueList) {
		this.valueList = valueList;
	}

	@Override
	public String toString() {
		return "Values [values=" + valueList + "]";
	}

}
