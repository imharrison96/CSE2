import java.util.Random;


public class PokerHandCheck {
	// main method required for every Java program
				
					public static void main(String[] args) 
					{
						Random gen = new Random();//create random number generator
						//create first random card
						int card = gen.nextInt(52)+1;
						String cardname="1",suitname="1";
						//create second random card
						int card2= gen.nextInt(52)+1;
						String cardname2="1",suitname2="2";
						//create third random card
						int card3= gen.nextInt(52)+1;
						String cardname3="1",suitname3="2";
						//create forth random card
						int card4= gen.nextInt(52)+1;
						String cardname4="1",suitname4="2";
						//create fifth random card
						int card5= gen.nextInt(52)+1;
						String cardname5="1",suitname5="2";
						//declare numbers to identify cards with the same number
						int mod,mod2,mod3,mod4,mod5;
						
						
						//first card
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
						//assign each card its identity
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
						
						
						//second card
						//diamond
						if(card2 <=13)
						{
							 suitname2="Diamond";
						}
						else if(card2 <=26)//clubs
						{
							suitname2="Clubs";
						}
						else if (card2<=39)//hearts
						{
							suitname2="Hearts";
						}
						else if (card2<=52)//spades
						{
							suitname2="Spades";
						}
						//assign each card its identity
						switch (card2)
						{
							case 1: cardname2="Ace"; break;
							case 2: cardname2="2"; break;
							case 3: cardname2="3"; break;
							case 4: cardname2="4"; break;
							case 5: cardname2="5"; break;
							case 6: cardname2="6"; break;
							case 7: cardname2="7"; break;
							case 8: cardname2="8"; break;
							case 9: cardname2="9"; break;
							case 10: cardname2="10"; break;
							case 11: cardname2="Jack"; break;
							case 12: cardname2="Queen"; break;
							case 13: cardname2="King"; break;
							case 14: cardname2="Ace"; break;
							case 15: cardname2="2"; break;
							case 16: cardname2="3"; break;
							case 17: cardname2="4"; break;
							case 18: cardname2="5"; break;
							case 19: cardname2="6"; break;
							case 20: cardname2="7"; break;
							case 21: cardname2="8"; break;
							case 22: cardname2="9"; break;
							case 23: cardname2="10"; break;
							case 24: cardname2="Jack"; break;
							case 25: cardname2="Queen"; break;
							case 26: cardname2="King"; break;
							case 27: cardname2="Ace"; break;
							case 28: cardname2="2"; break;
							case 29: cardname2="3"; break;
							case 30: cardname2="4"; break;
							case 31: cardname2="5"; break;
							case 32: cardname2="6"; break;
							case 33: cardname2="7"; break;
							case 34: cardname2="8"; break;
							case 35: cardname2="9"; break;
							case 36: cardname2="10"; break;
							case 37: cardname2="Jack"; break;
							case 38: cardname2="Queen"; break;
							case 39: cardname2="King"; break;
							case 40: cardname2="Ace"; break;
							case 41: cardname2="2"; break;
							case 42: cardname2="3"; break;
							case 43: cardname2="4"; break;
							case 44: cardname2="5"; break;
							case 45: cardname2="6"; break;
							case 46: cardname2="7"; break;
							case 47: cardname2="8"; break;
							case 48: cardname2="9"; break;
							case 49: cardname2="10"; break;
							case 50: cardname2="Jack"; break;
							case 51: cardname2="Queen"; break;
							case 52: cardname2="King"; break;
						}
						
						
						//third card
						//diamond
						if(card3 <=13)
						{
							 suitname3="Diamond";
						}
						else if(card3 <=26)//clubs
						{
							suitname3="Clubs";
						}
						else if (card3<=39)//hearts
						{
							suitname3="Hearts";
						}
						else if (card3<=52)//spades
						{
							suitname3="Spades";
						}
						//assign each card its identity
						switch (card3)
						{
							case 1: cardname3="Ace"; break;
							case 2: cardname3="2"; break;
							case 3: cardname3="3"; break;
							case 4: cardname3="4"; break;
							case 5: cardname3="5"; break;
							case 6: cardname3="6"; break;
							case 7: cardname3="7"; break;
							case 8: cardname3="8"; break;
							case 9: cardname3="9"; break;
							case 10: cardname3="10"; break;
							case 11: cardname3="Jack"; break;
							case 12: cardname3="Queen"; break;
							case 13: cardname3="King"; break;
							case 14: cardname3="Ace"; break;
							case 15: cardname3="2"; break;
							case 16: cardname3="3"; break;
							case 17: cardname3="4"; break;
							case 18: cardname3="5"; break;
							case 19: cardname3="6"; break;
							case 20: cardname3="7"; break;
							case 21: cardname3="8"; break;
							case 22: cardname3="9"; break;
							case 23: cardname3="10"; break;
							case 24: cardname3="Jack"; break;
							case 25: cardname3="Queen"; break;
							case 26: cardname3="King"; break;
							case 27: cardname3="Ace"; break;
							case 28: cardname3="2"; break;
							case 29: cardname3="3"; break;
							case 30: cardname3="4"; break;
							case 31: cardname3="5"; break;
							case 32: cardname3="6"; break;
							case 33: cardname3="7"; break;
							case 34: cardname3="8"; break;
							case 35: cardname3="9"; break;
							case 36: cardname3="10"; break;
							case 37: cardname3="Jack"; break;
							case 38: cardname3="Queen"; break;
							case 39: cardname3="King"; break;
							case 40: cardname3="Ace"; break;
							case 41: cardname3="2"; break;
							case 42: cardname3="3"; break;
							case 43: cardname3="4"; break;
							case 44: cardname3="5"; break;
							case 45: cardname3="6"; break;
							case 46: cardname3="7"; break;
							case 47: cardname3="8"; break;
							case 48: cardname3="9"; break;
							case 49: cardname3="10"; break;
							case 50: cardname3="Jack"; break;
							case 51: cardname3="Queen"; break;
							case 52: cardname3="King"; break;
						}
						
						//forth card
						//diamond
						if(card4 <=13)
						{
							 suitname4="Diamond";
						}
						else if(card4 <=26)//clubs
						{
							suitname4="Clubs";
						}
						else if (card4<=39)//hearts
						{
							suitname4="Hearts";
						}
						else if (card4<=52)//spades
						{
							suitname4="Spades";
						}
						//assign each card its identity
						switch (card4)
						{
							case 1: cardname4="Ace"; break;
							case 2: cardname4="2"; break;
							case 3: cardname4="3"; break;
							case 4: cardname4="4"; break;
							case 5: cardname4="5"; break;
							case 6: cardname4="6"; break;
							case 7: cardname4="7"; break;
							case 8: cardname4="8"; break;
							case 9: cardname4="9"; break;
							case 10: cardname4="10"; break;
							case 11: cardname4="Jack"; break;
							case 12: cardname4="Queen"; break;
							case 13: cardname4="King"; break;
							case 14: cardname4="Ace"; break;
							case 15: cardname4="2"; break;
							case 16: cardname4="3"; break;
							case 17: cardname4="4"; break;
							case 18: cardname4="5"; break;
							case 19: cardname4="6"; break;
							case 20: cardname4="7"; break;
							case 21: cardname4="8"; break;
							case 22: cardname4="9"; break;
							case 23: cardname4="10"; break;
							case 24: cardname4="Jack"; break;
							case 25: cardname4="Queen"; break;
							case 26: cardname4="King"; break;
							case 27: cardname4="Ace"; break;
							case 28: cardname4="2"; break;
							case 29: cardname4="3"; break;
							case 30: cardname4="4"; break;
							case 31: cardname4="5"; break;
							case 32: cardname4="6"; break;
							case 33: cardname4="7"; break;
							case 34: cardname4="8"; break;
							case 35: cardname4="9"; break;
							case 36: cardname4="10"; break;
							case 37: cardname4="Jack"; break;
							case 38: cardname4="Queen"; break;
							case 39: cardname4="King"; break;
							case 40: cardname4="Ace"; break;
							case 41: cardname4="2"; break;
							case 42: cardname4="3"; break;
							case 43: cardname4="4"; break;
							case 44: cardname4="5"; break;
							case 45: cardname4="6"; break;
							case 46: cardname4="7"; break;
							case 47: cardname4="8"; break;
							case 48: cardname4="9"; break;
							case 49: cardname4="10"; break;
							case 50: cardname4="Jack"; break;
							case 51: cardname4="Queen"; break;
							case 52: cardname4="King"; break;
						}//end of switch
						
						//fifth card
						//diamond
						if(card5 <=13)
						{
							 suitname5="Diamond";
						}
						else if(card5 <=26)//clubs
						{
							suitname5="Clubs";
						}
						else if (card5<=39)//hearts
						{
							suitname5="Hearts";
						}
						else if (card5<=52)//spades
						{
							suitname5="Spades";
						}
						//assign each card its identity
						switch (card5)
						{
							case 1: cardname5="Ace"; break;
							case 2: cardname5="2"; break;
							case 3: cardname5="3"; break;
							case 4: cardname5="4"; break;
							case 5: cardname5="5"; break;
							case 6: cardname5="6"; break;
							case 7: cardname5="7"; break;
							case 8: cardname5="8"; break;
							case 9: cardname5="9"; break;
							case 10: cardname5="10"; break;
							case 11: cardname5="Jack"; break;
							case 12: cardname5="Queen"; break;
							case 13: cardname5="King"; break;
							case 14: cardname5="Ace"; break;
							case 15: cardname5="2"; break;
							case 16: cardname5="3"; break;
							case 17: cardname5="4"; break;
							case 18: cardname5="5"; break;
							case 19: cardname5="6"; break;
							case 20: cardname5="7"; break;
							case 21: cardname5="8"; break;
							case 22: cardname5="9"; break;
							case 23: cardname5="10"; break;
							case 24: cardname5="Jack"; break;
							case 25: cardname5="Queen"; break;
							case 26: cardname5="King"; break;
							case 27: cardname5="Ace"; break;
							case 28: cardname5="2"; break;
							case 29: cardname5="3"; break;
							case 30: cardname5="4"; break;
							case 31: cardname5="5"; break;
							case 32: cardname5="6"; break;
							case 33: cardname5="7"; break;
							case 34: cardname5="8"; break;
							case 35: cardname5="9"; break;
							case 36: cardname5="10"; break;
							case 37: cardname5="Jack"; break;
							case 38: cardname5="Queen"; break;
							case 39: cardname5="King"; break;
							case 40: cardname5="Ace"; break;
							case 41: cardname5="2"; break;
							case 42: cardname5="3"; break;
							case 43: cardname5="4"; break;
							case 44: cardname5="5"; break;
							case 45: cardname5="6"; break;
							case 46: cardname5="7"; break;
							case 47: cardname5="8"; break;
							case 48: cardname5="9"; break;
							case 49: cardname5="10"; break;
							case 50: cardname5="Jack"; break;
							case 51: cardname5="Queen"; break;
							case 52: cardname5="King"; break;
						}//end of switch
						//print out the first card
						System.out.println("Your random cards were: ");
						System.out.println(" the "+cardname+" of "+suitname);
						//print out the second card
						System.out.println(" the "+cardname2+" of "+suitname2);
						//print out the third card
						System.out.println(" the "+cardname3+" of "+suitname3);
						//print out the forth card
						System.out.println(" the "+cardname4+" of "+suitname4);
						//print out the fifth card
						System.out.println(" the "+cardname5+" of "+suitname5);
						
						
						
						//to find out the special combination
						
						//find each card's number
						mod=card%13;
						mod2=card2%13;
						mod3=card3%13;
						mod4=card4%13;
						mod5=card5%13;
								
						int pair=0;//count of cards which have the same number
						
						//if one of them are equal, the counts +1
						if (mod==mod2)
						{
							pair++;
						}
						if (mod==mod3)
						{
							pair++;
						}
						if (mod==mod4)
						{
							pair++;
						}
						if (mod==mod5)
						{
							pair++;
						}
						if (mod2==mod3)
						{
							pair++;
						}
						if (mod2==mod4)
						{
							pair++;
						}
						if (mod2==mod5)
						{
							pair++;
						}
						if (mod3==mod4)
						{
							pair++;
						}
						if (mod3==mod5)
						{
							pair++;
						}
						if (mod4==mod5)
						{
							pair++;
						}
						//declare the count for three cards that have the same number
						int count=0;
						
						//if there are three cards with the same number, the count +1;
						if(mod==mod2&& mod2==mod3)
						{
						count ++;	
						}
						if(mod==mod2&& mod2==mod4)
						{
						count ++;	
						}
						if(mod==mod2&& mod2==mod5)
						{
						count ++;	
						}
						if(mod==mod3&& mod3==mod4)
						{
						count ++;	
						}
						if(mod==mod3&& mod3==mod5)
						{
						count ++;	
						}
						if(mod==mod4&& mod4==mod5)
						{
						count ++;	
						}
						
						
						//There is only one pair
						if (pair==1)
						{
							System.out.println("You have a pair");
						}
						//There are two pair
						 if(pair ==2)
						{
							System.out.println("You have two pairs");
						}
						 //There is a three of one kind
						if(count==1)
						{
							System.out.println("You have a three of a kind");
						}
						//There is no special combination
						 if (pair==0)
						{
							System.out.println("You have a high card hand!");
						}
						
						
						
				}//end of main
}//end of class
