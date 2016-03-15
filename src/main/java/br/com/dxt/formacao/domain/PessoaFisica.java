package br.com.dxt.formacao.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
//@DiscriminatorValue(value="PF")
public class PessoaFisica extends Pessoa{
	
	@Column(nullable=false)
	public String cpf;
	
	@Temporal(TemporalType.DATE)
	public Date dataNascimento;
	
	
}
