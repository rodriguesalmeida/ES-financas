package edu.unidep.financas.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.unidep.financas.bean.AbstractBean;
import edu.unidep.financas.bean.CategoriaBean;
import edu.unidep.financas.bean.ContaBean;
import edu.unidep.financas.model.Categoria;
import edu.unidep.financas.model.Pessoa;

@Path("categoria")
public class CategoriaRest extends AbstractRest<Categoria>{

	@EJB
	private CategoriaBean categoriaBean;
	
	@Override
	public AbstractBean<Categoria> getBean() {
		return categoriaBean;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		try {
			List<Categoria> lista = categoriaBean.getTodos();
			return Response.ok(lista).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
}
