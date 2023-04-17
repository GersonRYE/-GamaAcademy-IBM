package CrudArrayList;

import java.util.ArrayList;

public class OperacaoBancoDados {
	public static void main(String[] args) {

		// Criando um procedimento de inserção de registros com arraylist
		ArrayList<String> nomeClientes = new ArrayList<String>();
		nomeClientes.add("Petrolina");
		nomeClientes.add("Givanildo");
		nomeClientes.add("Adroaldo");
		nomeClientes.add("Gerson");
		System.out.println(nomeClientes);
		System.out.println(nomeClientes.get(0));

		ArrayList<String> marcas = new ArrayList<String>();
		marcas.add("Fiat");
		marcas.add("Chevrolet");
		marcas.add("Ford");
		marcas.add("BMW");
		// modificando um valor especifico num certa posição
		marcas.set(0, "Volkswagen");
		marcas.remove(0);

		System.out.println(marcas);

		// TUPLAS OU REGISTROS quantidade
		System.out.println(marcas.size());

		for (int i = 0; i < marcas.size(); i++) {
			System.out.println((i+1)+"º"+ marcas.get(i));
		}
		
		int i = 0;
		for(String contador: marcas) {
			i =  i+1;
			System.out.println(i+"º "+contador);
			
		}
		
		
	}
}
