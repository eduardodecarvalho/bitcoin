package org.acme.resteasy.resources;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.resteasy.model.Bitcoin;
import org.acme.resteasy.service.BitcoinService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/bitcoins")
public class BitcoinResource {

	@Inject
	@RestClient
	private BitcoinService bitcoinService;

    @GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Bitcoin> getAll() {
		return bitcoinService.getAll();
	}
}