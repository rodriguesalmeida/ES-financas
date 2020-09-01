package edu.unidep.financas.rest;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class FilterOrigin implements ContainerResponseFilter {

	@Override
	public void filter(ContainerRequestContext req, ContainerResponseContext resp) throws IOException {
		resp.getHeaders().putSingle("Access-Control-Allow-Origin", "*");
		resp.getHeaders().putSingle("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS, TRACE, HEAD");
		resp.getHeaders().putSingle("Access-Control-Allow-Headers", "Content-Type, Authorization, Accept");
	}

}
