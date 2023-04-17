package ExerciciosJava;
import java.util.Scanner;

public class ProcessaLocacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String[] carros = { "carro1", "carro2", "carro3" };
		boolean repita = true;

		while (repita) {
			System.out.println("Escolha uma das opções");
			System.out.println("1 - Mostrar todos os carros ");
			System.out.println("2 - Numero do carro");
			System.out.println("3 - Sair");
			n = sc.nextInt();

			switch (n) {
			case 1:
				for (int i = 0; i < carros.length; i++) {
					System.out.println((i + 1) + " - " + carros[i]);
				}
				break;
			case 2:
				int c;
				boolean existe = true;
				while (existe) {
					System.out.println("Qual o numero do carro entre 1 a 3");
					c = sc.nextInt();
					if (c <= carros.length && c > 0) {
						System.out.println(carros[c - 1]);
						existe = false;
					} else {
						System.out.println("Nao existe registrado ou valor invalido");
					}
				}
				break;
			case 3:
				System.out.println("Saindo");
				break;
			default:
				System.out.println("Opção não existe");
				break;
			}
			if (n == 3) {
				repita = false;
			}
			System.out.println();

		}
		sc.close();
	}

}
