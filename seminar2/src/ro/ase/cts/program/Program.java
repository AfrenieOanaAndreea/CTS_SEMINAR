package ro.ase.cts.program;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Proiect;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.UniversalReader;
import ro.ase.cts.clase.readers.StudentReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		System.out.println(Angajat.getFinantare());
		System.out.println(Student.getFinantare());
		System.out.println(Elev.getFinantare());
		try {
			Proiect proiect = new Proiect(80);
			listaAplicanti = UniversalReader.readAplicants(new StudentReader("studenti.txt"));
			for (Aplicant aplicant : listaAplicanti) {
				System.out.println(aplicant.toString());
				System.out.println(aplicant.getSumaFinantata());
				aplicant.afisareStatutProiect(proiect);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
