package ro.ase.cts.strategy.clase;

public class Card implements ModalitatePlata{

	private int sold; 

	public Card(int sold) {
		super();
		this.sold = sold;
	}
	
	@Override
	public void achita(float suma) {
		if(sold>=suma) {
		System.out.println("S-a relizat plata cu CARDUL pentru suma "+suma+" lei");
		sold-=suma;
		}else
		System.out.println("Sold insuficient");
	}

}
