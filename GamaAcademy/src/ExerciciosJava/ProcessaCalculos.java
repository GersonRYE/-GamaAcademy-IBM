package ExerciciosJava;
import java.util.Scanner;

public class ProcessaCalculos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1, v2, soma;
		System.out.println("Entre com o primeiro valor");
		v1 = sc.nextInt();
		System.out.println("Entre com o segundo valor");
		v2 = sc.nextInt();
		soma = v1 + v2;
		System.out.println("O valor total: " + soma);
		sc.close();
	}
}
