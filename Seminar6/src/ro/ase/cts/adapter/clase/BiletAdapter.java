package ro.ase.cts.adapter.clase;

public class BiletAdapter extends Bilet implements BiletOnline {

	public BiletAdapter(float pret) {
		super(pret);
	}
	@Override
	public void cumparaBilet() {
		super.cumpara();
	}
	@Override
	public void rezervaBilet() {
		super.rezerva();
	}

}
