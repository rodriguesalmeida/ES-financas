package edu.unidep.financas.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.unidep.financas.bean.AbstractBean;
import edu.unidep.financas.bean.ContaBean;
import edu.unidep.financas.model.Categoria;
import edu.unidep.financas.model.Conta;

@Path("conta")
public class ContaRest extends AbstractRest<Conta>{

	@EJB
	private ContaBean contaBean;
	
	@Override
	public AbstractBean<Conta> getBean() {
		return contaBean;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		try {
			List<Conta> lista = contaBean.buscarTodos();
			return Response.ok(lista).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
}
