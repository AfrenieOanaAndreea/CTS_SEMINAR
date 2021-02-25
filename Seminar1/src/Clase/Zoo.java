package Clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private Zookeeper zookeeper;
	private List<Animal> animals;

	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}

	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("Oana");
		this.animals = new ArrayList<Animal>();
		
	}
	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void feedAllAnimals() {
		for (Animal animal : this.animals) {
			this.zookeeper.feed(animal);
		}
	}
}
