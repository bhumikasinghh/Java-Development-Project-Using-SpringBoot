package com.bhumika.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bhumika.customer.dal.entities.Customer;
import com.bhumika.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer()
	{
		Customer customer=new Customer();
		customer.setName("Customer1");
		customer.setEmail("bhumikasingh.bly@gmail.com");
		customerRepository.save(customer);	
	}

	@Test
	public void testfindCustomerById()
	{
		Customer customer=customerRepository.findById(1l).get();
		System.out.println(customer);
		
		
	}
	@Test
	public void testUpdateCustomer()
	{
		Customer customer=customerRepository.findById(2l).get();
		customer.setName("customer2");
		System.out.println(customer);
		customerRepository.save(customer);
		
	}
	@Test
	public void testDeleteCustomer()
	{
		customerRepository.deleteById(1l);
		
		
	}
	
}



