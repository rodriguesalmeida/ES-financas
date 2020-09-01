package edu.unidep.financas.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("rest")
public class ApplicationRest extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> sets = new HashSet<Class<?>>();
		sets.add(CategoriaRest.class);
		sets.add(PessoaRest.class);
		sets.add(ContaRest.class);
		sets.add(FilterOrigin.class);
		return sets;
	}
}
