package edu.unidep.financas.bean;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

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
}
