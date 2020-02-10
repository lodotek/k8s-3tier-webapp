package webapp.tier.resource;

import static io.restassured.RestAssured.*;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class PostgresResourceTest {

	@Test
	void testInsertError() {
		given()
				.when()
				.contentType("application/json")
				.post("/quarkus/postgres/insert")
				.then()
				.statusCode(500);
	}

	@Test
	void testSelectError() {
		given()
				.when()
				.get("/quarkus/postgres/select")
				.then()
				.statusCode(500);
	}

	@Test
	void testDeleteError() {
		given()
				.when()
				.contentType("application/json")
				.post("/quarkus/postgres/delete")
				.then()
				.statusCode(500);
	}

}
