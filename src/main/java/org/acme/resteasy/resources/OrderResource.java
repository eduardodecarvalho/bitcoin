package org.acme.resteasy.resources;

import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.acme.resteasy.model.Client;
import org.acme.resteasy.model.Order;
import org.acme.resteasy.service.OrderService;

@Path("/orders")
public class OrderResource {

	@Inject
	private OrderService orderService;

	@POST
	@RolesAllowed(value = Client.USER)
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void post(@Context SecurityContext securityContext, Order order) throws Exception {
		orderService.post(securityContext, order);
	}

	@GET
	@RolesAllowed(value = { Client.ADMIN, Client.USER })
	@Produces(MediaType.APPLICATION_JSON)
	public List<Order> listAll() {
		return orderService.listAll();
	}
}