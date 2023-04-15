/*
 * Create a Card class that represents a playing card. It should have an int instance
 * variable named rank and a char variable named suit. Give it a constructor with
 * two parameters for initializing the two instance variables and give it a getSuit()
 * method and a getRank() method that return the values of the two instance variables.
 * Then create a CardTester class with a main method that creates five Cards and make
 * up a full house (that is, three of the cards have same rank and the other two cards
 * have the same rank) and prints out the ranks and suits of the five Cards using the
 * getSuit() and getRank() methods. 
 */
class Card {
	int rank;
	char suit;
	
	Card() {
		rank = 0;
		suit = '\0';
	}
	
	Card(int rank, char suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	int getRank() {
		return rank;
	}
	
	char getSuit() {
		return suit;
	}
}

class CardTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c1 = new Card(1,'h');
		Card c2 = new Card(1,'h');
		Card c3 = new Card(1,'h');
		Card c4 = new Card(4,'o');
		Card c5 = new Card(4,'o');
		
		System.out.println("Card 1, rank : " + c1.getRank() + " suit : " + c1.getSuit());
		System.out.println("Card 1, rank : " + c2.getRank() + " suit : " + c2.getSuit());
		System.out.println("Card 1, rank : " + c3.getRank() + " suit : " + c3.getSuit());
		System.out.println("Card 1, rank : " + c4.getRank() + " suit : " + c4.getSuit());
		System.out.println("Card 1, rank : " + c5.getRank() + " suit : " + c5.getSuit());
	}

}
