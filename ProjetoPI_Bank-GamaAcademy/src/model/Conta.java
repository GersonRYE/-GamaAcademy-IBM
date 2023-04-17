package model;

public class Conta {
	protected String nomeTitular;
	protected String cpf;
	protected int numero;
	protected double saldo;

	public Conta(String nomeTitular, String cpf, int numero, double saldo) {
		this.nomeTitular = nomeTitular;
		this.cpf = cpf;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Vem da classe object que nao ha necessidade de herdar, pois ele ja é herdado mesmo sem herdar,  e nahora de imprimir, ao inves de imprimir o codigo da memoria estacionada , ele imprime o conteudo cadastrado
	@Override
	public String toString() {
		return "Conta [nomeTitular=" + nomeTitular + ", cpf=" + cpf + ", numero=" + numero + ", saldo=" + saldo + "]";
	}
	
	public void creditar(double valor) {
		this.saldo += valor;
	}
	
	public boolean debitar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	
}
