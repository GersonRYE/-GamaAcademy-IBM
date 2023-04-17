package br.com.projeto.lojapet.services;

import java.util.ArrayList;

import br.com.projeto.lojapet.model.OrdemServico;

public interface IOrdemServicoService {

	public ArrayList<OrdemServico> mostrarOrdem();
	public OrdemServico cadastrarServico(OrdemServico ordem);
}
