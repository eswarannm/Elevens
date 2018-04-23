1.You would need cards; a deck of cards.
2.
	1.Lay out 9 cards from the deck.
	2.Pick out cards that add up to 11 or JQK if possible.
	3.Replace the cards you took out.
	4.Keep repeating steps 2 and 3 until no more pairs of 11 or JQK or present.
	5.If no more cards remain in the deck you win. If there are cards left you lose.

3. yes
4a. newGame and the ElevensBoard constructor
4b.isLegal and anotherPlayIsPossible
4c.0,1,3,6,7
4d.
		for (Integer i : cIndexes){
			System.out.println(boards.cards[i])
		}

4e.anotherPlayIsPossible needs to be called before isLegal so that win or loss can be determined and isLegal won't have to run.