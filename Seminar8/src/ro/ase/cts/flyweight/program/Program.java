package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FlyweightFabrica;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezeravre1=new Rezervare(3, 6, 1);
		Rezervare rezeravre2=new Rezervare(1, 4, 8);
		Rezervare rezeravre3=new Rezervare(5, 2, 3);
		
	FlyweightFabrica flyweightFabrica=new FlyweightFabrica();
	Client client1=(Client) flyweightFabrica.getClient("0766630060");
	client1.afiseazaInformatii(rezeravre1);

	Client client2=(Client) flyweightFabrica.getClient("0766600000");
	client2.afiseazaInformatii(rezeravre2);
	
	flyweightFabrica.getClient("0766630060").afiseazaInformatii(rezeravre3);

	}

}
