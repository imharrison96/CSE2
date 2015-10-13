import java.util.Scanner;//import scanner

	/*This program asks the user for two integers: Length and Width.  Length is to specify how many characters the following pattern should spread, horizontally, 
	 * across the screen. Width should specify how many characters the following pattern should spread, vertically, across the screen. */

public class Twisty {

	

	// main method required for every Java program
		public static void main(String[] args) {
			
			
			Scanner sc = new Scanner (System.in);//create the scanner
			int length,width;//declare length and width
			
			
			
			System.out.println("Input your desired length: ");//print out the instruction
			
			//users input the length
				do {
				
		        while (!sc.hasNextInt()) {
		            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
		            sc.next(); //re-enter
		        }   
		        length = sc.nextInt();//user input
		        if(length<0)// check positive or not
		        {
		        System.out.println("Please only enter positive numbers. Try again:");
		        }
		        if(length>80)// check over 80 or not
		        {
		        System.out.println("Please only enter numbers between 0-80. Try again:");
		        }
		    } while (length <= 0||length>80);//the conditions that the program wouldn't work, ask the user to re-enter another number
			
				
				System.out.println("Input your desired width: ");//print out the instruction				
				//users input the width
				
				do {
					
			        while (!sc.hasNextInt()) {
			            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
			            sc.next(); //re-enter
			        }   
			        width = sc.nextInt();//user input
			        if(width<0)// check positive or not
			        {
			        System.out.println("Please only enter positive numbers. Try again:");
			        }
			        if(width >=length)//check the width is shorter than the length or not
			        {
			        	System.out.println("Please input an integer smaller than the length.");
			        }
			    } while (width <= 0||width>length);//the conditions that the program wouldn't work, ask the user to re-enter another number
				
				
				
				//loop
				int n=width;
				int b=0;//reminder that would produce the down #
				int c=width-1;//reminder that would produce the up #
				for (int i = 0;i<width;i++)
				{
					System.out.println();
					
					//check the width is odd or not.
					if (width%2==0)//if it is even
					{
					for(int a = 0;a<length;a++)//print each line
					{
						
						if(a%(2*n)==b)//the down #
						{
							System.out.print("#");						
						}
						else if((a+n)%(2*n)==c)//the up #
						{
							System.out.print("#");	
						}
						else if(a%(2*n)==c)//the down /
						{
							System.out.print("/");						
						}
						else if((a+n)%(2*n)==b)//the up \
						{
							System.out.print("\\");	
						}
						else 
						{
							System.out.print(" ");
						}
					
					}//end of the inner loop
				}//end of even if
					
					
				if(width%2==1)//if it is odd
				{
					for(int a = 0;a<length;a++)//print each line
					{
						
						if(a%(2*n)==b)//the down #
						{
							System.out.print("#");						
						}
						else if((a+n)%(2*n)==b)//the up \
						{
							System.out.print("\\");	
						}
						else if((a+n)%(2*n)==c)//the up #
						{
							System.out.print("#");	
						}
						else if(a%(2*n)==c)//the down /
						{
							System.out.print("/");						
						}
						
						else 
						{
							System.out.print(" ");
						}
					
					}//end of the inner loop
				}//end of odd if
				b++;//to make the twist 
				c--;// to make the twist 
			}//end of the outer loop
				
				
				
				
				
				
		}//end of main
	
	
	
	
}//end of class
