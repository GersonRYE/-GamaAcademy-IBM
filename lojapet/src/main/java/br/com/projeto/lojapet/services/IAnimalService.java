package br.com.projeto.lojapet.services;

import java.util.ArrayList;

import br.com.projeto.lojapet.model.Animal;

public interface IAnimalService {

	public ArrayList<Animal> mostrarAnimais();
	public Animal cadastarAnimal(Animal animal);
}
