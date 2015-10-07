import java.util.Scanner;//import scanner




	// this program check whether the book ISBN digit is valid or not
public class CheckDigit {

	// main method required for every Java program
	
		public static void main(String[] args) 
		{
		
			Scanner sc = new Scanner( System.in );//create my scanner
		String code;//declare the code
		
		//print out the instruction
		System.out.println("Please enter a 10 digit barcode:");
		
		do 
		{
		
	    while (!sc.hasNext()) {
            System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits:");//error message
            sc.next(); //re-enter
        }   
        code = sc.next();//user input
		if(code.length()!=10)
		{
			 System.out.println("This is a valid NOT a valid ISBN. Please enter 10 digits:");//error message
		}
		}while(code.length()!=10);//repeat when it's not a 10-digit-long code
		
		double ib = Double.parseDouble(code);//convert the string into a double
		int sum=0;//declare the sum of code
		
		int b =0;//last digit
		
		int d = 1000000000; //divider
		for (int i=1;i<10;i++)
		{
			int a = (int) (ib/d);//get each digit 
			sum +=a*(10-(i-1));//add them together
			ib =ib%d;// get new number
			d/=10;
			if (i==9)//the last time
			{
			b = (int) ib;//get the last digit
			}
		}//end of for
		
		//print out the result
		if (b == sum%11)//when the check digit is correct
		{
			System.out.println("This is a valid ISBN.");
		}
		else//when the check digit is not correct
		{
			int c = sum %11;//calculate the right last check digit
			System.out.println("This is NOT a valid ISBN.Check digit should be "+c +".");
		}
		
	
		
		
		
		
		
		}//end of main
	
	
	
	
}//end of class
