public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
        int secsTrip1=480;  //initialize int
       	int secsTrip2=3220;  //initialize int
		int countsTrip1=1561;  //initialize int
		int countsTrip2=9037; //initialize int
        double wheelDiameter=27.0;  // initialize double
        double PI=3.14159; //initialize double
  	    double feetPerMile=5280;  //initialize double
  	    double inchesPerFoot=12;   //initialize double
  	    double secondsPerMinute=60;  //initialize double
	    double distanceTrip1;  //initialize double
	    double distanceTrip2;  //initialize double
	    double totalDistance;  //initialize double
	    
System.out.println("Trip 1 took "+
(secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
//calculate Trip 1
System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+
" minutes and had "+countsTrip2+" counts.");
      distanceTrip1=countsTrip1*wheelDiameter*PI;//calculate Trip2
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels
    	//the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	totalDistance=distanceTrip1+distanceTrip2;
		//Print out the output data.
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
 


	}  //end of main method   
} //end of class
