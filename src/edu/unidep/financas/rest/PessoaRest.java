package edu.unidep.financas.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import edu.unidep.financas.bean.AbstractBean;
import edu.unidep.financas.bean.PessoaBean;
import edu.unidep.financas.model.Pessoa;

@Path("pessoa")
public class PessoaRest extends AbstractRest<Pessoa>{

	@EJB
	private PessoaBean pessoaBen;
	
	@Override
	public AbstractBean<Pessoa> getBean() {
		return pessoaBen;
	}
}
