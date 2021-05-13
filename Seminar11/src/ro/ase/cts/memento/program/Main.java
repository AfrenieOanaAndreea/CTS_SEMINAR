package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeciuriJucate;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meciJucat=new MeciJucat(500, "Steaua", "Dinamo", 500, 20, 10);
		ManagerMeciuriJucate mangerManagerMeciuriJucate=new ManagerMeciuriJucate();
		mangerManagerMeciuriJucate.adaugaMemento(meciJucat.slavareInformatii());
	meciJucat.setNrSpectatori(300);
	meciJucat.setNumeEchipaGazda("Chiajna");
	meciJucat.setNumeEchipaOaspeti("Chindia Targoviste");
	mangerManagerMeciuriJucate.adaugaMemento(meciJucat.slavareInformatii());
	
	System.out.println(meciJucat.toString());
	meciJucat.revenire(mangerManagerMeciuriJucate.getMemento(0));
	System.out.println(meciJucat.toString());
	}

}
