package com.interest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Interest {
	private static final Logger logger = LogManager.getLogger(Interest.class);
	public double simpleInterestOf(int principalAmount, float interestRate, int time) {
		logger.info("Inside simpleInterestOf() method");
		logger.info("Principal Amount: " + principalAmount);
		logger.info("Interest Rate: " + interestRate);
		logger.info("Time Period: " + time);
		double simpleInterest = (double)(principalAmount * interestRate * time)/100;
		return simpleInterest;
	
	}
	
	public double compoundInterestOf(int principalAmount, float interestRate, int time, int n) {
		logger.info("Inside compoundInterestOf() method");
		logger.info("Principal Amount: " + principalAmount);
		logger.info("Interest Rate: " + interestRate);
		logger.info("Time Period: " + time);
		double amount = principalAmount * Math.pow(1 + (interestRate / n), n * time); 
		return amount;
	}
}
