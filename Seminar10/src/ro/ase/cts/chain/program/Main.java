package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContDeCredit;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		Cont contCurent=new ContCurent("Ion", 100);
		Cont contEconomii=new ContEconomii("Ion", 200);
		Cont contDeCredit=new ContDeCredit("Ion", 500);
		Cont contIndisponibil=new ContIndisponibil("Ion");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contDeCredit);
		contDeCredit.setSuccesor(contIndisponibil);
		
		contCurent.realizarePlata(50);
		contCurent.realizarePlata(100);
		contCurent.realizarePlata(300);
		contCurent.realizarePlata(600);
		

	}

}
