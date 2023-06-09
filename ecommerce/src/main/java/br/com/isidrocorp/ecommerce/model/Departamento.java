package br.com.isidrocorp.ecommerce.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // indica que a classe eh armazenado no banco
@Table(name = "departamento") // torno explicito o nome da table
public class Departamento {
	
	@Column(name = "codigo") // explicito o nome da coluna
	@Id // indico que este atributo corresponde a PK na tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY) // esse cara eh auto-increment
	private Integer codigo;
	
	@Column(name = "nome", length = 50, nullable = false)
	private String nome;
	
	// text definição do banco de dados do tipo text
	@Column(name="descricao", nullable = true, columnDefinition = "TEXT")
	private String descricao;
	
	//opcional
	// mapedby,dentro produto qual o atributo que refere o departamento
	@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
	// na volta pra evitar recursividade, ignore o atributo departamento da entidade produto
	@JsonIgnoreProperties("departamento")
	private List<Produto> listaProdutos;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

}
