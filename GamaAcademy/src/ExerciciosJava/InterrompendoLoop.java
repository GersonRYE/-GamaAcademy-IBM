package ExerciciosJava;

public class InterrompendoLoop {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			if (i == 3) {
//				break;
//			}
//			System.out.printf("i = %d \n", i);
//		}
//		System.out.println("Fim programa");
		/*
		 * for (int i = 1; i <= 10; i++) { if (i == 3) {
		 * 
		 * continue; } System.out.printf("i = %d \n", i); }
		 * System.out.println("Fim programa");
		 */

		int i = 1;
		while (i <= 10) {
			if (i == 5) {
				//Ignora a condição
				continue;
			}
			System.out.printf("i = %d \n", i);
			i++;
		}
		System.out.println("Fim programa");
		
//		int i = 1;
//		while (true) {
//			if (i == 5) {
//				break;
//			}
//			System.out.printf("i = %d \n", i);
//			i++;
//		}
//		System.out.println("Fim programa");
	}
}
