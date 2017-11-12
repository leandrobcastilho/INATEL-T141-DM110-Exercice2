package br.inatel.t141.dm110.cliente.beans;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.inatel.t141.dm110.cliente.dao.ClientDAO;
import br.inatel.t141.dm110.cliente.entities.Client;
import br.inatel.t141.dm110.cliente.interfaces.ClientLocal;
import br.inatel.t141.dm110.cliente.interfaces.ClientRemote;

@Stateless
@Remote(ClientRemote.class)
@Local(ClientLocal.class)
public class ClientBean implements ClientRemote, ClientLocal {

	@EJB
	private ClientDAO clientDAO;

	@Override
	public List<String> listClientNames() {
		return clientDAO.listAll().stream().map(Client::getName).collect(Collectors.toList());
	}
	
	@Override
	public void createNewClient(String name, String email) {
		Client client = new Client();
		client.setName(name);
		client.setEmail(email);
		clientDAO.insert(client);
		
	}

}
