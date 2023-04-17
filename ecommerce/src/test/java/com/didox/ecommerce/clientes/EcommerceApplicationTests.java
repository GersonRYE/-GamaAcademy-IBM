package com.didox.ecommerce.clientes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.isidrocorp.ecommerce.model.Cliente;

@SpringBootTest
class ClientesTestes {

	@Test
	void validarPropriedadesCliente() {
		var cliente = new Cliente();
		cliente.setNome("Gerson");
		cliente.setCpf("123.123.123-45");
		cliente.setEmail("gerson@email.com");
		cliente.setRegistroGeral("12.123.546-1");
		cliente.setSenha("123456789");
		
		assertEquals("Gerson", cliente.getNome());
		assertEquals("123.123.123-45", cliente.getCpf());
		assertEquals("gerson@email.com", cliente.getEmail());
		assertEquals("12.123.546-1", cliente.getRegistroGeral());
		assertEquals("123456789", cliente.getSenha());
		
	}
	
	

}
