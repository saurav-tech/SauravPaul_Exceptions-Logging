package com.application;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.construction.ConstructionCost;
import com.interest.Interest;

public class ClientApplication {
	private static final Logger logger = LogManager.getLogger(Interest.class);
	public static void main(String[] args) {
		logger.info("Inside Main method");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter\n 1  for Simple Interest\n 2 for Compound Interest\n 3 for Cost for House construction");
		int choice = scan.nextInt();
		switch(choice) {
		case 1	:	System.out.println("Enter Principal Amount: ");
					int principalAmount = scan.nextInt();
					System.out.println("Enter Interest Rate: ");
					float interestRate= scan.nextFloat();
					System.out.println("Enter Time: ");
					int time = scan.nextInt();
					Interest interest = new Interest();
					double simpleInterest = interest.simpleInterestOf(principalAmount, interestRate, time);
					System.out.println("Simple Interest: " + simpleInterest);
					break;
		case 2 	:	System.out.println("Enter Principal Amount: ");
					int principalAmountForCompoundInterest = scan.nextInt();
					System.out.println("Enter Interest Rate: ");
					float interestRateForCompoundInterest = scan.nextFloat();
					System.out.println("Enter Time: ");
					int timeForCompoundInterest = scan.nextInt();
					Interest interestForCompoundInterest = new Interest();
					System.out.println("Enter number of times interest applied per time period: ");
					int n = scan.nextInt();
					double compoundInterest = interestForCompoundInterest.compoundInterestOf(principalAmountForCompoundInterest, interestRateForCompoundInterest, timeForCompoundInterest, n);
					System.out.println("Compound Interest: " + compoundInterest);
					break;
		case 3	:	System.out.println("Enter\n 1 for Standard Material\n 2 for Above Standard Material\n 3 for high Standard Material without fully automated home\n 4 for High Standard Material with Fully Automated home:\n");
					int choiceForConstruction = scan.nextInt();
					String materialStandard = null;
					boolean automatedHome = false;
					switch(choiceForConstruction) {
					case 1	:	materialStandard = "SM";
								break;
					case 2	:	materialStandard = "ASM";
								break;	
					case 3	:	materialStandard = "HSM";
								automatedHome = false;
								break;
					case 4	:	materialStandard = "HSM";
								automatedHome = true;
								break;
					default	:	System.out.println("Invalid Choice");
								break;
					}
					System.out.println("Enter Area of House");
					int areaOfHouse = scan.nextInt();
					ConstructionCost constructionCost = new ConstructionCost();
					double totalAmount = constructionCost.costOf(materialStandard, areaOfHouse, automatedHome);
					System.out.println("Total Amount = " + totalAmount);
					break;
		default	:	System.out.println("Invalid Choice");
					logger.info("Invalid Choice");
					break;
		}
		scan.close();
		logger.info("Scanner Closed");
	}
	
}
