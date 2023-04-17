package br.com.isidrocorp.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // a anotação mosta para  o SB que esta classe atende urls
public class HelloController {
	
	@GetMapping("/teste") // na url/teste, ele vai retornar o resultado da execução deste metodo
	public String digaOla() {
		return "Ola mundo!!! Meu primeiro projeto SpringBoot!! Isso eh muito legal";
	}
	
	
}
