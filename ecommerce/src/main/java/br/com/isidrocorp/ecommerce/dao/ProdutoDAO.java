package br.com.isidrocorp.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.ecommerce.model.Produto;

public interface ProdutoDAO extends CrudRepository<Produto, Integer>{

	// findby = select

	// busca pelo preço em ordem crescente
	public ArrayList<Produto> findByOrderByPreco();
	
	// busca preço em ordem decrescente
	public ArrayList<Produto> findByOrderByPrecoDesc();
	
	// busca pelo nome que contenha(like) conforme a palavra a chave
	public ArrayList<Produto> findByNomeContaining(String palavraChave);
}
