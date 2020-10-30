package org.acme.resteasy;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class BitcoinResourceTest {


    @Test
	public void getAll_testStatusCode() {
        given()
				.when().get("/bitcoins")
          .then()
				.statusCode(200);
    }

}