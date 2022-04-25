package uk.gov.dwp.integration.demo.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import uk.gov.dwp.integration.demo.model.User;

public class ControllerTests {

  @Test
  public void testControllerReturns200WithEmptyListInBody() {

    UsersController controller = new UsersController();
    ResponseEntity<List<User>> actual = controller.getUsersInOrAroundLondon();

    assertEquals(HttpStatus.OK, actual.getStatusCode(),"HTTP status code should be 200");
    assertTrue(actual.hasBody(),"Response should have a body");
    assertEquals(0 , actual.getBody().size(),"Response body should be empty list");
  }

}
