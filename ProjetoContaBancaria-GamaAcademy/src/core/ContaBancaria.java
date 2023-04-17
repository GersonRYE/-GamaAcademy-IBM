package core;

public class ContaBancaria {

	private int numeroConta;
	private int digitoVerif;
	private String nomeTitular;
	private String cpfTitular;
	private double saldo;

	public ContaBancaria(int numeroConta, int digitoVerif, String nomeTitular, String cpfTitular, double saldo) {
		this.numeroConta = numeroConta;
		this.digitoVerif = digitoVerif;
		this.nomeTitular = nomeTitular;
		this.cpfTitular = cpfTitular;
		this.saldo = saldo;
	}

	// metodos especificos que dizem respeito a conta bancaria
	public void depositar(double valor) {
		this.saldo += valor;
	}

	public String exibirDados() {
		return "Conta: " + this.numeroConta + "-" + this.digitoVerif + ":" + this.nomeTitular + " (" + this.cpfTitular
				+ ") " + String.format("%.2f", this.saldo);
	}

	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoVerif() {
		return digitoVerif;
	}

	public void setDigitoVerif(int digitoVerif) {
		this.digitoVerif = digitoVerif;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public double getSaldo() {
		return saldo;
	}

}
