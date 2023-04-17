package ExerciciosJava;

public class ControleRegistros {

	public static void main(String[] args) {

		String[] carros = {"Uno", "HB20", "Gol", "Ka"};
		System.out.println(carros[0]);
		System.out.println(carros[0]);
		System.out.println(carros[0]);
		System.out.println(carros[0]);
		
		for(int i = 0; i < carros.length; i++) {
			System.out.println((i+1)+ " - " + carros[i]);
		}
		
	}

}
