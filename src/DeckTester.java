/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 2 *** */
		String[] rank = {"Ace","Two","Three"};
		String[] suit = {"Hearts", "Spades","Clubs"};
		int[] value = {1,2,3};

		Deck firstDeck = new Deck (rank, suit, value);
		System.out.println("Deck size is: " + firstDeck.size());
		System.out.println("Is deck empty: " + firstDeck.isEmpty());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());

	}
}
