package edu.sabanciuniv.service;

import edu.sabanciuniv.entity.Customer;
import edu.sabanciuniv.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Integer id){
        return customerRepository.findById(id).orElseThrow(() -> new NoSuchElementException(String.format("Customer with id %s not found", id)));
    }

    public Customer getCustomerByEmail(String email){
        return customerRepository.findByEmail(email);
    }

    public Customer getCustomerByFirstname(String firstname){
        return customerRepository.findByFirstname(firstname);
    }

    public Customer getCustomerByLastName(String lastname){
        return customerRepository.findByLastname(lastname);
    }

    public Customer insertCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer updateCustomerById(Customer customer, Long id){
        return customerRepository.save(customer);
    }

    public void deleteCustomerById(Integer id){
        customerRepository.deleteById(id);
    }

    public void deleteAllCustomers(){
        customerRepository.deleteAll();
    }
}

