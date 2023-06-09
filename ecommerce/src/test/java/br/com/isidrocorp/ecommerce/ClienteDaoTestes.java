package br.com.isidrocorp.ecommerce;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.isidrocorp.ecommerce.dao.ClienteDAO;
import br.com.isidrocorp.ecommerce.model.Cliente;

@SpringBootTest
public class ClienteDaoTestes {
	

		@Autowired
		private ClienteDAO clientesDao;

		@BeforeEach
	    public void limpaBase() {
	        clientesDao.deleteAll();
	    }

		@Test
		void validarFindDoDaoDeCliente() {
			assertEquals(0, clientesDao.count());
		}

		@Test
		void validarSeEmailCadastradoNaoExiste() {
			var clienteNaoExiste = clientesDao.emailExiste("dd@teste.com");
			assertEquals(false, clienteNaoExiste);
		}

		@Test
		void validarSeEmailCadastradoExiste() {
			var cliente = new Cliente();
			cliente.setEmail("teste@teste.com");
			clientesDao.save(cliente);
			
			var clienteExiste = clientesDao.emailExiste("teste@teste.com");
			assertEquals(true, clienteExiste);
		}
}
