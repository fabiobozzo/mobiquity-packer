package com.mobiquityinc.packer.solver;

import java.util.List;

import com.mobiquityinc.packer.model.Item;
import com.mobiquityinc.packer.model.Solution;

/**
 * @author Fabio Bozzo
 *
 */
public interface ISolver {

	/**
	 * @param capacity the maximum weight a package can hold
	 * @param items a list of items, each having index, weight and value
	 * @return
	 */
	public Solution solve(int capacity, List<Item> items);
}
