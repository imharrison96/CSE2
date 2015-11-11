import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;


public class CSE2Linear {

	// main method required for every Java program
	
	  public static void main(String[] args) 
	  {
			Scanner sc = new Scanner (System.in);//create scanner
			int[] a = new int [20];//create an array with 20 slots of int
			int input=0, x=0;
			
			System.out.println("Please enter 15 numbers between 0-100");

			for (int i =0;i<15;i++)
			{
			do {
				
		        while (!sc.hasNextInt()) {
		            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
		            sc.next(); //re-enter
		        }   
		        input = sc.nextInt();//user input
		        if(input>100)// check over 100 or not
		        {
		        System.out.println("Please only enter numbers between 0-100. Try again:");
		        }
		        
		        if(input<0)// check positive or not
		        {
		        System.out.println("Please only enter numbers between 0-100. Try again:");
		        }
		        if(input<x)
		        {
		        	System.out.println("Please enter a number that is greater than or equal than the previous one");
		        }

			 } while (input <0||input>100||input<x);
	        x = input;

			a[i]=input;
			}//end of for
			
			ls(a);//call linear search method
			
			System.out.println("");
			scramble(a);//call scramble method
			
			//print out scrambled list
			for(int i =0;i<15;i++)
			{
			System.out.print(a[i]+" ");
			}
			System.out.println("");

			ls(a);//call linear search method
		  
	  }//end of main
	  
	  public static  void ls(int[] a)
	  {
			Scanner sc = new Scanner (System.in);//create scanner

		  int input=0;
		  System.out.println("Please enter a grade to search for");
		  do {
				
		        while (!sc.hasNextInt()) {
		            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
		            sc.next(); //re-enter
		        }   
		        input = sc.nextInt();//user input
		        if(input <0)
		        {
		        	System.out.println("Please enter a positive integer");
		        }
		  }while(input<0);
		  
			for (int i =0;i<15;i++)
			{
				if(a[i]<input && a[i+1]>input)//if not found
				{
					System.out.println(input +" was not found in the list with "+(i+1)+" iterations");
					break;
				}
				if(a[i]==input)//if found
				{
					System.out.println(input +" was found in the list with "+(i+1)+" iterations");
					break;
				}
				if(input>a[14])
				{
					System.out.println(input +" was found in the list with 15 iterations");
					break;
				}
				
				
			}//end of for
		  
		  
			
		  
	  }//end of method linear search
	  
	  public static int[] scramble(int[] list)//scramble method
	  { 
		 

		  Random rm = new Random();//create a random number generator
		  for (int i =0;i<15;i++)//shuffle more than 50 times
		  {
			  int a = rm.nextInt(15);//create a random number every time
			  int b = 0;
			  
			  // scramble
			 b = list[a];
			 list [a]= list[0];
			 list [0]= b;
			 
			  
		  }
		  return list;//return 
	  }//end of method scramble
	  
	  
	  
	  
}//end of class
