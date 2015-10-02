import java.util.Random;//import math random



	/* this program would print out 1 to 7 and multiple times of 7.
 	then it would also print out all of the prime number from 10-100
	 finally it would print out between 5-200 smile faces.
	 */




public class GettingLoopy {

	// main method required for every Java program
	
	public static void main(String[] args) 
	{
		
		System.out.println("Step 1:");//make a line for step 1
		//loop that would  print out 1 to 7 and another one that would print out multiple times of 7.
		
		for (int i =1;i<7;i++)//print out numbers from 1 to 6
		{
			System.out.print(i);
		}
		for (int i =0, a=7;i<7;i++)//print out 7 for 7 times
		{
			System.out.print(a);
		}
		System.out.println("\n"+"\n"+"Step 2:"); //make a line for step 2
		
		//make a new line for while loop 
		System.out.print( "WHILE LOOP:");
		
		// while loop that would print out all prime numbers between 10-100
		
		
		int number=10;//starts from 10 
		
		while(number<=100)//ends at 100
		{	
			int div=1,count=0;//set up divider and counts for number of times the test number can be divided exactly
			while(div<=number)
			{
				if(number%div==0)
				{
					count++;	//count the numbers the test number can be divided exactly			
				}
				div++;//check the next divider
			}//end of inner while
			
			if(count==2)//prime number has 2 divisor
			{
				System.out.print(number+" ");//print out every prime number
			}
			number++;	//check the next number
		}//end of outer while
		
		
		//make a new line for for loop.
		System.out.print("\n" + "FOR LOOP:");
		
		// for loop that would print out all prime numbers between 10-100
		
		 for (int i = 10; i <= 100; i++)     //starts at 10, ends at 100    
	       { 		  	  
	          int mod=0; 	//times of the number can be exactly divided  
	          for(int a =i; a>=1; a--)
	          {
	        if(i%a==0)
		     {
	        	mod ++;
		     }//end of if
		  }//end of inner for
		  if (mod ==2)//prime number has 2 divisor
		  {
			  System.out.print(i +" ");//print out every prime number
		  }//end of if
	    }//end of outer for
		
		
		//make a new line for do while loop.
			System.out.print("\n" + "DO WHILE LOOP:");
			
			//do while loop that would print out all prime numbers between 10-100
		
			number=10;//starts at 10
			do 
		{
			int div=1,count=0;//set up divider and counts for number of times the test number can be divided exactly
			do
			{
				if(number%div==0)
				{
					count++;//count the numbers the test number can be divided exactly				
				}
				div++;//check the next divider
			}
			while(div<=number);
				
			if(count==2)//prime number has 2 divisor
			{
				System.out.print(number+" ");//print out every prime number
			}
			number++;//check the next number
		}
		while(number<=100);// ends at 100
			
			//print out random number of times of smile faces
			
			System.out.println("\n"+"\n"+"Step 3:"); //make a line for step 3
			
		Random gen = new Random();//create random number generator
		int print=	gen.nextInt(201)+5;//declare a random number
			
		for(int o=1;o<print;o++)
		{  
			System.out.print("ツ");
			if(o%20==0)//print only 20 faces on a line
			{
				System.out.println();//print out a new line
			}
		}
		
	}//end of main
	
}//end of class
