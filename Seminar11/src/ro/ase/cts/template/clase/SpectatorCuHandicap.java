package ro.ase.cts.template.clase;

public class SpectatorCuHandicap extends TemplateIntrareStadion{
private String nume;

public SpectatorCuHandicap(String nume) {
	super();
	this.nume = nume;
}

@Override
public void asezareCoada() {
	System.out.println("Spectatorul "+nume+" a fost preluat de la coada");
	
	
}

@Override
public void prezentareBilet() {
	System.out.println("Spectatorului "+nume+" i-a fost preluat biletul");
	
}

@Override
public void controlCorporal() {
	System.out.println("Spectatorului "+nume+" i-a fost controlat caruciorul");
}

@Override
public void ocupareLoc() {
	System.out.println("Spectatorul "+nume+" a fost asezat pe locul special");
	
}

}
