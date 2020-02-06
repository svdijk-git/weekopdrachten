import java.util.ArrayList;

public class Game {

	private ArrayList<Kaart> deck = new ArrayList<Kaart>();

	private Speler Henk = new Speler();
	private Speler Dealer = new Speler();

	public void maakDeck() {
		for (int i = 0; i < 4; i++) {
			for (int j = 2; j < 12; j++) {
				if (j == 10) {
					this.deck.add(new Kaart(j, i));
					this.deck.add(new Kaart(j, i));
					this.deck.add(new Kaart(j, i));

				}
				this.deck.add(new Kaart(j, i));

			}

		}
	}

	public Game() {
	}

	public void deelKaarten() {
		this.Henk.geefKaart(this.randomKaart());
		this.Dealer.geefKaart(this.randomKaart());
	}

	private Kaart randomKaart() {

		return new Kaart(2, 3);
	}
}
