package ro.ase.cts.clase;

public interface ComponentaMeniu {
	
	void adaugaNod(ComponentaMeniu componentaMeniu);
	void stergeNod(ComponentaMeniu componentaMeniu);
	void afiseazaInformatii();
	ComponentaMeniu getComponenta(int index);

}
