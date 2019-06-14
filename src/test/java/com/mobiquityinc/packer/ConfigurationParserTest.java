package com.mobiquityinc.packer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.mobiquityinc.packer.model.Configuration;
import com.mobiquityinc.packer.model.Item;
import com.mobiquityinc.packer.utils.ConfigurationParser;


/**
 * Unit test for ConfigurationParser
 */
public class ConfigurationParserTest
{
	@Test
    public void testConfigurationParser() {
		
		Configuration expected = new Configuration();
		
		expected.setCapacity(81);
		
		List<Item> items = new ArrayList<>();
		items.add(new Item(1,53.38,45));
		items.add(new Item(2,88.62,98));
		items.add(new Item(3,78.48,3));
		items.add(new Item(4,72.30,76));
		items.add(new Item(5,30.18,9));
		items.add(new Item(6,46.34,48));
		
		expected.setItems(items);
		
		Configuration parsed = ConfigurationParser.parse("81 : (1,53.38,€45) (2,88.62,€98) (3,78.48,€3) (4,72.30,€76) (5,30.18,€9) (6,46.34,€48)");
		
		assertNotNull(parsed);
		assertNotNull(parsed.getItems());
		assertEquals(expected.getCapacity(), parsed.getCapacity());
		assertEquals(expected.getItems().toString(), parsed.getItems().toString());
	}
	
}
