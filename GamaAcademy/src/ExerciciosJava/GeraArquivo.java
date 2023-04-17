package ExerciciosJava;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class GeraArquivo {
	public static void main(String[] args) throws IOException {
		ArrayList<String> nomeClientes = new ArrayList<String>();
		nomeClientes.add("Petrolina");
		nomeClientes.add("Givanildo");
		nomeClientes.add("Adroaldo");
		nomeClientes.add("Tarciano");
		// pega o arquivo no pc
		FileWriter arquivo = new FileWriter("C:\\Users\\home\\Desktop\\clientes.txt\\");
		// armazena dentro da variavel para gravar
		PrintWriter gravarArquivo = new PrintWriter(arquivo);

		for (String contador : nomeClientes) {
			gravarArquivo.println(contador);
		}

//		gravarArquivo.println(nomeClientes);
//		arquivo.close();
//		System.out.println("");
	}
}
