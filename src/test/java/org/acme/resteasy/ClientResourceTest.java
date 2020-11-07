package org.acme.resteasy;

import static io.restassured.RestAssured.with;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class ClientResourceTest {

	@Test
	public void post_testStatusCode() {
		String client = "{\n" + "    \"name\": \"Chunda\",\n" + "    \"nationalId\": \"1234560\",\n"
				+ "    \"username\": \"chunda_btc\",\n" + "    \"password\": \"123a\"\n" + "}";
		with().body(client).when().request("POST", "clients").then().statusCode(201);
	}

}