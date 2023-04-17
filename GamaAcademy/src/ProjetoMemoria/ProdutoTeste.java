package ProjetoMemoria;

public class ProdutoTeste {

	public static void main(String[] args) {

		Produto p1, p2, p3;
		
		p1 = new Produto(123, "Computador", 1000.0);
		
		System.out.println("P1 = "+ p1.toString());
		
		p2 = p1;
		
		p2.setPreco(1500.00);
		System.out.println("P1 = " + p1.toString());
		System.out.println("P2 = " + p2.toString());
	}

}
