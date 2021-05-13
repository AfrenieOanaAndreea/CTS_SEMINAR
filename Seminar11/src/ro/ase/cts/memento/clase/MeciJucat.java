package ro.ase.cts.memento.clase;

public class MeciJucat {
private int nrSpectatori;
private String numeEchipaGazda;
private String numeEchipaOaspeti;
private int nrBileteVandute;
private int nrSticleApaVandute;
private int nrJandarmi;

public MeciJucat(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti, int nrBileteVandute,
		int nrSticleApaVandute, int nrJandarmi) {
	super();
	this.nrSpectatori = nrSpectatori;
	this.numeEchipaGazda = numeEchipaGazda;
	this.numeEchipaOaspeti = numeEchipaOaspeti;
	this.nrBileteVandute = nrBileteVandute;
	this.nrSticleApaVandute = nrSticleApaVandute;
	this.nrJandarmi = nrJandarmi;
}

public Memento slavareInformatii() {
	Memento memento=new Memento(nrSpectatori, numeEchipaGazda, numeEchipaOaspeti);
	return memento;
}

public void revenire(Memento memento) {
	this.nrSpectatori=memento.getNrSpectatori();
	this.numeEchipaGazda=memento.getEchipaGazda();
	this.numeEchipaOaspeti=memento.getEchipaOaspete();
}

public void setNrSpectatori(int nrSpectatori) {
	this.nrSpectatori = nrSpectatori;
}

public void setNumeEchipaGazda(String numeEchipaGazda) {
	this.numeEchipaGazda = numeEchipaGazda;
}

public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
	this.numeEchipaOaspeti = numeEchipaOaspeti;
}

public void setNrBileteVandute(int nrBileteVandute) {
	this.nrBileteVandute = nrBileteVandute;
}

public void setNrSticleApaVandute(int nrSticleApaVandute) {
	this.nrSticleApaVandute = nrSticleApaVandute;
}

public void setNrJandarmi(int nrJandarmi) {
	this.nrJandarmi = nrJandarmi;
}

@Override
public String toString() {
	return "MeciJucat [nrSpectatori=" + nrSpectatori + ", numeEchipaGazda=" + numeEchipaGazda + ", numeEchipaOaspeti="
			+ numeEchipaOaspeti + ", nrBileteVandute=" + nrBileteVandute + ", nrSticleApaVandute=" + nrSticleApaVandute
			+ ", nrJandarmi=" + nrJandarmi + "]";
}

}
