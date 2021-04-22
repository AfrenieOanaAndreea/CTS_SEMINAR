package ro.ase.cts.state.clase;

public class Ocupata implements Stare {

	@Override
	public void schimbaStare(Masa masa) {
		if(! (masa.getStare() instanceof Ocupata)) {
			System.out.println("Ati OCUPAT masa cu codul "+masa.getNr());
			masa.setStare(this);
		}
		else
			System.out.println("Masa "+masa.getNr()+" nu poate fi OCUPATA");
		
	}
		
}


