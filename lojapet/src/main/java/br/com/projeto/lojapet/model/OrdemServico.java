package br.com.projeto.lojapet.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "ordem_sevico")
public class OrdemServico {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "valor", nullable = false)
	private Double valor;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "hora_entrada")
	private Date horaEntrada = new java.sql.Date(System.currentTimeMillis()) ;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "hora_tirada")
	private Date horaTirada = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

}
