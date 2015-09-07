import java.text.DecimalFormat;


public class Arithmetic {
	
	public static void main(String[] args) {
		//Number of pairs of socks
		int nSocks=3;
		//Cost per pair of socks
		//(‘$’ is part of the variable name)
		double sockCost$=2.58;

		//Number of drinking glasses
		int nGlasses=6;
		//Cost per glass
		double glassCost$=2.29;

		//Number of boxes of envelopes
		int nEnvelopes=1;
		//cost per box of envelopes
		double envelopeCost$=3.25;
		double taxPercent=0.06; //Pennsylvania tax rate

		double totalSockCost$;//total cost of socks before taxes
		double totalGlassCost$;//total cost of glass before taxes
		double totalEnvelopeCost$;//total cost of envelope before taxes
		double taxSock$;//tax of socks
		double taxGlass$;//tax of glass
		double taxEnvelope$;//tax of envelope
		double totalPurchase$;//total cost before taxes
		double totalTax$;//total tax of all goods
		double totalPaid$;//total paid including taxes
		
		totalSockCost$ = nSocks*sockCost$; //calculate total sock cost.
		taxSock$ = totalSockCost$*taxPercent;//calculate tax for socks.
		totalGlassCost$ = nGlasses*glassCost$;//calculate total glass cost.
		taxGlass$ = totalGlassCost$*taxPercent; //calculate tax for glasses.
		totalEnvelopeCost$ = nEnvelopes*envelopeCost$; //calculate total envelope cost.
		taxEnvelope$ = totalEnvelopeCost$ * taxPercent;//calculate tax for envelopes.	
		totalPurchase$ = totalSockCost$ + totalGlassCost$ +totalEnvelopeCost$;//calculate the sum cost of all goods before taxes.
		totalTax$ =taxSock$+ taxGlass$+taxEnvelope$;//calculate the total tax of all goods
		totalPaid$ = totalPurchase$+totalTax$;//calculate the amount that you paid
		
		
		DecimalFormat a = new DecimalFormat("0.00");//create method that keep only two digits after zero.
		
		System.out.println("Total Sock Cost$: "+a.format(totalSockCost$));//print out total sock cost.
		System.out.println("Tax for Socks$: "+a.format(taxSock$));// print out tax for socks.
		System.out.println("Total Glass Cost$: "+a.format(totalGlassCost$)); // print out total glass cost.
		System.out.println("Tax for Glass$: "+a.format(taxGlass$)); // print out tax for glasses.
		System.out.println("Total Envelope Cost$: "+a.format(totalEnvelopeCost$)); // print out total envelope cost.
		System.out.println("Tax for Envelopes"+a.format(taxEnvelope$)); // print out tax for envelopes.
		System.out.println("total Purchase: "+a.format(totalPurchase$)); //print out the sum cost of all goods before taxes.
		System.out.println("total Tax$: "+a.format(totalTax$)); //print out the total tax of all goods.
		System.out.println("total Paid$: "+a.format(totalPaid$)); //print out the amount that you paid

		
	}
}