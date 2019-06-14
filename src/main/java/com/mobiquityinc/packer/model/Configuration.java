package com.mobiquityinc.packer.model;

import java.util.List;

public class Configuration {

	private int capacity;
	private List<Item> items;
	
	public Configuration(int capacity, List<Item> items) {
		super();
		this.capacity = capacity;
		this.items = items;
	}

	public Configuration() {

	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}	
}
