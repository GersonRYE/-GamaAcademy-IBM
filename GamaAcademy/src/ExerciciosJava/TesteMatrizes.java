package ExerciciosJava;
import java.util.Scanner;

public class TesteMatrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double matriz[][] = new double[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("Digite o valor da matriz [%d] [%d] \n", i, j);
				matriz[i][j] = sc.nextDouble();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%10.0f", matriz[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}

}
