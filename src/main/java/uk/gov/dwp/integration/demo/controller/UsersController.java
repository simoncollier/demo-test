package uk.gov.dwp.integration.demo.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import uk.gov.dwp.integration.demo.model.User;

@Component
public class UsersController {

  @Autowired
  public UsersController() {}

  @GetMapping(
      value = {"/v1/londonUsers"},
      produces = {"application/json"}
  )
  public ResponseEntity<List<User>> getUsersInOrAroundLondon() {

    ResponseEntity<List<User>> response = new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    return response;
  }
}
