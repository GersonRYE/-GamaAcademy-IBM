
public class AplicacaoQueUsaCalculos {
	public static void main(String[] args) {
		// situação 1 - preciso chamar o metodo do objeto do jeito que ele e

		ObjetoQueCalcula o = new ObjetoQueCalcula();
		o.realizaAlgumCalculo();

		// situação 2 - o modulo x so consegue chamar via metodo calcularValores()
		InterfaceModuloUm i1 = o;
		i1.calcularValores();

		// situação 3 - o modulo y so consegue chamar via metodo efetivarContas()
		InterfaceModuloDois i2 = o;
		i2.efetivarContas();
		
		// as interfaces - defina uma interface, e posso ter varias implementações da mesma interface em diferentes objetos, e depois posso troca-las
		// posso ter uma interface adicionar ao carrinho de compras, totalizar pedido(soma a lista do carrinho), posso ter diferentes implementações
		// e depois removelas dependendo da situação, epoca do ano, interfaces para ecommerce promoção, calculo
	}
}
