/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		String[] ranks = {"jack", "queen", "king"};
		String[] suits = {"blue", "red"};
		int[] pointValues = {11, 12, 13};
		final int SHUFFLE_COUNT = 1;

		Deck d = new Deck(ranks, suits, pointValues);

		System.out.println("**** Original Deck Methods ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After 1 Card Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal Remaining 5 Cards ****");
		for (int i = 0; i < 5; i++) {
			System.out.println("  deal: " + d.deal());
		}
		System.out.println();
		System.out.println();

		System.out.println("**** Deck Methods After All Cards Dealt ****");
		System.out.println("  toString:\n" + d.toString());
		System.out.println("  isEmpty: " + d.isEmpty());
		System.out.println("  size: " + d.size());
		System.out.println();
		System.out.println();

		System.out.println("**** Deal a Card From Empty Deck ****");
		System.out.println("  deal: " + d.deal());
		System.out.println();
		System.out.println();

		int[] values1 = {0, 1, 2, 3};
		for (int j = 1; j <= SHUFFLE_COUNT; j++) {
			shuffle(values1);
			System.out.print("  " + j + ":");
			for (int k = 0; k < values1.length; k++) {
				System.out.print(" " + values1[k]);
			}
			System.out.println();
		}
		System.out.println();

	}
	
	public static void shuffle(int[] values) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
		int [] tempValues = new int[values.length];
		int middleVal = (values.length + 1) / 2;
		int notShuffledYet = 0;
		
		for (int i = 0, j = 0; i < middleVal; i++, j +=2)
		{
			tempValues[notShuffledYet] = values[i];
			notShuffledYet += 2;
		}
		
		notShuffledYet = 1;
		
//		for (int x = 0; x < values.length; x++)
//		{
//			tempValues[notShuffledYet] = values[x];
//			notShuffledYet += 2;
//		}
//		
		for (int a = 0; a < values.length; a++)
		{
			values[a] = tempValues[a];
		}
		
		for (int j = 0; j < values.length; j++)
		{
			System.out.println(values[j]);
		}
	}
}
