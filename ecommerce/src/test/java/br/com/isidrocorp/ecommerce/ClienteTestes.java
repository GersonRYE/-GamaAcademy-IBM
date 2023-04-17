package br.com.isidrocorp.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.isidrocorp.ecommerce.model.Cliente;

@SpringBootTest
class ClienteTestes {

	@Test
	void validarPropriedadesCliente() {
		var cliente = new Cliente();
		
		List<String> propriedadesObjeto = new ArrayList<>();
		propriedadesObjeto.add("Nome");
		propriedadesObjeto.add("Email");
		propriedadesObjeto.add("Senha");
		
//		var propriedadesObjeto = new ArrayList<>();
		
//		final Field[] propriedade = cliente.getClass().getDeclaredFields();
//		
//		for(Field field :  propriedade) {
//			String nomePropriedade = field.getName();
//			boolean verdade = propriedadesObjeto.contains(propriedade);
//			assertEquals(true, verdade);
//		}
		
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
