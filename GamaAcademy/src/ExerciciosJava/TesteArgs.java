package ExerciciosJava;

public class TesteArgs {

	public static void main(String args[]) {
		System.out.println("Parametros passados pela linha de comando");
		for (int i = 0; i < args.length; i++) {
			System.out.println("Param" + i + " = " + args[i]);
		}
	}

}
