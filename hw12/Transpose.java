import java.util.Scanner;


public class Transpose {

	// main method required for every Java program
	
	  public static void main(String[] args) 
	  {
		  Scanner sc = new Scanner (System.in);//create scanner
		  int width,height;
		  
		  System.out.println("Please enter the width of the matrix");
		  do {
				
		        while (!sc.hasNextInt()) {
		            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
		            sc.next(); //re-enter
		        }   
		        width = sc.nextInt();//user width
		        if(width <=0)
		        {
		        	System.out.println("Please enter a positive integer");
		        }
		  }while(width<=0);
		  		  
		  
		  
		  System.out.println("Please enter the height of the matrix");
		  
		  do {
				
		        while (!sc.hasNextInt()) {
		            System.out.println("Sorry, you did not enter an integer. Try again:");//print out error message
		            sc.next(); //re-enter
		        }   
		        height = sc.nextInt();//user height
		        if(height <=0)
		        {
		        	System.out.println("Please enter a positive integer");
		        }
		        if(height>width)
		        {
		        	System.out.println("Please enter a integar that's smaller or equal to width you entered");
		        }
		  }while(height<=0||height>width);
		  
		  
		  //call the methods
		  System.out.println("Original Matrix:");
		  int [][] a= new int [width][height];
		  a= randomMatrix(width,height);
		  printMatrix(a);
		  System.out.println("");
		 
		  transposeMatrix(a);
		  System.out.println("Transposed Matrix: ");
		  printMatrix(transposeMatrix(a));

	  }//end of main
		  
		  
		  
	  public static int [][] randomMatrix(int a, int b)
	  {
		  int [][] list = new int [b][a];//declare the 2d array
		  
		  for(int i = 0; i < list.length; i++)
		  {

		      for(int j = 0; j < list[i].length; j++){
		        //Fill the matrix with random numbers
		        list[i][j] = (int)(Math.random()*20)-10; //from -10 to 10  
		      }
		  	  
		  
	  }//end of for
		  return list;//return the 2d array
	  }//end of method random matrix
	
	
	
	public static void printMatrix(int [][]a)
	{
		  for(int i =0;i<a.length;i++)
		  {
			  
			  for(int j =  0; j<a[i].length;j++)
			  {
				  System.out.print(a[i][j]+" ");//print every elements of the array
			  }
			  System.out.println();//print a new line each row
		  }
				
		
	}//end of method print matrix
	  
	
	public static int[][] transposeMatrix(int [][]a)
	{
		int x = a.length;//height
		int y = a[0].length;//width
		int [][] c = new int [y][x];//declare the transpose matrix
		
		for (int i=0;i<y;i++)
		{
			
			for(int j = 0; j<x;j++)
			{
				c[i][j] = a[j][i];//make the transpose matrix

			}	
			
		}//end of outer for				
		
		return c;//return statement
	}//end of transpose matrix method 
	
	

	
	
	  
	  
	  
	  
}//end of class
