package br.com.dxt.formacao.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name="tipo_pessoa")
public abstract class Pessoa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public Integer id;
	public String nome;
	public String logradouro;
	public String bairro;
	public String cidade;
	public String uf;
	public String cep;
	public String telefone;
	
	@Override
	public String toString() {
		return "\n\nPessoa [id=" + id + ", nome=" + nome + ", logradouro="
				+ logradouro + ", bairro=" + bairro + ", cidade=" + cidade
				+ ", uf=" + uf + ", cep=" + cep + ", telefone=" + telefone
				+ "]";
	}
	
	
	
	

	
}
