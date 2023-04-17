package ExerciciosJava;
import java.util.Scanner;

public class ProcessaTabuada {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n1, mult;

		System.out.println("Digite um valor: ");
		n1 = sc.nextInt();

		System.out.printf("Tabuada do %d", n1);
		System.out.println();
		for (int i = 1; i <= 10; i++) {
			mult = n1 * i;
			System.out.println(n1 + " x " + i + " = " + mult);
		}
		sc.close();
	}

}
