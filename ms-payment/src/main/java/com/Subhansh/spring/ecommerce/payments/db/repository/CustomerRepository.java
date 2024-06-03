package com.Subhansh.spring.ecommerce.payments.db.repository;

import com.Subhansh.spring.ecommerce.payments.db.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}