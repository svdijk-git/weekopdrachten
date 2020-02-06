import java.util.ArrayList;

public class Speler {
	private ArrayList<Kaart> kaarten = new ArrayList<Kaart>();

	public int handWaarde() {
		int handWaarde = 0;
		// maak loopje en tel op
		for (Kaart K : this.kaarten) {
			handWaarde = handWaarde + K.getValue();
		}

		return handWaarde;
	}

	public void geefKaart(Kaart kaart) {
		this.kaarten.add(kaart);
	}
}
