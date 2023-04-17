package br.com.projeto.lojapet.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.lojapet.model.Animal;

public interface AnimalDAO extends CrudRepository<Animal, Integer> {

}
