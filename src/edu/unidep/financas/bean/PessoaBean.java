package edu.unidep.financas.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import edu.unidep.financas.model.Pessoa;

@LocalBean
@Stateless 
public class PessoaBean extends AbstractBean<Pessoa>{

	@Override
	public Class<Pessoa> getClasse() {
		return Pessoa.class;
	}
	
}
