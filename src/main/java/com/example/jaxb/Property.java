package com.example.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "name", "values" })
@XmlRootElement(name = "Property")
public class Property {
	String name;
	Values values;

	public String getName() {
		return name;
	}

	@XmlElement(name = "Name")
	public void setName(String name) {
		this.name = name;
	}

	public Values getValues() {
		return values;
	}

	@XmlElement(name = "Values")
	public void setValues(Values values) {
		this.values = values;
	}

	@Override
	public String toString() {
		return "Property [name=" + name + ", values=" + values + "]";
	}

}
