package ro.ase.cts.clase;

public class Avion {
	private String model;
	private int numarLocuri;
	private float distantaParcursa;
	
	private static Avion avion =null;

	public static synchronized Avion getInstance(String nume, int numarLocuri, int distantaParcursa) {
		if (avion == null) {
			avion =  new Avion(nume,numarLocuri, distantaParcursa);
		}

		return avion;
	}

	private Avion(String model, int numarLocuri, float distantaParcursa) {
		super();
		this.model = model;
		this.numarLocuri = numarLocuri;
		this.distantaParcursa = distantaParcursa;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setNumarLocuri(int numarLocuri) {
		this.numarLocuri = numarLocuri;
	}

	public void setDistantaParcursa(float distantaParcursa) {
		this.distantaParcursa = distantaParcursa;
	}

	@Override
	public String toString() {
		return "Avion [model=" + model + ", numarLocuri=" + numarLocuri + ", distantaParcursa=" + distantaParcursa
				+ "]";
	}
	
	
	
}
