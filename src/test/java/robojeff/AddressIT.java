package robojeff;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class AddressIT {
  @Test
  public void persistNewAddress() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("addressPU");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    Address address = new Address();
    address.setAddressee("John Smith");

    tx.begin();
    em.persist(address);
    tx.commit();
    address = em.find(Address.class, address.getId());

    assertThat(address, is(not(nullValue())));
  }
}
