package com.bhumika.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.bhumika.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
