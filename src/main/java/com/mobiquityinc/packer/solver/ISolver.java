package com.mobiquityinc.packer.solver;

import java.util.List;

import com.mobiquityinc.packer.model.Item;
import com.mobiquityinc.packer.model.Solution;

public interface ISolver {

	public Solution solve(int capacity, List<Item> items);
}
