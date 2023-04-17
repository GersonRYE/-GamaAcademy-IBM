package br.com.projeto.lojapet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.lojapet.model.Animal;
import br.com.projeto.lojapet.services.IAnimalService;

@RestController
public class AnimalController {

	@Autowired
	private IAnimalService service;
	
	@GetMapping("/animais")
	public List<Animal> listarAnimais(){
		return service.mostrarAnimais();
	}
	
	@PostMapping("/animais/cadastrar")
	public ResponseEntity<Animal> cadastrarAnimal(@RequestBody Animal animal){
		System.out.println("Animal: " + animal.getNome() + " : " + animal.getIdade() + " : " + animal.getPeso() + " : " + animal.getCliente());
		Animal novo = service.cadastarAnimal(animal);
		
		if(novo != null) {
			return ResponseEntity.ok(novo);
		}
		return ResponseEntity.badRequest().build();
		
	}
	
}
