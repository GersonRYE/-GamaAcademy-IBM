package ComparadorDeStrings;

public class Comaparador {

	public static void main(String[] args) {

		String s1, s2;

		// A condição abaixo dara "iguais" pois ocupam o mesmo espaço de memoria, assim
		// comparando o valor corretamente
		s1 = "Oi tudo bem?";
		s2 = "Oi tudo bem?";

		// Objetos
		// A condição abaixo dara "diferente" pois ocupam diferentes espaços da memoria,
		// assim a comparação da diferente - gerenciamento de memoria
//		s1 = new String("Oi tudo bem?");
//		s2 = new String("Oi tudo bem?");
		
		// eu nao estou comparando conteudos...eu estou comparando se s1 e s2 apontam
		// para a mesma região da memória
//		if (s1 == s2) { 
//			System.out.println("iguais");
//		} else {
//			System.out.println("diferentes");
//		}

		if (s1 == s2) {
			System.out.println("mesmo endereço de memoria");
		} else {
			System.out.println("diferentes endereço de memoria");
		}
		
		
		
		// Como comparar conteudo -  comparar objetos
		if(s1.equals(s2)) {
			System.out.println("Conteudo iguais");
		}else {
			System.out.println("Conteudos diferentes");
		}
		
		// strings nao sao alteraveis, elas sao imutaveis
		// quando altera um conteudo de um tipo string automaticamente o java cria uma nova area (espaço de memoria) pra ela
		s2 = "Agora vai!!!";
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
