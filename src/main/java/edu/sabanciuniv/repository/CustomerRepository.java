package edu.sabanciuniv.repository;

import edu.sabanciuniv.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    Customer findByEmail(String email);
    Customer findByFirstname(String firstname);
    Customer findByLastname(String lastname);
}
