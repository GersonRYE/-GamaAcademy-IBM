package ExerciciosJava;
import java.util.Scanner;

public class TabuadaV2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c, mult;

		c = 1;
		do {
			mult = n * c;
			System.out.printf("%d x %d = %d \n", n, c, mult);
			c++;
		} while (c <= 10);
		sc.close();
	}
}
