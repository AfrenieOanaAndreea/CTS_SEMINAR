package ro.ase.cts.builder.clase;

public class BuilderRezervareV2 implements BuilderAbstract {
	
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areScaunErgonomic;
	private boolean areBauturaInclusa;
	private boolean areMuzicaAmbientala;
	private String genMuzical;
	
	
	public BuilderRezervareV2() {
		super();
		this.codRezervare = 0;
		this.areMancareInclusa = false;
		this.areScaunErgonomic = false;
		this.areBauturaInclusa = false;
		this.areMuzicaAmbientala = false;
		this.genMuzical = "";
	}


	public BuilderRezervareV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}


	public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}


	public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}


	public BuilderRezervareV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}


	public BuilderRezervareV2 setAreMuzicaAmbientala(boolean areMuzicaAmbientala) {
		this.areMuzicaAmbientala = areMuzicaAmbientala;
		return this;
	}


	public BuilderRezervareV2 setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
		return this;
	}


	@Override
	public Rezervare build() {
		Rezervare rezervare=new Rezervare(codRezervare, areMancareInclusa, areScaunErgonomic, areBauturaInclusa, areMuzicaAmbientala, genMuzical);
		return rezervare;
	}
	
	
}
