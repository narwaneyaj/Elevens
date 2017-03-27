/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card card1 = new Card("Ace", "Diamonds", 10);
		Card card2 = new Card("Queen", "Spades", 15);
		Card card3 = new Card("King", "Hearts", 20);
		
		System.out.println("Card 1 suit:" + card1.suit());
		System.out.println("Card 2 suit:" + card2.suit());
		System.out.println("Card 3 suit:" + card3.suit());
		System.out.println("Card 1 rank:" + card1.rank());
		System.out.println("Card 2 rank:" + card2.rank());
		System.out.println("Card 3 rank:" + card3.rank());
		System.out.println("Card 1 point value:" + card1.pointValue());
		System.out.println("Card 2 point value:" + card2.pointValue());
		System.out.println("Card 3 point value:" + card3.pointValue());
		
		System.out.println("Checking if card 1 is equal to card 2 " + card1.matches(card2));
		System.out.println("Card 1 Values: " + card1.toString());
	}
}
