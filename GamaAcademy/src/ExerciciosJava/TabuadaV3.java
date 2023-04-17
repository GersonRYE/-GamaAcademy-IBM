package ExerciciosJava;
import java.util.Scanner;

public class TabuadaV3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), mult;

		for (int i = 1; i <= 10; i++) {
			mult = n * i;
			System.out.printf("%d x %d = %d \n", n, i, mult);
		}
		sc.close();
	}

}
