package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletAdapter;
import ro.ase.cts.adapter.clase.BiletAdapterObiecte;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Main {
	public static void rezervaSiCumparaBilet(BiletOnline biletOnline) {
		biletOnline.rezervaBilet();
		biletOnline.cumparaBilet();
	}
	public static void rezervaSiCumparaBiletLaCasa(Bilet bilet) {
		bilet.rezerva();
		bilet.cumpara();
	}
	
	public static void main(String[] args) {
		Bilet bilet=new Bilet(30);
		rezervaSiCumparaBiletLaCasa(bilet);  
		
		BiletOnline biletOnline=new BiletAdapter(40);
		rezervaSiCumparaBilet(biletOnline);
		biletOnline.rezervaBilet();
		
		BiletAdapterObiecte biletAdapter=new BiletAdapterObiecte(bilet);
		rezervaSiCumparaBilet(biletAdapter);
		
		
		
	}

}
