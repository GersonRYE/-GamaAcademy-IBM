package br.com.projeto.lojapet.services;

import java.util.ArrayList;

import br.com.projeto.lojapet.model.Cliente;

public interface IClienteService {

	public ArrayList<Cliente> todosCliente();
	public Cliente cadastrarCliente (Cliente cliente);
}
