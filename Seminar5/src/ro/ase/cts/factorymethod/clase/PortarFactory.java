package ro.ase.cts.factorymethod.clase;

public class PortarFactory implements JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		Portar portar=new Portar(nume);
		return portar;
	}

}
