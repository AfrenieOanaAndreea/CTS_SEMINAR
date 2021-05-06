package ro.ase.cts.chain.clase;

public class ContIndisponibil extends Cont{

	public ContIndisponibil(String detinator) {
		super(detinator, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarePlata(float suma) {
		System.out.println("Plata nu se poate realiza");
		
	}

}
