package org.acme.resteasy.resources;

import java.util.List;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.resteasy.model.Client;

@Path("/clients")
public class ClientResource {

	@POST
	@PermitAll
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void post(Client client) {
		Client.save(client);
	}

	@GET
	@RolesAllowed(value = Client.ADMIN)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Client> listAll() {
		return Client.listAll();
	}
}