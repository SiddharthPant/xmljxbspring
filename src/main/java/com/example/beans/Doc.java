package com.example.beans;

import java.util.HashMap;
import java.util.Map;

public class Doc {
	public Map<String, String> values;
	
	public Doc() {}

	public Doc(Map<String, String> values) {
		this.values = values;
	}

	public Map<String, String> getValues() {
		return values;
	}

	public void setValues(Map<String, String> values) {
		this.values = values;
	}
	
	public void addValues(String key, String value) {
		if (values == null) {
			this.values = new HashMap<String, String>();
		}
		this.values.put(key, value);
	}

	@Override
	public String toString() {
		return "Doc [values=" + values + "]";
	}
	
	
}
