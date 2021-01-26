package academy.digitallab.store.customer.repositories;

import academy.digitallab.store.customer.entities.Customer;
import academy.digitallab.store.customer.entities.Region;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository  extends JpaRepository<Customer,Long> {
    public Customer findByNumberID(String numberID);
    public List<Customer> findByLastName(String lastName);
    public List<Customer> findByRegion(Region region);
}