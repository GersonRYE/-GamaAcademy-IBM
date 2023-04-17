package ExerciciosJava;
import java.util.Scanner;

public class TesteSwitch {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int valor;

		System.out.println("Digite um valor inteiro");
		valor = sc.nextInt();

		// Aceita valores apenas do tipo inteiro, char, string
		switch (valor) {
		case 1:
			System.out.println("Digitou o valor 1");
			break;
		case 2:
			System.out.println("Digitou o valor 2");
			break;
		case 3:
			System.out.println("Digitou o valor 3");
			break;
		default:
			System.out.println("Digitou outro valor");
		}
		sc.close();

	}
}
