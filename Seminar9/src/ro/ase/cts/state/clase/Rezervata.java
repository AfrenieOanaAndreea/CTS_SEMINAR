package ro.ase.cts.state.clase;

public class Rezervata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		if(masa.getStare() instanceof Libera) {
			System.out.println("Ati REZERVAT masa cu codul "+masa.getNr());
			masa.setStare(this);
		}
		else
			System.out.println("Masa "+masa.getNr()+" nu poate fi REZERVATA");
		
	}

}
