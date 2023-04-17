package ProjetoStatic;

// quando faço metodos estaticos, nao precisa de instancia de classe, não precisa escrever "new", instancia unica, independente de new

public class ClasseQueUsaAsContinhas {

	public static void main(String[] args) {
		int s = Utilitario.soma(5, 8);
		int p = Utilitario.potencia(2, 5);

		System.out.println("Resultado da soma =" + s);
		System.out.println("Resultado da potencia = " + p);
		System.out.println("Valor do PI = " + Utilitario.PI);
	}
}
