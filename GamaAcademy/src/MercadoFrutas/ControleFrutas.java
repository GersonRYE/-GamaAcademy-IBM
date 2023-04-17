package MercadoFrutas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 1 - cadastrar frutas
 * 2 - listar frutas
 * 3 - excluir frutas
 * 5 - modificar fruta
 * 6 - mostrar nome da fruta atual e o nome da modificada
 * 7 - sair
 * */

public class ControleFrutas {
	public static List<String> listaFrutas = new ArrayList<String>();
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String fruta;
		int opcao;

		do {
			System.out.println("-----MERCADO DE FRUTAS------");
			System.out.println("Escolha as opções abaixo: ");
			System.out.println("1 - Cadastrar Fruta");
			System.out.println("2 - Listar Frutas");
			System.out.println("3 - Excluir Frutas");
			System.out.println("4 - Modificar Frutas");
			System.out.println("5 - Sair");
			opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome da fruta:");
				fruta = sc.nextLine().toUpperCase().trim();
				cadastrarFrutas(fruta);
				break;
			case 2:
				listarFrutas();
				break;
			case 3:
				System.out.println("Nome da fruta que deseja excluir: ");
				fruta = sc.nextLine().toUpperCase().trim();
				excluirFrutas(fruta);
				break;
			case 4:
				System.out.println("Qual o nome da fruta que deseja modificar:");
				fruta = sc.nextLine().toUpperCase().trim();
				modificarFruta(fruta);
				break;
			case 5:
				System.out.println("Encerrando o sistema...MERCADO FRUTAS agradece!!!");
				break;
			default:
				System.out.println("Opção inválida!!!");
			}

		} while (opcao != 5);
	}

	public static void cadastrarFrutas(String fruta) {
		listaFrutas.add(fruta);
		System.out.println("Fruta cadastrada!");
	}

	public static void listarFrutas() {
		if (listaFrutas.isEmpty()) {
			System.out.println("Nenhuma fruta cadastrada no banco de dados");
		} else {
			System.out.println("Frutas cadastradas no banco de dados:");
			for (int i = 0; i < listaFrutas.size(); i++) {
				System.out.println((i + 1) + "º - " + listaFrutas.get(i));
			}
		}
	}

	public static void excluirFrutas(String fruta) {
		if (listaFrutas.isEmpty()) {
			System.out.println("Não existe a fruta " + fruta + " cadastrada no banco de dados");
		} else {
			for (int i = 0; i < listaFrutas.size(); i++) {
				if (listaFrutas.get(i).equals(fruta)) {
					listaFrutas.remove(fruta);
					System.out.println("Fruta removida!!!");
				}
			}
		}
	}

	public static void modificarFruta(String fruta) {
		if (listaFrutas.isEmpty()) {
			System.out.println("Não existe a fruta " + fruta + " cadastrada no banco de dados");
		} else {
			for (int i = 0; i < listaFrutas.size(); i++) {
				if (listaFrutas.get(i).equals(fruta)) {
					System.out.println("Qual o nome da nova fruta: ");
					String novaFruta = sc.nextLine().toUpperCase().trim();
					listaFrutas.set(i, novaFruta);
					System.out.println("Fruta anterior = " + fruta);
					System.out.println("Fruta nova = " + listaFrutas.get(i));
					
				}
			}
		}
	}
	
}
