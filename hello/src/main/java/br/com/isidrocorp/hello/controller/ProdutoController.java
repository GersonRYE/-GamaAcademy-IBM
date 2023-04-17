package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.hello.model.Produto;

@RestController
public class ProdutoController {

	@GetMapping("/produto")
	public Produto exibirProduto() {
		Produto p = new Produto();
		p.setId(12345);
		p.setNome("Computador top de linha");
		p.setPreco(2500.00);
		p.setQtdEstoque(3);
		return p;
	}
	
	// anotação requestbody permite pegar os valores inseridos e adicionar no corpo da requisição
	@PostMapping("/produto")
	public String inserirProduto(@RequestBody Produto p) {
		System.out.println("Recebido "+p.getId()+" - "+p.getNome() + " - "+ p.getPreco()+ " - "+p.getQtdEstoque());
		return "Produto recebido";
	}
	

}
