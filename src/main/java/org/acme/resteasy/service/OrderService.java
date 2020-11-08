package org.acme.resteasy.service;

import java.time.LocalDate;

import javax.inject.Inject;
import javax.ws.rs.core.SecurityContext;

import org.acme.resteasy.model.Client;
import org.acme.resteasy.model.Order;
import org.acme.resteasy.repository.ClientRepository;

public class OrderService {

	@Inject
	private ClientRepository clientRepository;

	public void post(SecurityContext securityContext, Order order) {
		Client client = clientRepository.findById(order.getClientId()).orElseThrow(null);
		if (!client.getUsername().equals(securityContext.getUserPrincipal().getName())) {
			return;
		}
		order.setDate(LocalDate.now());
		order.setStatus("SENT");
		Order.persist(order);

	}

}
