
public class Kaart {
	private int value;
	private Suit suit;

	public Kaart(int value, Suit suit) {
		this.suit = suit;
		this.value = value;

	}

	public Kaart(int value, int suit) {
		if (suit == 0) {
			this.suit = Suit.Clovers;
		}
		if (suit == 1) {
			this.suit = Suit.Clubs;
		}
		if (suit == 2) {
			this.suit = Suit.Diamonds;
		}
		if (suit == 3) {
			this.suit = Suit.Hearts;
		}
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}

}