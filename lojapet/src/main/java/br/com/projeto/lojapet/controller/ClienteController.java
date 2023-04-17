package br.com.projeto.lojapet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.lojapet.model.Cliente;
import br.com.projeto.lojapet.services.IClienteService;

@RestController
public class ClienteController {

	@Autowired
	private IClienteService service;

	@GetMapping("/clientes")
	public List<Cliente> listaCliente() {
		return service.todosCliente();
	}

	@PostMapping("/clientes/cadastro")
	public ResponseEntity<Cliente> cadastrarCliente(@RequestBody Cliente cliente) {
		System.out.println("Cliente: " + cliente.getNome() + " : " + cliente.getTelefone());
		Cliente novo = service.cadastrarCliente(cliente);
		if (novo != null) {
			return ResponseEntity.ok(novo);
		}

		return ResponseEntity.badRequest().build();

	}

}
