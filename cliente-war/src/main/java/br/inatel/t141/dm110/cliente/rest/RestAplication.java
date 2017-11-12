package br.inatel.t141.dm110.cliente.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import br.inatel.t141.dm110.cliente.impl.ClientServiceImpl;

@ApplicationPath("/api")
public class RestAplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {

		Set<Class<?>> classes = new HashSet<>();
		classes.add(ClientServiceImpl.class);
		return classes;
	}
}
