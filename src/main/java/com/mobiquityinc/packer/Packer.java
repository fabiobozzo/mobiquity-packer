package com.mobiquityinc.packer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

import com.mobiquityinc.exception.APIException;

/**
 * Author: Fabio Bozzo
 *
 */
public class Packer {
    
    public static String pack(String filePath) throws APIException {
    	
    	Path path = Paths.get(filePath);
    	
    	try {
			
    		List<String> lines = Files.lines(path).collect(Collectors.toList());
    		
    		StringBuffer sb = new StringBuffer();
    		
    		for ( String l : lines ) {
    			sb.append(Packer.process(l)).append("\n");
    		}
    		
    		return sb.toString();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
    	return null;
    }
    
    public static String process(String testCase) throws APIException {
    	
    	System.out.println(testCase);
    	
    	return null;
    }
}
