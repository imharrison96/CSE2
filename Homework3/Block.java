import java.util.Scanner;//import scanner


//this program tells the users the volume and surface area of the block they entered
public class Block {
	
	
		// main method required for every Java program
			public static void main(String[] args) {
				Scanner myScanner = new Scanner( System.in );//create my scanner
				System.out.print("Enter the length of the block: ");//print instruction
				double length = myScanner.nextDouble();//declare length
				System.out.print("Enter the width of the block:");//print instruction
				double width = myScanner.nextDouble();//declare width 
				System.out.println("Enter the height of the block:");
				double height = myScanner.nextDouble();//declare height
				
				double volume, surface;//declare volume and surface area.
				
				volume = length * width * height;//calculate volume
				surface = 2*length*width + 2*width*height +2* length * height;//calculate surface area
				
				System.out.println("The volume of the block of dimensions " + length +" x " + width +" x " + height + "is " +volume);//print volume line
				System.out.println("The surface area of the block is "+surface); //print surface area
				
				
				}//end of main
}//end of class