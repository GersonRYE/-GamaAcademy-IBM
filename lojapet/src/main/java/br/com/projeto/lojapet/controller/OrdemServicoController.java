package br.com.projeto.lojapet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.lojapet.model.OrdemServico;
import br.com.projeto.lojapet.services.IOrdemServicoService;

@RestController
public class OrdemServicoController {

	@Autowired
	private IOrdemServicoService service;
	
	@GetMapping("/ordem")
	public List<OrdemServico> listarOrdemServicos(){
		return service.mostrarOrdem();
	}
	
	@PostMapping("/ordem/cadastrar")
	public ResponseEntity<OrdemServico> cadastrarOrdem(@RequestBody OrdemServico ordem){
		System.out.println("Ordem: " + ordem.getValor() + " : " + ordem.getCliente() + " : " + ordem.getHoraEntrada() + " : " + ordem.getHoraTirada());
		OrdemServico novo = service.cadastrarServico(ordem);
		if(novo != null) {
			return ResponseEntity.ok(novo);
		}
		return ResponseEntity.badRequest().build();
	}
}
