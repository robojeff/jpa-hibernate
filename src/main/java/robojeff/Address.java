package robojeff;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ADDRESS")
public class Address {

  @Id
  private int id;

  @Column
  private String addressee;

  @Column(name = "street_number")
  private String streetNumber;

  @Column(name = "street_direction")
  private String streetDirection;

  @Column(name = "street_name")
  private String streetName;

  @Column(name = "street_suffix")
  private String streetSuffix;

  @Column
  private String city;

  @Column
  private String state;

  @Column(name = "zip_code")
  private String zipCode;

  @Column
  private String country;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setAddressee(String addressee) {
    this.addressee = addressee;
  }

  public String getAddressee() {
    return addressee;
  }

  public void setStreetNumber(String streetNumber) {
    this.streetNumber = streetNumber;
  }

  public String getStreetNumber() {
    return streetNumber;
  }

  public void setStreetDirection(String streetDirection) {
    this.streetDirection = streetDirection;
  }

  public String getStreetDirection() {
    return streetDirection;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetSuffix(String streetSuffix) {
    this.streetSuffix = streetSuffix;
  }

  public String getStreetSuffix() {
    return streetSuffix;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getCity() {
    return city;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public String getCountry() {
    return country;
  }
}
