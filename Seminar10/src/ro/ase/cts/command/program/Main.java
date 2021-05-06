package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		ContBancar contBancar=new ContBancar("Afrenie");
		ManagerComenzi managerComenzi=new ManagerComenzi();
		
		managerComenzi.invoca(new ComandaConstituire(contBancar, 80));
		managerComenzi.invoca(new ComandaDepunere(contBancar, 30));
		managerComenzi.executaComanda();
		managerComenzi.invoca(new ComandaRetragere(contBancar, 20));
		managerComenzi.executaComanda();
		managerComenzi.executaComanda();
		managerComenzi.invoca(new ComandaRetragere(contBancar, 190));
		managerComenzi.executaComanda();

	}

}
