package ro.ase.cts.adapter.clase;

public class Bilet {
	 private float pret;

	public Bilet(float pret) {
		super();
		this.pret = pret;
	}
	 public void rezerva() {
		 System.out.println("A fost rezervat biletul cu pretul: "+ pret);
	 }
	 public void cumpara() {
		 System.out.println("A fost cumparat biletul cu pretul: "+ pret);
	 }
}
