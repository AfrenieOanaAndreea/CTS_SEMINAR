package ro.ase.cts.builder.clase;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaInclusa;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	
	
	
	
	public Rezervare(int codRezervare, boolean aremancareInclusa, boolean arescaunErgonomic, boolean arebauturaInclusa,
			boolean aremuzicaAmbientala, String genMuzical) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = aremancareInclusa;
		this.areScaunErgonomic = arescaunErgonomic;
		this.areBauturaInclusa = arebauturaInclusa;
		this.areMuzicaAmbientala = aremuzicaAmbientala;
		this.genMuzical = genMuzical;
	}
	
	
	
	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancareInclusa=" + areMancareInclusa
				+ ", areScaunErgonomic=" + areScaunErgonomic + ", areBauturaInclusa=" + areBauturaInclusa
				+ ", areMuzicaAmbientala=" + areMuzicaAmbientala + ", genMuzical=" + genMuzical + "]";
	}



	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}
	public void setAreMancareInclusa(boolean aremancareInclusa) {
		this.areMancareInclusa = aremancareInclusa;
	}
	public void setAreScaunErgonomic(boolean arescaunErgonomic) {
		this.areScaunErgonomic = arescaunErgonomic;
	}
	public void setAreBauturaInclusa(boolean arebauturaInclusa) {
		this.areBauturaInclusa = arebauturaInclusa;
	}
	public void setAreMuzicaAmbientala(boolean aremuzicaAmbientala) {
		this.areMuzicaAmbientala = aremuzicaAmbientala;
	}
	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}
	
	
	
}
