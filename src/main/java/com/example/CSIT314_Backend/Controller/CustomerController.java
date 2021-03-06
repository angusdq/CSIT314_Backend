package com.example.CSIT314_Backend.Controller;

import com.example.CSIT314_Backend.Model.Customer;
import com.example.CSIT314_Backend.Service.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerServiceImpl customerService;

    @GetMapping("/getAll")
    public List<Customer> getCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/getCustomer/{id}")
    Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

    @GetMapping("/findCustomerEmail/{email}")
    Customer getCustomerFindEmail(@PathVariable String email) {
        return customerService.getCustomerFindEmail(email);
    }

    @GetMapping("/findCustomerPassword/{password}")
    Customer getCustomerFindPassword(@PathVariable String password) {
        return customerService.getCustomerFindPassword(password);
    }

    @PostMapping("/addCustomer")
    Customer createCustomer(@RequestBody Customer newCustomer) {
        return customerService.createCustomer(newCustomer);
    }

    @PutMapping("/updateCustomer/{id}")
    Customer updateCustomer(@RequestBody Customer customer, @PathVariable Long id){
        return customerService.updateCustomer(customer, id);
    }

    @DeleteMapping("deleteCustomer/{id}")
    void deleteCustomer(@PathVariable Long id){
        customerService.deleteCustomer(id);
    }

}
