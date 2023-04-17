package app;

import model.Conta;
import model.ContaEspecial;

// Polimorfismo - a forma de chamar é a mesma, a maneira no qual o codigo  ira executar, o algoritmo que ira executar, depende da instancia (comportamento)
public class PIBank {
	public static void main(String[] args) {
		
		Conta c1 = new Conta("Gerson", "123.456.789-00", 1234, 100);
		// Declarar o tipo da variavel da conta é importante, mas o que define o comportamento é a instanciação quando damos inicio com o new ...
		Conta c2 = new ContaEspecial("Jose", "987.654.321-00", 9876, 100.00, 100.00);

		// imprimir objeto
		System.out.println(c1);
		System.out.println(c2);
		
		c1.debitar(80.0);
		c2.debitar(180);
		
		System.out.println(c1);
		System.out.println(c2);
	}
}
