package ro.ase.cts.flyweight.clase;

public class Rezervare {
	private int nrMasa;
	private int nrRezervare;
	private int oraRezervare;

	public Rezervare(int nrMasa, int nrRezervare, int oraRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrRezervare = nrRezervare;
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [nrMasa=");
		builder.append(nrMasa);
		builder.append(", nrRezervare=");
		builder.append(nrRezervare);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}

}
