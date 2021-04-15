package ro.ase.cts.program;

import ro.ase.cts.clase.ComponentaMeniu;
import ro.ase.cts.clase.Item;
import ro.ase.cts.clase.Sectiune;

public class Program {

public static void main(String[] args) {
		
		ComponentaMeniu meniu = new Sectiune("Meniu");
		
		ComponentaMeniu sectiuneBauturi = new Sectiune("Bauturi");
		ComponentaMeniu sectiuneDesert = new Sectiune("Desert");
		
		ComponentaMeniu frappe = new Item("Frappe");
		ComponentaMeniu clatite = new Item("Clatite");
		ComponentaMeniu cola = new Item("Cola");
		
		sectiuneBauturi.adaugaNod(frappe);
		sectiuneBauturi.adaugaNod(cola);
		
		sectiuneDesert.adaugaNod(clatite);
		
		meniu.adaugaNod(sectiuneBauturi);
		meniu.adaugaNod(sectiuneDesert);
		
		meniu.afiseazaInformatii();
		System.out.println("-----------");
		meniu.stergeNod(sectiuneBauturi);
		meniu.stergeNod(sectiuneDesert);
		
		meniu.afiseazaInformatii();
	}

}
