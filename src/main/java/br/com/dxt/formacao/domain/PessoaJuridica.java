package br.com.dxt.formacao.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue(value="PJ")
public class PessoaJuridica  extends Pessoa{

	public String cnpj;
	
}
