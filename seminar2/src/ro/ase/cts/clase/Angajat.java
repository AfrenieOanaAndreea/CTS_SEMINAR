package ro.ase.cts.clase;



public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	private static float sumaFinantata = 10;

	public String getOcupatie() {
		return ocupatie;
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public int getSalariu() {
		return salariu;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	public Angajat(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumire_Proiecte,
			int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumire_Proiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}

	public Angajat() {
		super();

	}

	public static float getFinantare() {
		return sumaFinantata;
	}

	public static void setFinantare(float sumaFinantata) {
		Angajat.sumaFinantata = sumaFinantata;
	}

	@Override
	public String toString() {
		StringBuilder str = new StringBuilder("Angajat ");
		str.append(super.toString()).append(" Ocupatie=").append(ocupatie).append(", salariu=").append(salariu);
		return str.toString();
	}

	@Override
	public float getSumaFinantata() {
		return sumaFinantata;
	}

}
