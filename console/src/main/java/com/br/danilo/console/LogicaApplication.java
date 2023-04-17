package com.br.danilo.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String nomeProduto;
		ArrayList<String> produtos = new ArrayList<String>();
		ArrayList<String> relatorios = new ArrayList<String>();
		int opcoes;
		System.out.println("Bem vindo ao app java console");
		SpringApplication.run(LogicaApplication.class, args);

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite seu nome abaixo:");
		String nome = reader.readLine();

		System.out.println("Ola usuario: " + nome);

		do {
			System.out.println("=====SUA_EMPRESA=====");
			System.out.println("1 - Cadastrar Produto");
			System.out.println("2 - Vender Produto");
			System.out.println("3 - Relatorio");
			System.out.println("4 - Sair");
			opcoes = sc.nextInt();

			switch (opcoes) {
			case 1:
				System.out.println("Digite o nome do produto");
				nomeProduto = sc.next().toUpperCase();
				produtos.add(nomeProduto);
				System.out.println("Adicionado");
				break;
			case 2:
				System.out.println("Qual produto quer vender?");
				nomeProduto = sc.next().toUpperCase();
				for (int i = 0; i < produtos.size(); i++) {
					if (produtos.get(i).equals(nomeProduto)) {
						produtos.remove(i);
						relatorios.add(nomeProduto);
						System.out.println("Produto Vendido");
					}
				}
				break;
			case 3:
				System.out.println("Relatorio de Venda:");
				int pedido = 0;
				for (String rel : relatorios) {	
				System.out.println("Pedido nº" + (pedido+1) +" , Produto Vendido: "+ rel + ", cliente: " + nome);
				pedido++;
				}
				relatorios.clear();
				
				break;
			case 4:
				System.out.println("Saindo");
				break;
			default:
				System.out.println("Opção invalida");
				break;
			}
		} while (opcoes != 4);
	}

}
