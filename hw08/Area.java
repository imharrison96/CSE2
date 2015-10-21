import java.util.Scanner;//import scanner


	/*This program can calculate the area of three different shapes; a rectangle, a triangle and a circle.
 	   Let the user choose which shape they want by typing the words “rectangle”, “triangle” or “circle” (without caps).
 	     Then, have the user enter the values of the dimension(s) appropriate for each shape in the form of doubles*/

public class Area {
	// main method required for every Java program
	
			public static void main(String[] args) 
			{
				
				Scanner sc = new Scanner (System.in);//create scanner
				String a;//the shape user input
				double height=0,length=0,radius=0,base=0;//declare doubles that user input
				
				
				System.out.println("Please enter a shape");//print out the instruction
				
				do {
					
			     /*   while (!sc.hasNextLine()) {
			            System.out.println("Sorry, you did not enter a legit shape. Please input triangle, rectangle or circle");//print out error message
			            sc.nextLine(); //re-enter
			        }   */
					a=sc.nextLine();
					if(!a.equals("circle")&&!a.equals("triangle")&&!a.equals("rectangle"))//if the input is not the shape we wanted
					{
			            System.out.println("Sorry, you did not enter a legit shape. Please input triangle, rectangle or circle");//print out error message
					}
					else
					{
						System.out.println("Got you");//notice the user
					}			    
			        	
				}while(!a.equals("circle")&&!a.equals("triangle")&&!a.equals("rectangle"));//condition that the checker would stop running
				
				
				
				if(a.equals("circle"))//if the user inputs circle
				{
					Circle(radius);//call the method to calculate the area of the circle
				}
				
				if(a.equals("triangle"))
				{
					Triangle(base,height);//call the method to calculate the area of the triangle
				}
				
				if(a.equals("rectangle"))
				{
					Rectangle(length,height);//call the method to calculate the area of the rectangle
				}
			}//end of main
			
			
			public static void Circle(double radius)//method for circle
			{
				Scanner sc = new Scanner (System.in);//create scanner

				System.out.println("input your radius please: ");
				do{
					 while (!sc.hasNextDouble()) {
				            System.out.println("Sorry, you did not enter a double. Try again:");//print out error message
				            sc.next(); //re-enter
				        }  
						radius=sc.nextDouble();//user inputs radius

					 if(radius<0)//the condition that's false
					 {
						 System.out.println("Sorry, please input a radius that is bigger than 0");
					 }
				}while(radius<=0);//the condition that's false
				
				radius=2*radius*3.1415926;//calculate the area of the circle
				System.out.println("The area of the circle is: "+radius);//print out the result
			}//end of circle method
			
			public static void Triangle(double base, double height)//method for triangle
			{	double area=0;
				Scanner sc = new Scanner (System.in);//create scanner
				System.out.println("input your base please: ");//instruction

				do{
					 while (!sc.hasNextDouble()) {
				            System.out.println("Sorry, you did not enter a double. Try again:");//print out error message
				            sc.next(); //re-enter
				        }  
					base = sc.nextDouble();//user inputs the base
					if(base<0)//the condition that's false
					{
						 System.out.println("Sorry, please input a base that is bigger than 0");
					}
					
				}while(base<=0);//the condition that's false
				
				System.out.println("input your height please: ");//instruction

				do{
					 while (!sc.hasNextDouble()) {
				            System.out.println("Sorry, you did not enter a double. Try again:");//print out error message
				            sc.next(); //re-enter
				        }  
					height = sc.nextDouble();//user inputs the height
					
					if(height<0)//the condition that's false
					{
						 System.out.println("Sorry, please input a height that is bigger than 0");//print out error message
					}
					
				}while(height<=0);//the condition that's false
				area=base*height/2;//calculate the area of the triangle
				System.out.println("The area of triangle is: "+ area);//print out the result
			}//end of triangle method
			
			public static void Rectangle(double length, double height)//method for rectangle
			{	
				double area=0;//Initialize the area
				Scanner sc = new Scanner (System.in);//create scanner
				System.out.println("input your length please: ");//instruction

				do{
					 while (!sc.hasNextDouble()) {
				            System.out.println("Sorry, you did not enter a double. Try again:");//print out error message
				            sc.next(); //re-enter
				        }  
					length = sc.nextDouble();//user inputs the length
					if(length<0)//the condition that's false
					{
						 System.out.println("Sorry, please input a length that is bigger than 0");
					}
					
				}while(length<=0);//the condition that's false
				
				System.out.println("input your height please: ");//instruction

				do{
					 while (!sc.hasNextDouble()) {
				            System.out.println("Sorry, you did not enter a double. Try again:");//print out error message
				            sc.next(); //re-enter
				        }  
					height = sc.nextDouble();//user inputs the height
					
					if(height<0)//the condition that's false
					{
						 System.out.println("Sorry, please input a height that is bigger than 0");//print out error message
					}
					
				}while(height<=0);//the condition that's false
				area=length*height;//calculate the area of the rectangle
				System.out.println("The area of triangle is: "+ area);//print out the result
			}//end of rectangle method
			
}//end of class
