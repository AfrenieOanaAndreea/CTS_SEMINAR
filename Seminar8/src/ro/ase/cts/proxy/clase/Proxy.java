package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare{

	private OperatorRezervare operatorRezervare;
	private int nrMinPersoane;
	
	public Proxy(OperatorRezervare operatorRezervare, int nrMinPersoane) {
		super();
		this.operatorRezervare = operatorRezervare;
		this.nrMinPersoane = nrMinPersoane;
	}
	

	@Override
	public void rezerva(int nrPersoane) {
		if(nrPersoane>nrMinPersoane) {
		operatorRezervare.rezerva(nrPersoane);
	}
		else
			System.out.println("Nu se poate realiza rezervarea pentru "+nrPersoane+" persoane.");
	}


}
