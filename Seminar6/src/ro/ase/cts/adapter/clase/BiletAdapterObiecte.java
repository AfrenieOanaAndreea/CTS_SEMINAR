package ro.ase.cts.adapter.clase;

public class BiletAdapterObiecte implements BiletOnline {
	Bilet bilet;
	
	
	public BiletAdapterObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBilet() {
		bilet.rezerva();
	}

	@Override
	public void cumparaBilet() {
		bilet.cumpara();
	}

}
