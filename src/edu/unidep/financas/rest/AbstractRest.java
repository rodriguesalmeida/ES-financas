package edu.unidep.financas.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.unidep.financas.bean.AbstractBean;
import edu.unidep.financas.model.BaseEntity;

public abstract class AbstractRest<T extends BaseEntity> {

	public abstract AbstractBean<T> getBean();
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response inserir(T obj) {
		try {
			obj = getBean().inserir(obj);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response alterar(T obj) {
		try {
			obj = getBean().alterar(obj);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
	
	@Path("salvar")
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response salvar(T obj) {
		try {
			obj = getBean().salvar(obj);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response buscarPorId(@PathParam("id")Long id) {
		try {
			T obj = getBean().buscarPorId(id);
			return Response.ok(obj).build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
	
	@DELETE
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response excluir(@PathParam("id")Long id) {
		try {
			getBean().excluir(id);
			return Response.ok().build();
		} catch (Exception e) {
			return Response.serverError().entity(e.getLocalizedMessage()).build();
		}
	}
	
}
