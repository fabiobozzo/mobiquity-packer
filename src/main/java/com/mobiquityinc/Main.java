package com.mobiquityinc;

import com.mobiquityinc.exception.APIException;
import com.mobiquityinc.packer.Packer;

public class Main {

	public static void main(String[] args) {
		if ( args.length > 0 ) {
			try {
				System.out.println(Packer.pack(args[0]));
			} catch (APIException e) {
				e.printStackTrace();
			}
		} else {
			System.err.println("Please, enter a valid absolute filepath.");
		}
	}

}
