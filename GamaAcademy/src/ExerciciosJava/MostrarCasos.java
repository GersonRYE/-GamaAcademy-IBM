package ExerciciosJava;
import java.util.Scanner;

public class MostrarCasos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		String[] carros= {"1", "2", "3"};
		
		System.out.println("Escolha abaixo");
		System.out.println("1 - mostrar carro da honda");
		System.out.println("2 - mostrar todos os carros");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.println("Nao temos carros para alocar");
			break;
		case 2:
		System.out.println(carros[0]);
		System.out.println(carros[1]);
		System.out.println(carros[2]);
		default:
			System.out.println("Opção escolhida nao existe");
			
		}
	}

}


// Cria progama locadora
/*
 * Classe  ProcessaLocacao
 *  
 *  4 opcoes
 *  
 *  1 - mostrar todos os carros
 *  2 - abra uma pergunta para escolher o numero do carro, e mostre o carro correspondente
 *  3 - permite fechar o programa
 * */
 