package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuriJucate {
private List<Memento> backupuri=new ArrayList<Memento>();

public void adaugaMemento(Memento memento) {
	backupuri.add(memento);
}
public Memento getMemento(int index) {
	if(index<backupuri.size())
		return backupuri.get(index);
	else
		throw new IndexOutOfBoundsException();
}
}
