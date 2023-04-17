package ExerciciosJava;
import java.util.Scanner;

public class TesteVetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double valores[] = new double[10];

		System.out.println("Digite valores");
		for (int i = 0; i < 10; i++) {
			valores[i] = sc.nextDouble();
		}

		System.out.println("Vou mostra agora os valores digitados - todos na mesma linha...");
		for (int i = 0; i < valores.length; i++) {
			System.out.printf("%.1f  ", valores[i]);
		}
		
		sc.close();
	}

}
