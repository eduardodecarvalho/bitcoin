package org.acme.resteasy.resources;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.acme.resteasy.model.Client;

@Path("/clients")
public class ClientResource {

	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void post(Client client) {
		Client.persist(client);
	}

}