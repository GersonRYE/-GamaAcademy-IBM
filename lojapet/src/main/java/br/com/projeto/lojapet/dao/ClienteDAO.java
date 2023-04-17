package br.com.projeto.lojapet.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.projeto.lojapet.model.Cliente;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {

}
