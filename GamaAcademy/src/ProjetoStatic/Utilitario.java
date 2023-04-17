package ProjetoStatic;

// nao existe ha necessidade de ter na memoria uma estrutura que armazena valores pra poder ter acesso aquele metodo, simplesmente utiliza o "static", asim criando suas proprias biliotecas utilitarias 
// com o estatico crio meus metodos utilitarios sem precisar criar uma classe e armezenado na memoria, com o static cria minha bibliotecas utilitarias
public class Utilitario {

	// metodo estatico, nao se armazena estado na memoria, igual no objeto, o
	// estatico simplesmente cria uma função, ira fazer um calculo e depois retornar
//	 um valor, mostrar uma coisa na tela e acabou, ele nao armazena na memoria, ela é uma varivel global unica em toda a execução da aplicação, 
//	ele mantera o mesmo valor em todas as classes que for chamada, clara podendo ser alterado caso aconteça durante a execução

	public static double PI = 3.14;

	// Quando tem "final" o valor nao pode ser alterado, tornando-se constante
//	public static final double PI = 3.14;

	public static int soma(int x, int y) {
		return x + y;
	}

	public static int potencia(int x, int y) {
		if (y == 0) {
			return 1;
		} else {
			int pot = 1;
			for (int i = 1; i <= y; i++) {
				pot = pot * x;
			}
			return pot;
		}
	}
}
