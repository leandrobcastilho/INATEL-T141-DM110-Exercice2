package br.inatel.t141.dm110.cliente.api;

import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public interface ClientService {

	@GET
	@Path("/names")
	@Produces(MediaType.APPLICATION_JSON)
	List<String> listAllProducts();

//	@POST
//	@Path("/create/{name}")
//	@Produces(MediaType.APPLICATION_JSON)
//	void createNewClient(@PathParam("name") String name);
	
	@POST
	@Path("/create")
	@Produces(MediaType.APPLICATION_JSON)
	void createNewClient(@FormParam("name") String name, @FormParam("email") String email);

}
