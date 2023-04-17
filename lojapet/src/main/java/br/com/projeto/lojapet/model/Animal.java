package br.com.projeto.lojapet.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "animal")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	
	@Column(name = "nome", nullable = false, length = 150)
	private String nome;
	
	@Column(name = "idade", nullable = false)
	private Integer idade;
	
	@Column(name = "peso", nullable = false)
	private Double peso;
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

}
