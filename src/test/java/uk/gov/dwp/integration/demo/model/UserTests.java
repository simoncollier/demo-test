package uk.gov.dwp.integration.demo.model;

import static org.assertj.core.api.Assertions.assertThat;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.jupiter.api.Test;

public class UserTests {

  @Test
  public void whenSerializingAndDeserializing_ThenObjectIsTheSame() throws IOException {
    User user = new User();
    user.setId(1);
    user.setFirstName("Maurise");
    user.setLastName("Shieldon");
    user.setEmailAddress("mshieldon0@squidoo.com");
    user.setIpAddress("192.57.232.111");
    user.setLatitude(34.003135);
    user.setLongitude(-117.7228641);

    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writeValueAsString(user);

    User userFromJson = mapper.readValue(json, User.class);

    assertThat(userFromJson).usingRecursiveComparison().isEqualTo(user);
  }

}
