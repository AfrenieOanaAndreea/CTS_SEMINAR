package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float sold;
	
	
	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire(float suma) {
		sold=suma;
		System.out.println("S-a constituit contul cu suma de "+suma);
	}
	public void retragere(float suma) {
		if(suma<=sold)
		{
			sold=sold-suma;
		System.out.println("S-a retras din cont cu suma de "+suma);
		}
		else {
			System.out.println("Nu se poate retrage suma de "+suma+" din cont");
		}
	}
	public void depunere(float suma) {
		sold=sold+suma;
		System.out.println("S-a depus in cont cu suma de "+suma);
	}
}
