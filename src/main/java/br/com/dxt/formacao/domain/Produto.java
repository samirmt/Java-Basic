package br.com.dxt.formacao.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_produto")
public class Produto {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Long id;
	
	@Column(nullable=false, length=20, name="cod_produto")
	public String codigo;
	
	@Column(nullable=false, length=50, name="nome")
	public String nome;
	
	@Column(nullable=false, length=100, name="descricao")
	public String descricao;
	
	@Column(nullable=false, precision=10, scale=2)
	public Double preco;
	
	@Override
	public String toString() {
		return "Produto \n[id=" + id + ", codigo=" + codigo + ", nome=" + nome
				+ ", descricao=" + descricao + ", preco=" + preco + "]";
	}


	
}
