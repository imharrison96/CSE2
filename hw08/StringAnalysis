import java.util.Scanner;//import scanner



	/*
	 This program can process a string by examining all the characters, or just a specified number of characters in the string,
	 and determining if they are letters. 
	 Let the user enter a string and choose if he or she wants to examine all the characters or just a certain number. 
	 
	 
	 */

public class StringAnalysis {

	// main method required for every Java program
	
				public static void main(String[] args) 
				{
					Scanner sc = new Scanner (System.in);//create scanner
					String a;//the string user inputs
					int i;//the number user inputs
					
					System.out.println("please enter a string: ");
					do
					{ 						
						while (!sc.hasNextLine()) 
						{
			            System.out.println("Sorry, you did not enter a valid string. Try again:");//print out error message
			            sc.next(); //re-enter
						}   
					a = sc.nextLine();//user input
					
				if(	a.length()==0)//if the user didn't input any string
				{
					System.out.println("Sorry, you did not enter a valid string. Try again:");
				}
				
					}while(a.length()==0);//to repeat
					
					
					System.out.println("Input a integer");
					do {
						
				        while (!sc.hasNextInt()) {
				            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
				            sc.next(); //re-enter
				        }   
				        i = sc.nextInt();//user input
				        if(i<=0)
				        {
				        	System.out.println("Sorry, please enter a integer that is bigger than 0");//error message
				        }
					}while(i<=0);
					
					System.out.println(An(a,i));
					
					System.out.println(An(a));
					
				}//end of main
	
				
				
				public static boolean An(String a)//method one
				{
					for(int i =0;i<a.length();i++)
					{
						if(Character.isLetter((a.charAt(i))))//check whether if it is a letter or not
						{
						 return true;
						};
					}					
					
					return false;
					
				}
				
				public static boolean An(String a, int i)//method two
				{
					if(i<=a.length())
					{
						for(int n = 0;n<i;n++)//check each letter
						{
							if(Character.isLetter((a.charAt(n))))//check whether if it is a letter or not
							{
							 return true;
							};
						}//end of for
					}//end of if
					
					if(i>=a.length())
					{
						for(int n = 0;n<a.length();n++)//check each letter
						{
							 if(Character.isLetter((a.charAt(n))))//check whether if it is a letter or not
								{
								 return true;
								};
						}//end of for
					}//end of if
					return false;	
					
				}
}//end of the class
