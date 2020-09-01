package edu.unidep.financas.rest;

import javax.ejb.EJB;
import javax.ws.rs.Path;

import edu.unidep.financas.bean.AbstractBean;
import edu.unidep.financas.bean.CategoriaBean;
import edu.unidep.financas.model.Categoria;

@Path("categoria")
public class CategoriaRest extends AbstractRest<Categoria>{

	@EJB
	private CategoriaBean categoriaBean;
	
	@Override
	public AbstractBean<Categoria> getBean() {
		return categoriaBean;
	}
}
