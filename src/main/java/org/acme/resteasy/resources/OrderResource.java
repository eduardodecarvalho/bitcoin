package org.acme.resteasy.resources;

import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.SecurityContext;

import org.acme.resteasy.model.Order;
import org.acme.resteasy.service.OrderService;

@Path("/orders")
public class OrderResource {

	@Inject
	private OrderService orderService;

	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void post(@Context SecurityContext securityContext, Order order) {
		orderService.post(securityContext, order);
	}

}