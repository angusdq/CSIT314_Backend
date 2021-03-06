package com.example.CSIT314_Backend.Service;

import com.example.CSIT314_Backend.Model.Customer;

import java.util.List;

public interface CustomerServiceImpl {
    public List<Customer> getAllCustomers();
    public Customer getCustomerById(Long id);
    public Customer createCustomer(Customer newCustomer);
    public Customer getCustomerFindEmail(String email);
    public Customer getCustomerFindPassword(String password);
    public Customer updateCustomer(Customer customer, Long id);
    public void deleteCustomer(Long id);
}
