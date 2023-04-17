package ExerciciosJava;

public class AulaOn1 {

	public static void main(String[] args) {
		String nome = "Gerson";
		int idade = 27;
		
		int n1 =10, n2 = 20, resultadoSub = n2 - n1, resultadoAd = n2+n1, resultadoDiv = n2/n1, resultadoMul = n1*n2;
		
		System.out.println("Ola"+nome+". Voce tem "+ idade + " anos.");
		System.out.println("Vamos fazer um super desenvolvimento");
		
		System.out.println("O resultado da subtração entre "+n2 + " - " + n1 + " = " + resultadoSub);
		System.out.println("O resultado da divisão entre " + n2 +" / " + n1 + " = " + resultadoDiv);
		System.out.println("O resultado da multiplicação entre "+ n1 + " x " + n2 + " = " + resultadoMul);
		System.out.println("O resultado da adição entre " + n2 + " + " + n1 + " = " + resultadoAd);
	}

}
