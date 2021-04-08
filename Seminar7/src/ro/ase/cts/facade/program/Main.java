package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDeDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Main {

	public static void main(String[] args) {
		
		Persoana p1=new Persoana("Ionut", "1990730000111");
		Bilet b1=new Bilet("Ionut", "1D");
		
		if(p1.getNume().equals(b1.getNume())) {
			if(!Politie.esteUrmarita(p1)) {
				if(!BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					System.out.println("Va rog intrati");
				}
			}
			
		}
		
		Persoana p2=new Persoana("Carmen", "2990731000001");
		Bilet b2=new Bilet("Carmen", "8D");
		
		if(Facade.sePermiteAccesulPeStadion(p2, b2))
			System.out.println("Va rog intrati!");
		else
			System.out.println("Ne pare rau, nu puteti sa intrati!");

	}

}
