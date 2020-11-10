package org.acme.resteasy;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@Disabled
@QuarkusTest
public class ClientResourceTest {

	@Test
	public void post_testStatusCode() {
		String client = "{\n" + "    \"name\": \"Chunda\",\n" + "    \"nationalId\": \"1234560\",\n"
				+ "    \"username\": \"chunda_btc\",\n" + "    \"password\": \"123a\"\n" + "}";
		given().with().body(client).when().request("POST", "clients").then().statusCode(201);
	}

}