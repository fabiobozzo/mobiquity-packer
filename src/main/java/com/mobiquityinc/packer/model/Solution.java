package com.mobiquityinc.packer.model;

import java.util.List;

public class Solution {
	
	public List<Item> items;
	public int value;
	
	public Solution(List<Item> items, int value) {
		this.items = items;
		this.value = value;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Solution [items=" + items + ", value=" + value + "]";
	}
	
}