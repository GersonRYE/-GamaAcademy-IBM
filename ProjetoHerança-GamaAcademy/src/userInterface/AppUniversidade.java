package userInterface;

import core.Estudante;
import core.Pessoa;

public class AppUniversidade {

	public static void main(String[] args) {

		Pessoa p = new Pessoa("Gerson", "gerson@email.com", "99999-9999");
//		p.setNome("Gerson");
//		p.setEmail("gerson@email.com");
//		p.setTelefne("99999-9999");
		
		System.out.println(p.toString());
		
		Estudante e = new Estudante("Jose", "jose@email.com", "99999-9999", 12345, "Computação");
//		e.setNome("Jose");
//		e.setEmail("jose@email.com");
//		e.setTelefne("99999-9999");
//		e.setNumeroMatricula(12345);
//		e.setCurso("Computação");
//		
		System.out.println(e.toString()); 
	}

}
