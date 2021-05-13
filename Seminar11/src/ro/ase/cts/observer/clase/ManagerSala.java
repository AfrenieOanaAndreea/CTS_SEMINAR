package ro.ase.cts.observer.clase;

import java.util.List;

public class ManagerSala extends Subiect{

	public void anuntaMeciFotbal() {
		super.notificaClient("A fost programat un nou meci de fotabal");
	}
	public void anuntaMeciVolei() {
		super.notificaClient("A fost programat un nou meci de volei");
	}
	public void anuntaMeciHabal() {
		super.notificaClient("A fost programat un nou meci de habal");
	}
}
