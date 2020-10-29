package org.acme.resteasy;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class BitcoinResourceTest {


    @Test
	public void getAll() {
        given()
				.when().get("/bitcoins")
          .then()
             .statusCode(200)
				.body(is(
						"[{\"data\":\"2020-09-15\",\"id\":1,\"preco\":58.55,\"tipo\":\"VENDA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":2,\"preco\":58.55,\"tipo\":\"VENDA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":3,\"preco\":58.0,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":4,\"preco\":58.99,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":5,\"preco\":58.0,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":6,\"preco\":58.0,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":7,\"preco\":58.0,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":8,\"preco\":58.0,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":9,\"preco\":58.0,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":10,\"preco\":58.0,\"tipo\":\"VENDA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":11,\"preco\":58.99,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":12,\"preco\":58.99,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":13,\"preco\":58.99,\"tipo\":\"COMPRA\"},"
								+ "{\"data\":\"2020-09-15\",\"id\":14,\"preco\":58.01,\"tipo\":\"VENDA\"},"
								+ "{\"data\":\"2020-10-15\",\"id\":15,\"preco\":78.1,\"tipo\":\"COMPRA\"}]"));
    }

}