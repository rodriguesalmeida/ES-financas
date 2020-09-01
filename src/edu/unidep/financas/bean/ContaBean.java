package edu.unidep.financas.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import edu.unidep.financas.model.Conta;

@LocalBean
@Stateless
public class ContaBean extends AbstractBean<Conta>{

	@Override
	public Class<Conta> getClasse() {
		return Conta.class;
	}
}
