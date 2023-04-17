package br.com.isidrocorp.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "produto")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private Integer codigo;

	@Column(name = "nome", length = 45, nullable = true)
	private String nome;

	@Column(name = "descricao", columnDefinition = "TEXT")
	private String descricao;

	@Column(name = "preco")
	private Double preco;

	@Column(name = "estoque")
	private Integer estoque;

	@Column(name = "link_foto", length = 255)
	private String linkFoto;

	@ManyToOne
	@JoinColumn(name = "departamento_codigo")
	// na volta pra nao mostrar a lista de produtos do departamento, ignora a listaProdutos da entidade departamento, assim na resposta nao retorna a lista de produtos do departamento
	@JsonIgnoreProperties("listaProdutos")
	private Departamento departamento;

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getEstoque() {
		return estoque;
	}

	public void setEstoque(Integer estoque) {
		this.estoque = estoque;
	}

	public String getLinkFoto() {
		return linkFoto;
	}

	public void setLinkFoto(String linkFoto) {
		this.linkFoto = linkFoto;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
	// quando n houver o codigo do produto, ele preenche com as 3 primeiras letras e complementa com o tamanho da palavra
//    public void setNome(String nome) {
//        this.nome = nome;
//        if(this.codigo == null || this.codigo.isEmpty()){
//            this.codigo = this.nome.substring(0, 3) + "-" + this.nome.length();
//        }
//    }

}
