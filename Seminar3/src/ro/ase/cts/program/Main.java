package ro.ase.cts.program;

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
	}

}
