package com.example.CSIT314_Backend.Repository;

import com.example.CSIT314_Backend.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    Optional<Customer> findByEmail(String s);
    Optional<Customer> findByPassword(String s);
}

