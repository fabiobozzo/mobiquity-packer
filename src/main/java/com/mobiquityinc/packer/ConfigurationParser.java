package com.mobiquityinc.packer;

import com.mobiquityinc.exception.APIException;
import com.mobiquityinc.packer.model.Configuration;

public class ConfigurationParser {

	public static Configuration parse(String line) throws APIException {
		
		Configuration configuration;
		
		try {
			
			configuration = new Configuration();
			
			String[] group1 = line.split(" : ");
			
			if ( group1.length == 2 ) {
				
			}
			
		} catch (NumberFormatException e) {
			configuration = null;
		}
		
		return configuration;
	}
}
