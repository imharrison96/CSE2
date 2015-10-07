import java.text.DecimalFormat;//import decimal format
import java.util.Scanner;//import scanner
import java.util.Random;//import random number generator

/*	this program would prompt you to input the expenses for each day of the week for one week. 
   and it would look at your expenses and try to estimate your long term spending habits. */



public class BarGraph {
	
	// main method required for every Java program
	
	public static void main(String[] args) 
	{
		//part 1
		
		
		Scanner myScanner = new Scanner( System.in );//create my scanner
		double mon,tue,wed,thu,fri,sat,sun;//declare Expense for each day
		
		double total,avg; //declare the total and average of expense
		
		
		// Monday
		//at least do once
		System.out.print("Expense for Monday:");//print instruction
		do {
			
	        while (!myScanner.hasNextDouble()) {
	            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
	            myScanner.next(); //re-enter
	        }   
	        mon = myScanner.nextDouble();//user input
	        if(mon<0)// check positive or not
	        {
	        System.out.println("Please only enter positive numbers. Try again:");
	        }
	    } while (mon <= 0);
		
				
		
				// Tuesday 
				System.out.print("Expense for Tuesday:");//print instruction
				do {
					
			        while (!myScanner.hasNextDouble()) {
			            System.out.println("Sorry, you did not enter an integer. Try again:");
			            myScanner.next();  
			        }   
			        tue = myScanner.nextDouble();//user input
			        if(tue<0)// check positive or not
			        {
			        System.out.println("Please only enter positive numbers. Try again:");
			        }
			    } while (tue <= 0);
				
				//Wednesday 
				
				System.out.println("Expense for Wednesday:");//print instruction
				do {
					
			        while (!myScanner.hasNextDouble()) {
			            System.out.println("Sorry, you did not enter an integer. Try again:");
			            myScanner.next();  
			        }   
			        wed = myScanner.nextDouble();//user input
			        if(wed<0)// check positive or not
			        {
			        System.out.println("Please only enter positive numbers. Try again:");
			        }
				} while (wed <= 0);
				
				//Thursday
				System.out.println("Expense for Thursday:");//print instruction
				do {
					
			        while (!myScanner.hasNextDouble()) {
			            System.out.println("Sorry, you did not enter an integer. Try again:");
			            myScanner.next();  
			        }   
			        thu = myScanner.nextDouble();//user input
			        if(thu<0)// check positive or not
			        {
			        System.out.println("Please only enter positive numbers. Try again:");
			        }
				} while (thu <= 0);
				
				//Friday
				System.out.println("Expense for Friday:");//print instruction
				do {
					
			        while (!myScanner.hasNextDouble()) {
			            System.out.println("Sorry, you did not enter an integer. Try again:");
			            myScanner.next();  
			        }   
			        fri = myScanner.nextDouble();//user input
			        if(fri<0)// check positive or not
			        {
			        System.out.println("Please only enter positive numbers. Try again:");
			        }
				} while (fri <= 0);
				
				//Saturday
				
				System.out.println("Expense for Saturday:");//print instruction
				do {
					
			        while (!myScanner.hasNextDouble()) {
			            System.out.println("Sorry, you did not enter an integer. Try again:");
			            myScanner.next();  
			        }   
			        sat = myScanner.nextDouble();//user input
			        if(sat<0)// check positive or not
			        {
			        System.out.println("Please only enter positive numbers. Try again:");
			        }
				} while (sat <= 0);
				
				//Sunday
				System.out.println("Expense for Sunday:");//print instruction
				do {
					
			        while (!myScanner.hasNextDouble()) {
			            System.out.println("Sorry, you did not enter an integer. Try again:");
			            myScanner.next();  
			        }   
			        sun = myScanner.nextDouble();//user input
			        if(sun<0)// check positive or not
			        {
			        System.out.println("Please only enter positive numbers. Try again:");
			        }
				} while (sun <= 0);
				
				
			
				//print out the results
				
						//Monday
						System.out.print("Mon:");
						for (int i=0; i<(int)(mon+0.5);i++)// loop, round to the nearest number. 
						{
							System.out.print("*");//print out the bar graph
						}//end of for
						
						//Tuesday
						System.out.print("\n"+"Tues:");						
						for (int i=0; i<(int)(tue+0.5);i++)// loop, round to the nearest number. 
						{
							System.out.print("*");//print out the bar graph
						}//end of for
						
						//Wednesday
						System.out.print("\n"+"Wed:");						
						for (int i=0; i<(int)(wed+0.5);i++)// loop, round to the nearest number. 
						{
							System.out.print("*");//print out the bar graph
						}//end of for
						
						//Thursday
						System.out.print("\n"+"Thu:");
						for (int i=0; i<(int)(thu+0.5);i++)// loop, round to the nearest number. 
						{
							System.out.print("*");//print out the bar graph
						}//end of for
						
						//Friday
						System.out.print("\n"+"Fri:");
						
						for (int i=0; i<(int)(fri+0.5);i++)// loop, round to the nearest number. 
						{
							System.out.print("*");//print out the bar graph
						}//end of for
						
						//Saturday
						System.out.print("\n"+"Sat:");
						
						for (int i=0; i<(int)(sat+0.5);i++)// loop, round to the nearest number. 
						{
							System.out.print("*");//print out the bar graph
						}//end of for
						
						//Sunday
						System.out.print("\n"+"Sun:");
						
						for (int i=0; i<(int)(sun+0.5);i++)// loop, round to the nearest number. 
						{
							System.out.print("*");//print out the bar graph
						}//end of for
						
						DecimalFormat a = new DecimalFormat("0.00");//create method that keep only two digits after zero.
						
						total = mon+tue+wed+thu+fri+sat+sun; //sum of expense of the week
						avg = total/7;//calculate the average expense of the week
						
						System.out.println("\n"+"Your average daily expenses are:$"+a.format(avg));//print out the average expense
						
						//end of part 1
						
						
						
						//part 2
						Random gen = new Random();//create random number generator
						double expect = total;//create expected amount of expense for four years
						
						for(int i=1;i<208;i++)//the first week plus 207 week randomly generated
						{
						int percent = gen.nextInt(40)-20;//randomly generate a percentage each week
						total +=total*(percent)/100;//calculate total for every week
						expect += total;//sum of them
						}
						System.out.println("Estimated expenditure for 4 years: $"+expect);
					
					
						
	}//end of main

}//end of class




