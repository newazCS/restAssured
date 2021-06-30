package RestAssured;
import org.testng.annotations.Test;

import  static io.restassured.RestAssured.*;
import static io.restassured.matcher.ResponseAwareMatcher.*;
import static org.hamcrest.Matchers.*;
public class RestAPI {
    @Test
    //Using get method
    public void validateGetStatusCode(){
        given()
                .baseUri("http://dummy.restapiexample.com/").
        when()
                .get("api/v1/employees").
        then().
                log().all().
                assertThat().
                statusCode(200);
    }

    // Get details of any employee
    @Test
    public void Employee(){
        given()
                .baseUri("http://dummy.restapiexample.com/").
        when()
                .get("api/v1/employee/1").
        then().
                log().all().
                assertThat().
                statusCode(200);
    }
    // delete employee
    @Test
    public void deleteEmployee(){
        given()
                .baseUri("http://dummy.restapiexample.com/").
        when()
                .delete("api/v1/delete/2").
        then().
                log().all().
                assertThat().
                statusCode(200);
    }

}
