import java.util.Random;


public class CardGenerator {
	
	// main method required for every Java program
	public static void main(String[] args) 
	{
		Random gen = new Random();
		int card = gen.nextInt(52)+1;
		String cardname="1",suitname="1";

		//diamond
		if(card <=13)
		{
			 suitname="Diamond";
		}
		else if(card <=26)//clubs
		{
			suitname="Clubs";
		}
		else if (card<=39)//hearts
		{
			suitname="Hearts";
		}
		else if (card<=52)//spades
		{
			suitname="Spades";
		}
		switch (card)
		{
			case 1: cardname="Ace"; break;
			case 2: cardname="2"; break;
			case 3: cardname="3"; break;
			case 4: cardname="4"; break;
			case 5: cardname="5"; break;
			case 6: cardname="6"; break;
			case 7: cardname="7"; break;
			case 8: cardname="8"; break;
			case 9: cardname="9"; break;
			case 10: cardname="10"; break;
			case 11: cardname="Jack"; break;
			case 12: cardname="Queen"; break;
			case 13: cardname="King"; break;
			case 14: cardname="Ace"; break;
			case 15: cardname="2"; break;
			case 16: cardname="3"; break;
			case 17: cardname="4"; break;
			case 18: cardname="5"; break;
			case 19: cardname="6"; break;
			case 20: cardname="7"; break;
			case 21: cardname="8"; break;
			case 22: cardname="9"; break;
			case 23: cardname="10"; break;
			case 24: cardname="Jack"; break;
			case 25: cardname="Queen"; break;
			case 26: cardname="King"; break;
			case 27: cardname="Ace"; break;
			case 28: cardname="2"; break;
			case 29: cardname="3"; break;
			case 30: cardname="4"; break;
			case 31: cardname="5"; break;
			case 32: cardname="6"; break;
			case 33: cardname="7"; break;
			case 34: cardname="8"; break;
			case 35: cardname="9"; break;
			case 36: cardname="10"; break;
			case 37: cardname="Jack"; break;
			case 38: cardname="Queen"; break;
			case 39: cardname="King"; break;
			case 40: cardname="Ace"; break;
			case 41: cardname="2"; break;
			case 42: cardname="3"; break;
			case 43: cardname="4"; break;
			case 44: cardname="5"; break;
			case 45: cardname="6"; break;
			case 46: cardname="7"; break;
			case 47: cardname="8"; break;
			case 48: cardname="9"; break;
			case 49: cardname="10"; break;
			case 50: cardname="Jack"; break;
			case 51: cardname="Queen"; break;
			case 52: cardname="King"; break;
		}//end of switch
		System.out.println("You have picked the "+cardname+" of "+suitname);
	}//end of main
}//end of class
