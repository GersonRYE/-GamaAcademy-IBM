package ExerciciosJava;
import java.util.Scanner;

public class CriaPrjetoAutoTabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1;

		System.out.println("Digite um valor:");

		n1 = sc.nextInt();

		for (; n1 <= 10; n1++) {

			System.out.printf("Valor inicio tabuada %d", n1);
			System.out.println();
			for (int j = 1; j <= 10; j++) {
				int mult = n1 * j;
				System.out.println(n1 + " x " + j + " = " + mult);
			}
			System.out.println();
			sc.close();
		}
	}

}
