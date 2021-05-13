package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorCuHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;

public class Main {

	public static void main(String[] args) {
		SpectatorUzual spectator1=new SpectatorUzual("Ionescu");
		spectator1.intrareStadion();
		SpectatorCuHandicap spectator2=new SpectatorCuHandicap("Popescu");
		spectator2.intrareStadion();
	}

}
