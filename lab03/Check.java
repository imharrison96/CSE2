import java.util.Scanner;

//this program can determine how much a person should pay for split bills

public class Check {
	// main method required for every Java program
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner( System.in );//create my scanner
		System.out.print("Enter the original cost of the check in the form xx.xx: ");//print instruction
		double checkCost = myScanner.nextDouble();//declare double for check cost
		System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");//print instruction
		double tipPercent = myScanner.nextDouble();//declare tip percentage 
		tipPercent /= 100; //We want to convert the percentage into a decimal value
		System.out.print("Enter the number of people who went out to dinner:");//print instruction
		int numPeople = myScanner.nextInt();//declare number of people who split the bill
		double totalCost;//declare double for total cost
		double costPerPerson;//declare double for cost per person
		int dollars,   //whole dollar amount of cost 
			dimes, pennies; //for storing digits
						          //to the right of the decimal point 
						          //for the cost$ 
		totalCost = checkCost * (1 + tipPercent);
		costPerPerson = totalCost / numPeople;
						//get the whole amount, dropping decimal fraction
		dollars=(int)costPerPerson;
						//get dimes amount, e.g., 
						// (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
						//  where the % (mod) operator returns the remainder
						//  after the division:   583%100 -> 83, 27%5 -> 2 
		dimes=(int)(costPerPerson * 10) % 10;
		pennies=(int)(costPerPerson * 100) % 10;
		System.out.println("Each person in the group owes $" + dollars + "." + (dimes) + pennies);


	}//end of main method
}//end of class
