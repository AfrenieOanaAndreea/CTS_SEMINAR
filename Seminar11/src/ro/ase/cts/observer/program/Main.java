package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Subiect;

public class Main {

	public static void main(String[] args) {
		ManagerSala manager=new ManagerSala();
		Client client1=new Client("Ionescu");
		Client client2=new Client("Florescu");
		Client client3=new Client("Popescu");
		Client client4=new Client("Georgescu");
		manager.adaugaObserver(client1);
		manager.adaugaObserver(client2);
		manager.adaugaObserver(client3);
		manager.adaugaObserver(client4);
		
		manager.anuntaMeciHabal();
		manager.stergeObserver(client2);
		manager.anuntaMeciFotbal();
	}

}
