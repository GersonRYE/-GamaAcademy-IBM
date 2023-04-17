package ProjetoComercioEletronico;

public class Produto {
	private int codigo;
	private String descricao;
	private double preco;
	
	public Produto(int codigo, String descricao, double preco) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// void retorno vazio, nao retorna nada
	public void mostrarAnuncio() {
		System.out.println("-----------PRODUTO EM OFERTA------------");
		System.out.println("Código: " + this.codigo + " - Descrição :" + this.descricao);
		System.out.printf("R$ %.2f\n", this.preco);
	}

	public void modificarPreco(double novoPreco) {
		this.preco = novoPreco;
	}

	public void aplicarDesconto(double percentual) {
		this.preco = this.preco - (this.preco * percentual / 100);
	}

	public double simularDesconto(double percentual) {
		double precoSimulado;
		precoSimulado = this.preco - (this.preco * percentual / 100);
		return precoSimulado;
	}
	
//	PrintStream simularDesconto(double percentual) {
//		double precoSimulado;
//		precoSimulado = this.preco - (this.preco * percentual / 100);
//		return System.out.printf("R$ %.2f\n", precoSimulado);  
//	}
}
