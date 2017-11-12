package br.inatel.t141.dm110.cliente.impl;

import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.t141.dm110.cliente.api.ClientService;
import br.inatel.t141.dm110.cliente.interfaces.ClientRemote;

@RequestScoped
public class ClientServiceImpl implements ClientService {

	@EJB(lookup = "java:app/cliente-ejb-0.1-SNAPSHOT/ClientBean!br.inatel.t141.dm110.cliente.interfaces.ClientRemote")
	private ClientRemote client;

	@Override
	public List<String> listAllProducts() {

		return client.listClientNames();
	}

//	@Override
//	public void createNewClient(String name) {
//		
//		client.createNewClient(name, name+"@email.com");
//	}

	@Override
	public void createNewClient(String name, String email) {
		
		client.createNewClient(name, email);
	}
}
