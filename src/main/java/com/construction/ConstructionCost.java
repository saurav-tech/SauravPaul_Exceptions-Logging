package com.construction;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConstructionCost {
	private static final Logger logger = LogManager.getLogger(ConstructionCost.class);
	public double costOf(String materialStandard, double areaOfHouse, boolean automatedHome) {
		logger.info("Inside costOf() method");
		logger.info("Material Standard: " + materialStandard);
		logger.info("Area of House: " + areaOfHouse);
		logger.info("Automated House: " + automatedHome);
		double totalAmount = 0;
		switch(materialStandard) {
		case "SM" : totalAmount = (double) 1200 * areaOfHouse;
					break;
		case "ASM":	totalAmount = (double) 1500 * areaOfHouse;
					break;
		case "HSM": if(automatedHome) {
						totalAmount = (double) 1800 * areaOfHouse;
					}
					else {
						totalAmount = (double) 2500 * areaOfHouse;
					}
					break;
		}
		return totalAmount;
	}
}
