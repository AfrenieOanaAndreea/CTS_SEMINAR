package ro.ase.cts.chain.clase;

public class ContCurent extends Cont{

	public ContCurent(String detinator, float sold) {
		super(detinator, sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizarePlata(float suma) {
		if(super.getSold() > suma) {
			System.out.println("S-a realizat plata de " + suma + " RON din contul curent.");
			super.setSold(super.getSold() - suma);
		} else {
			super.getSuccesor().realizarePlata(suma);
		}
		
	}

}