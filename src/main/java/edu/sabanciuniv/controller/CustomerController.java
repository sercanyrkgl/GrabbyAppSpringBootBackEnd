package edu.sabanciuniv.controller;

import edu.sabanciuniv.entity.Customer;
import edu.sabanciuniv.service.CustomerService;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
@EnableWebSecurity
public class CustomerController {
    private final CustomerService customerService;
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @GetMapping("/all")
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/id/{id}")
    public Customer getCustomerById(@PathVariable Integer id){
        return customerService.getCustomerById(id);
    }

    @GetMapping("/firstname/{firstName}")
    public Customer getCustomerByFirstName(@PathVariable String firstName){
        return customerService.getCustomerByFirstname(firstName);
    }

    @GetMapping("/lastname/{lastName}")
    public Customer getCustomerByLastName(@PathVariable String lastName){
        return customerService.getCustomerByLastName(lastName);
    }

    @GetMapping("/email/{email}")
    public Customer getCustomerByEmail(@PathVariable String email){
        return customerService.getCustomerByEmail(email);
    }

    @PostMapping("/insert")
    public Customer insertCustomer(@RequestBody Customer customer){
        return customerService.insertCustomer(customer);
    }

    @PutMapping("/update/{id}")
    public Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id){
        return customerService.updateCustomerById(customer, id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCustomerById(@PathVariable Integer id){
        customerService.deleteCustomerById(id);
    }

    @DeleteMapping("/delete-all")
    public void deleteAllCustomers(){
        customerService.deleteAllCustomers();
    }
}
