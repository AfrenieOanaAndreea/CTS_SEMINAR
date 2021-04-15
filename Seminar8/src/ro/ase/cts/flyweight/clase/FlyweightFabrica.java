package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFabrica {

	private Map<String, FlyweightAbstract> clienti;

	public FlyweightFabrica() {
		clienti = new HashMap<>();
	}

	public FlyweightAbstract getClient(String numarTelefon) {
		Client client = (Client) clienti.get(numarTelefon);
		if (client == null) {
			client = new Client("Gigel", numarTelefon, "gigel@gmail.com");
			clienti.put(numarTelefon, client);
		}
		return client;
	}

}
