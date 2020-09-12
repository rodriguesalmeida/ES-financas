package edu.unidep.financas.bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import edu.unidep.financas.model.Conta;
import edu.unidep.financas.model.Pessoa;

@LocalBean
@Stateless
public class ContaBean extends AbstractBean<Conta>{

	@Override
	public Class<Conta> getClasse() {
		return Conta.class;
	}
	
	public List<Conta> buscarTodos()throws Exception {
		String sql = "Select c From Conta c ";
		Query query = entity.createQuery(sql);
		return query.getResultList();
	}
}
