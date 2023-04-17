package ExerciciosJava;
import java.util.Scanner;

public class TesteIf {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1, n2, me;

		System.out.println("Digite o primeiro valor");
		n1 = sc.nextDouble();

		System.out.println("Digite o segundo valor");
		n2 = sc.nextDouble();

		me = (n1 + n2) / 2;

		System.out.printf("Sua media é %.2f", me);
		System.out.println();

		if (me >= 9.0) {
			System.out.println("Conceito A");
		} else if (me >= 8 && me < 9) {
			System.out.printf("Conceito B");
		} else if (me >= 7 && me < 8) {
			System.out.println("Conceito C");
		} else if (me >= 6 && me < 7) {
			System.out.println("Conceito D");
		} else {
			System.out.println("Conceito F");
		}
		
		sc.close();
	}
}
