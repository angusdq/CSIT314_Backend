package com.example.CSIT314_Backend.Repository;

import com.example.CSIT314_Backend.Model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
}