package ExerciciosJava;
import java.util.Scanner;

public class TabuadaV1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c, mult;

		c = 1;
		while (c <= 10) {
			mult = n * c;
			System.out.printf("%d x %d = %d \n", n, c, mult);
			c++;
		}
		sc.close();
	}

}
