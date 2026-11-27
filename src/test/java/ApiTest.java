import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiTest {

    @Test
    public void getTest() {
        given()
            .baseUri("https://jsonplaceholder.typicode.com")
        .when()
            .get("/posts/1")
        .then()
            .statusCode(200)
            .body("id", equalTo(1))
            .body("title", notNullValue())
            .time(lessThan(5000L));
    }

    @Test
    public void postTest() {
        given()
            .baseUri("https://jsonplaceholder.typicode.com")
            .contentType("application/json")
            .body("""
                {
                    "title": "Yazilim Testi",
                    "body": "API test odevi",
                    "userId": 1
                }
                """)
        .when()
            .post("/posts")
        .then()
            .statusCode(201)
            .body("title", equalTo("Yazilim Testi"))
            .body("userId", equalTo(1))
            .body("id", notNullValue())
            .time(lessThan(5000L));
    }
}