package app;

import java.util.Scanner;

import core.ContaBancaria;

public class Banco {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcao;
		double valor;
		ContaBancaria conta = new ContaBancaria(1001, 2, "Isidro", "123.456.798-00", 100.00);

		do {
			System.out.println("ISIBANK - SEU BANCO NA INTERNET!");
			System.out.println("Digite:");
			System.out.println("1 - Deposito");
			System.out.println("2 - Saque");
			System.out.println("3 - Info");
			System.out.println("0 - Sair");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				System.out.println(">>> DEPOSITO -  Digte o valor:");
				valor = sc.nextDouble();
				conta.depositar(valor);
				break;

			case 2:
				System.out.println(">>> SAQUE - Digite o valor:");
				valor = sc.nextDouble();
//				boolean res = conta.sacar(valor);
//				if(res) {
//					System.out.println("   SAQUE EFETUADO!");
//				}else{
//					System.out.println("   SALDO INSUFICIENTE");
//				}

				if (conta.sacar(valor)) {
					System.out.println("   SAQUE EFETUADO!");
				} else {
					System.out.println("   SALDO INSUFICIENTE");
				}
				break;

			case 3:
				System.out.println(">>> INFO: " + conta.exibirDados());
				break;
			case 0:
				System.out.println(">>> OBRIGADO PELA PREFERENCIA - VOLTE SEMPRE!");
				break;

			default:
				System.out.println("*** Opção inválida ***");
			}

		} while (opcao != 0);
		sc.close();
	}

}
