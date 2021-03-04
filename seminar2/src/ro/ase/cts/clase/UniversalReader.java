package ro.ase.cts.clase;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import ro.ase.cts.clase.readers.Reader;
import java.io.FileNotFoundException;
import java.util.List;

public class UniversalReader {

	public static List<Aplicant> readAplicants(Reader reader) throws FileNotFoundException{
		
		return reader.readAplicants();
	}
	

}
