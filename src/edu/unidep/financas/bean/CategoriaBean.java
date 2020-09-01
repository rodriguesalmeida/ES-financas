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
}
