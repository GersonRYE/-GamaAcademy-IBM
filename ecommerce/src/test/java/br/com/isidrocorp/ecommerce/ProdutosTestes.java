package br.com.isidrocorp.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.isidrocorp.ecommerce.model.Produto;

@SpringBootTest
public class ProdutosTestes {

	@Test
	void validarPropriedadesProdutos() {
		var produto = new Produto();
		
		produto.setCodigo(1);
		produto.setNome("Carro");
		produto.setPreco(100.50);
		produto.setEstoque(100);
		
		assertEquals(1, produto.getCodigo());
		assertEquals("Carro", produto.getNome());
		assertEquals(100.50, produto.getPreco());
		assertEquals(100, produto.getEstoque());
	}
	
	@Test
	void aoSetarNomeGeraCodigoCasoCodigoVazio() {
		var produto = new Produto();
		produto.setNome("Carro");
		assertEquals("Pneu", produto.getCodigo());
	}
	
	@Test
	void aoSetarNomeNapGeraCodigoCasoCodigoPreenchido() {
		var produto = new Produto();
		produto.setCodigo(1);
		produto.setNome("Carro");
		assertEquals(1, produto.getCodigo());
	}
}



