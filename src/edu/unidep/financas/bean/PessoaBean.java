package edu.unidep.financas.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import edu.unidep.financas.model.Pessoa;
import java.util.List;
@LocalBean
@Stateless 
public class PessoaBean extends AbstractBean<Pessoa>{

	@Override
	public Class<Pessoa> getClasse() {
		return Pessoa.class;
	}
	
	public List<Pessoa> buscarTodos()throws Exception {
		String sql = "Select p From Pessoa p ";
		Query query = entity.createQuery(sql);
		return query.getResultList();
	}
}
