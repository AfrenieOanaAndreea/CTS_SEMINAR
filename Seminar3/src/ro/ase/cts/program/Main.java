package ro.ase.cts.program;

import ro.ase.cts.clase.Avion;
import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {

		ManagerSpital manager1 = ManagerSpital.getInstance();
		ManagerSpital manager2 = ManagerSpital.getInstance();

		System.out.println(manager1.toString());
		System.out.println(manager2.toString());

		ManagerSpitalLazy managerLazy1 = ManagerSpitalLazy.getInstance("Popescu", 48, 1222);
		ManagerSpitalLazy managerLazy2 = ManagerSpitalLazy.getInstance("Ionescu", 38, 2781);

		managerLazy1.setVarsta(35);
		managerLazy2.setNume("Ionel");

		System.out.println(managerLazy1.toString());
		System.out.println(managerLazy2.toString());
		
		Avion avion1=Avion.getInstance("Boeing 747", 120, 13456);
		Avion avion2=Avion.getInstance("A751", 50, 43456);
		
		avion1.setDistantaParcursa(25679);
		avion2.setNumarLocuri(70);
		
		System.out.println(avion1.toString());
		System.out.println(avion2.toString());
		
	}

}
