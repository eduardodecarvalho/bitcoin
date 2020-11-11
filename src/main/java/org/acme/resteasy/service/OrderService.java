package org.acme.resteasy.service;

import java.time.LocalDate;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.SecurityContext;

import org.acme.resteasy.model.Client;
import org.acme.resteasy.model.Order;
import org.acme.resteasy.repository.ClientRepository;
import org.acme.resteasy.repository.OrderRepository;

@ApplicationScoped
public class OrderService {

	@Inject
	private ClientRepository clientRepository;

	@Inject
	private OrderRepository orderRepository;

	public void post(SecurityContext securityContext, Order order) throws Exception {
		Client client = clientRepository.findById(order.getClientId()).orElseThrow(null);
		if (!client.getUsername().equals(securityContext.getUserPrincipal().getName())) {
			throw new Exception();
		}
		order.setDate(LocalDate.now());
		order.setStatus("SENT");
		orderRepository.save(order);

	}

	public List<Order> listAll() {
		return orderRepository.findAll();
	}

}
