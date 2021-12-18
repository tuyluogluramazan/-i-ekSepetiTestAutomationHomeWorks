import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThan;

public class RestAssuredTest {
    String baseUrl="https://virtserver.swaggerhub.com";
    @Test
    public void getTask() {

        when()
                .get(""+baseUrl+"/yann.hippert/ToDoList_API/1.0.0/task/10")
                .then()
                .body("name", equalTo("Homework"))
                .statusCode(200)
                .time(lessThan(2000L));
    }

    @Test
    public void getAdvisors() {
        when()
                .get(""+baseUrl+"/ronele/integ-8/1.0.0/advisors/114879")
                .then().body("last_name", equalTo("Dela Cruz"))
                .statusCode(200)
                .time(lessThan(2000L));
    }

    @Test
    public void getUser() {
        when()
                .get(""+baseUrl+"/caviarman/Stakematic/1.0.0/user/3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .then().body("email", (equalTo("apiteam@swagger.io")))
                .statusCode(200)
                .time(lessThan(2000L));
    }

}









