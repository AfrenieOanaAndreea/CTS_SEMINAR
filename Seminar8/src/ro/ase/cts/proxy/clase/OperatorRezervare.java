package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervare{

		private String numeLocal;

	public String getNumeLocal() {
		return numeLocal;
	}
	public OperatorRezervare(String numeLocal) {
		super();
		this.numeLocal = numeLocal;
	}
	@Override
	public void rezerva(int nrPersoane) {
		System.out.println("S-a realizat rezervarea pentru "+nrPersoane+" persoane la localul "+numeLocal+".");
	}

}
