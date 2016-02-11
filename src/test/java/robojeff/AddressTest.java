package robojeff;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class AddressTest {
  @Test
  public void newAddress() {
    assertThat(new Address(), is(not(nullValue())));
  }

  @Test
  public void setAddressee() {
    Address address = new Address();
    String addressee = "John Smith";

    address.setAddressee(addressee);

    assertThat(address.getAddressee(), is(equalTo(addressee)));
  }

  @Test
  public void setStreetNumber() {
    Address address = new Address();
    String streetNumber = "123";

    address.setStreetNumber(streetNumber);

    assertThat(address.getStreetNumber(), is(equalTo(streetNumber)));
  }

  @Test
  public void setStreetName() {
    Address address = new Address();
    String streetName = "Main";

    address.setStreetName(streetName);

    assertThat(address.getStreetName(), is(equalTo(streetName)));
  }

  @Test
  public void setStreetDirection() {
    Address address = new Address();
    String streetDirection = "N";

    address.setStreetDirection(streetDirection);

    assertThat(address.getStreetDirection(), is(equalTo(streetDirection)));
  }

  @Test
  public void setStreetSuffix() {
    Address address = new Address();
    String streetSuffix = "Street";

    address.setStreetSuffix(streetSuffix);

    assertThat(address.getStreetSuffix(), is(equalTo(streetSuffix)));
  }

  @Test
  public void setCity() {
    Address address = new Address();
    String city = "Anytown";

    address.setCity(city);

    assertThat(address.getCity(), is(equalTo(city)));
  }

  @Test
  public void setState() {
    Address address = new Address();
    String state = "CA";

    address.setState(state);

    assertThat(address.getState(), is(equalTo(state)));
  }

  @Test
  public void setZipCode() {
    Address address = new Address();
    String zipCode = "12345";

    address.setZipCode(zipCode);

    assertThat(address.getZipCode(), is(equalTo(zipCode)));
  }

  @Test
  public void setCountry() {
    Address address = new Address();
    String country = "USA";

    address.setCountry(country);

    assertThat(address.getCountry(), is(equalTo(country)));
  }
}
