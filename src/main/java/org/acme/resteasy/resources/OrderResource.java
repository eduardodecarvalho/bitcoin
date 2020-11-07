package org.acme.resteasy.resources;

import java.time.LocalDate;

import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.acme.resteasy.model.Order;

@Path("/orders")
public class OrderResource {

	@POST
	@Transactional
	@Consumes(MediaType.APPLICATION_JSON)
	public void post(Order order) {
		order.setDate(LocalDate.now());
		order.setStatus("SENT");
		Order.persist(order);
	}

}