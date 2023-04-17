package core;

//SuperClasse, Classe Mae
public class Estudante extends Pessoa {
	private int numeroMatricula;
	private String curso;
	
	

	public Estudante(String nome, String email, String telefone, int numeroMatricula, String curso) {
		super(nome, email, telefone);
		this.numeroMatricula = numeroMatricula;
		this.curso = curso;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	// Sobreescrita do metodo da classe mae
	@Override
	public String toString() {
		return "Estudante [numeroMAtricula=" + this.numeroMatricula + ", curso=" + this.curso + ", Nome =" + super.nome
				+ ",  Email =" + super.email + ", Telefne =" + super.telefone + "]";
	}

	
}
