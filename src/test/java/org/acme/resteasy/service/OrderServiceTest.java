package org.acme.resteasy.service;

import javax.inject.Inject;

import org.acme.resteasy.model.Client;
import org.acme.resteasy.model.Order;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import io.quarkus.panache.mock.PanacheMock;
import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class OrderServiceTest {

	@Inject
	private OrderService orderService;

	Long clientId = 1L;

	Client client = new Client();

	Order order = new Order();

	OrderServiceTest() {
		PanacheMock.mock(Client.class);
		client.setId(clientId);
		client.setName("Name");

		order.setClientId(clientId);

		MockableBean1 mock = Mockito.mock(OrderService.class);

	}

	@Test
	public void tryToCreateOrderWithNoUser_shouldReturnError() throws Exception {
		orderService.post(null, order);
	}
}
