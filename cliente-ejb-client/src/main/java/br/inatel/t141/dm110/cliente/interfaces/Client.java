package br.inatel.t141.dm110.cliente.interfaces;

import java.util.List;


public interface Client {

	public List<String> listClientNames();
	
	public void createNewClient(String name, String email);
	

}
