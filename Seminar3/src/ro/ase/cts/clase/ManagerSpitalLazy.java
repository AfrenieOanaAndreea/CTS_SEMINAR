package ro.ase.cts.clase;

public class ManagerSpitalLazy {
	private String nume;
	private int varsta;
	private int marca;

	private static ManagerSpitalLazy managerLazy = null;

	public static synchronized ManagerSpitalLazy getInstance(String nume, int varsta, int marca) {
		if (managerLazy == null) {
			managerLazy = new ManagerSpitalLazy(nume, varsta, marca);
		}

		return managerLazy;
	}

	private ManagerSpitalLazy(String nume, int varsta, int marca) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.marca = marca;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "ManagerSpitalLazy  [nume=" + nume + ", varsta=" + varsta + ", marca=" + marca + "]";
	}

}
