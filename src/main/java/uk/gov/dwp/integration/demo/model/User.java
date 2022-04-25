package uk.gov.dwp.integration.demo.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;

@Data
public class User implements Serializable {
  private static final long serialVersionUID = 1L;

  private long id;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("email")
  private String emailAddress;

  @JsonProperty("ip_address")
  private String ipAddress;

  private double latitude;
  private double longitude;
}
