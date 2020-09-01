package edu.unidep.financas.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import edu.unidep.financas.bean.AbstractBean;
import edu.unidep.financas.bean.ContaBean;
import edu.unidep.financas.model.Conta;

@Path("conta")
public class ContaRest extends AbstractRest<Conta>{

	@EJB
	private ContaBean contaBean;
	
	@Override
	public AbstractBean<Conta> getBean() {
		return contaBean;
	}
}
