package core;

// Sub Classe, implicitamente a classe herda Object podendo ser mencionado ou nao
public class Pessoa extends Object{
	protected String nome;
	protected String email;
	protected String telefone;
	
	public Pessoa(String nome, String email, String telefone) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefne() {
		return telefone;
	}

	public void setTelefne(String telefone) {
		this.telefone = telefone;
	}

	// Sobreescrita do metodo da classe mae
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", email=" + email + ", telefne=" + telefone + "]";
	}

}
