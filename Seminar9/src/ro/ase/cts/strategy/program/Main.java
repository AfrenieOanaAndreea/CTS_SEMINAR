package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Card;
import ro.ase.cts.strategy.clase.Cash;
import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.ModalitatePlata;

public class Main {

	public static void main(String[] args) {
		Card card=new Card(600);
		
		Client client1=new Client("Gigel", card);
		client1.platesteNote(300);
		client1.setModalitatePlata(new Cash());
		client1.platesteNote(50);
		client1.setModalitatePlata(card);
		client1.platesteNote(700);

	}

}
