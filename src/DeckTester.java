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
		String[] rank = {"Ace","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};
		String[] suit = {"Hearts", "Spades","Clubs","Diamonds"};
		int[] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};

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
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
		System.out.println(firstDeck.deal());
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
