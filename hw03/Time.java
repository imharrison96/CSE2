import java.util.Scanner;//import scanner

//This program tells the user how long do they have until their next meal
public class Time {
	// main method required for every Java program
		public static void main(String[] args) {
			Scanner myScanner = new Scanner( System.in );//create my scanner
			System.out.print("Enter the current time(in the form HHMM): ");//print instruction
			double Time = myScanner.nextDouble();//declare current time
			System.out.print("Enter the time that you will be eating dinner (in the form HHMM):");//print instruction
			double DinnerTime = myScanner.nextDouble();//declare time for dinner 
			double Dif;//time difference
			int hours,minutes;//declare number of hours and minutes that we are going to print.
		
			Dif=DinnerTime-Time;//calculate time difference.

			hours = (int) ((Dif)/100);//calculate hours
		if (DinnerTime%10==0&&Time%10==0)//when time difference is exact X hour(s).
			minutes = 0;
		else if(hours==0)//when time difference is less than an hour.
			minutes=(int) (Dif-40);
		else//when time difference is more than an hour and not exact X hour(s).
			minutes = (int) (Dif-hours*100);
			System.out.println("you will have "+ hours+" hour(s) and "+ minutes+" minute(s) until dinner");//print out the time and minutes
		}
	
}
