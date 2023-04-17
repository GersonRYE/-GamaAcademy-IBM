package br.com.projeto.lojapet.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projeto.lojapet.dao.OrdemServicoDAO;
import br.com.projeto.lojapet.model.OrdemServico;

@Service
public class OrdemServicoServiceImpl implements IOrdemServicoService{

	@Autowired
	OrdemServicoDAO dao;
	
	@Override
	public ArrayList<OrdemServico> mostrarOrdem() {
		// TODO Auto-generated method stub
		return (ArrayList<OrdemServico>) dao.findAll();
	}

	@Override
	public OrdemServico cadastrarServico(OrdemServico ordem) {
		// TODO Auto-generated method stub
		return dao.save(ordem);
	}

}
