package edu.unidep.financas.bean;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import edu.unidep.financas.model.Categoria;
import edu.unidep.financas.model.Conta;
import edu.unidep.financas.model.Pessoa;

@LocalBean
@Stateless
public class ContaBean extends AbstractBean<Conta>{

	@EJB
	private PessoaBean pessoaBean;
	@EJB
	private CategoriaBean categoriaBean;
	
	@Override
	public Class<Conta> getClasse() {
		return Conta.class;
	}
	@Override
	public Conta salvar(Conta obj) throws Exception {
		obj = super.salvar(obj);
		Pessoa pessoa = pessoaBean.buscarPorId(obj.getIdPessoa());
		obj.setPessoa(pessoa);
		Categoria cat = categoriaBean.buscarPorId(obj.getIdCategoria());
		obj.setCategoria(cat);
		return obj;
	}
	
	public List<Conta> buscarTodos()throws Exception {
		String sql = "Select c From Conta c ";
		Query query = entity.createQuery(sql);
		return query.getResultList();
	}
}
