package br.inatel.t141.dm110.cliente.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.t141.dm110.cliente.entities.Client;

@Stateless
public class ClientDAO {

	@PersistenceContext(unitName = "inventory")
	private EntityManager em;

	public List<Client> listAll() {
		return em.createQuery("from Client c", Client.class).getResultList();
	}

	public void insert(Client client) {
		em.persist(client);
	}

}
