package edu.unidep.financas.bean;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.Query;

import edu.unidep.financas.model.Categoria;

@LocalBean
@Stateless
public class CategoriaBean extends AbstractBean<Categoria>{

	@Override
	public Class<Categoria> getClasse() {
		return Categoria.class;
	}
	
	@Override
	public Categoria salvar(Categoria obj) throws Exception {
		if (obj.getNome().length() < 6) {
			throw new IllegalArgumentException("O nome deve ter no minomo 6 letras");
		}
		return super.salvar(obj);
	}
	
	public List<Categoria> getTodos()throws Exception {
		String sql = "Select c From Categoria c ";
		Query query = entity.createQuery(sql);
		return query.getResultList();
	}
}
