package edu.unidep.financas.rest;

import java.util.List;

import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.unidep.financas.bean.AbstractBean;
import edu.unidep.financas.bean.PessoaBean;
import edu.unidep.financas.model.Pessoa;

@Path("pessoa")
public class PessoaRest extends AbstractRest<Pessoa>{

	@EJB
	private PessoaBean pessoaBean;
	
	@Override
	public AbstractBean<Pessoa> getBean() {
		return pessoaBean;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarTodos() {
		try {
			List<Pessoa> pessoas = pessoaBean.buscarTodos();
			return Response.ok(pessoas).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
}
