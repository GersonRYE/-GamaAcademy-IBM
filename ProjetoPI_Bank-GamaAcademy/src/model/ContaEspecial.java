package model;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(String nomeTitular, String cpf, int numero, double saldo, double limite) {
		super(nomeTitular, cpf, numero, saldo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	// pegando o metodo da classe mae e passando para a filha modificando sua estrutura de logica
	@Override
	public boolean debitar(double valor) {
		if(super.saldo + this.limite >= valor) {
			super.saldo -= valor;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		// super.toString esta referenciando da classe mae a impressao do objeto + a impressao da classe filha 
		return super.toString() + "Limite R$ " + this.limite;
	}
}
