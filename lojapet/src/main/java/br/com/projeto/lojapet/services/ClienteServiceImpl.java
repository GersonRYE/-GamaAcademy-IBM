package br.com.projeto.lojapet.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.lojapet.dao.ClienteDAO;
import br.com.projeto.lojapet.model.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{

	@Autowired
	ClienteDAO dao;
	
	@Override
	public ArrayList<Cliente> todosCliente() {
		// TODO Auto-generated method stub
		return (ArrayList<Cliente>) dao.findAll();
	}

	@Override
	public Cliente cadastrarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return dao.save(cliente);
	}

}
