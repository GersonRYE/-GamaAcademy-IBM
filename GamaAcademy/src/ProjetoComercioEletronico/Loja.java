package ProjetoComercioEletronico;

public class Loja {

	public static void main(String[] args) {

		Produto p, p2, p3; // declarei

		p = new Produto(123,"Computadot", 2500.00); // reservei(aloquei) a memoria
		p2 = new Produto(456, "Mouse", 70.00);
		p3 = new Produto(789, "Teclado", 110.00);

//		p.setCodigo(123);
//		p.setDescricao("Monitor");
//		p.setPreco(2500.00);
//
//		p2.setCodigo(1234);
//		p2.setDescricao("Mouse");
//		p2.setPreco(70.00);
//
//		p3.setCodigo(654);
//		p3.setDescricao("Teclado");
//		p3.setPreco(100.00);

		System.out.println("------PRE�OS ANTES DOS DESCONTOS------");
		p.mostrarAnuncio();
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();

		System.out.println("**************************************");
		p.aplicarDesconto(10);
		p.mostrarAnuncio();
		p2.setPreco(55.00);
		p3.setPreco(99.90);
		p2.mostrarAnuncio();
		p3.mostrarAnuncio();

		// Simulando descontos
		System.out.println("O pre�o do " + p.getDescricao() + " com mais 15% de desconto fica R$" + p.simularDesconto(15));
		p.mostrarAnuncio();

	}

}
