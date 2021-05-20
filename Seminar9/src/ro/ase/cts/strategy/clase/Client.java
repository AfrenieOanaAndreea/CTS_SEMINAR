
package ro.ase.cts.strategy.clase;

public class Client {
	
	private String nume;
	private ModalitatePlata modalitatePlata;

	
	public Client(String nume, ModalitatePlata modalitatePlata) {
		super();
		this.nume = nume;
		this.modalitatePlata = modalitatePlata;
	}


	public void setModalitatePlata(ModalitatePlata modalitatePlata) {
		this.modalitatePlata = modalitatePlata;
	}
	
	public void platesteNote(int suma) {
		System.out.println(nume+" are de plata nota in valoare de "+suma+" lei.");
		modalitatePlata.achita(suma);
	}
	
	

}
