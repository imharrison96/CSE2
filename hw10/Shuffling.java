import java.util.Random;
import java.util.Scanner;


public class Shuffling{
	// main method required for every Java program
	
  public static void main(String[] args) 
  {
     Scanner scan = new Scanner(System.in);
	//suits club, heart, spade or diamond
     String[] suitNames={"C","H","S","D"};   
     
     String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
     String[] cards = new String[52];
     String[] hand = new String[5];
     for (int i=0; i<52; i++)
     {
    	 cards[i]=rankNames[i%13]+suitNames[i/13];
    	 System.out.print(cards[i]+" ");
     }
     //printArray(cards);
     shuffle(cards);
     printArray(cards);
     hand = randomizeHand(cards);
     printArray(hand);
  }//end of main
  
  
  public  static void printArray(String[] list)//print method
  {
	  for (int i =0;i<list.length;i++)
	  {
		  System.out.print(list[i]+ " ");
	  }
	  System.out.println("");
  }//end of print method
  
  public static String[] shuffle(String[] list)//shuffle method
  { 
	  System.out.println("");//print out a new line
	  System.out.println("Shuffle:");
	 

	  Random rm = new Random();//create a random number generator
	  for (int i =1;i<54;i++)//shuffle more than 50 times
	  {
		  int a = rm.nextInt(52);//create a random number every time
		  String b = "";
		  // shuffle
		 b = list[a];
		 list [a]= list[0];
		 list [0]= b;
		 
		  
	  }
	  return list;//return 
  }
  public static String[] randomizeHand(String[] list)//randomize method
  {
	  
	  System.out.println("Randomized Hand!");
	  
	  String [] array ={"","","","","","",""};
	  Random rm = new Random();//create a random number generator
	 
	
	  
	 for(int i =0;i<5;i++)//pick 5 random number
	 {
		 int a = rm.nextInt(50);//create a new random number
		 array[i]= list[a];//set the new array
	 }
	  return array;//return
  }
  
  
  
}//end of class

