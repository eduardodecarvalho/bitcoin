package org.acme.resteasy.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.resteasy.model.Bitcoin;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/bitcoins")
@RegisterRestClient(configKey = "bitcoin-api")
public interface BitcoinService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bitcoin> getAll();
}
