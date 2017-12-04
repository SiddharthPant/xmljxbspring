package com.example.jaxb;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="Properties")
public class Properties {
	List<Property> propertyList;

	public List<Property> getPropertyList() {
		return propertyList;
	}

	@XmlElement(name="Property")
	public void setPropertyList(List<Property> propertyList) {
		this.propertyList = propertyList;
	}

	@Override
	public String toString() {
		return "Properties [property=" + propertyList + "]";
	}
}
