package br.com.projeto.lojapet.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.lojapet.dao.AnimalDAO;
import br.com.projeto.lojapet.model.Animal;

@Service
public class AnimalServiceImpl implements IAnimalService{

	@Autowired
	private AnimalDAO dao;
	
	@Override
	public ArrayList<Animal> mostrarAnimais() {
		// TODO Auto-generated method stub
		return (ArrayList<Animal>) dao.findAll();
	}

	@Override
	public Animal cadastarAnimal(Animal animal) {
		// TODO Auto-generated method stub
		return dao.save(animal);
	}

}
