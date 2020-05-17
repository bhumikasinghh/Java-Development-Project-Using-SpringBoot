package com.bhumika.vendor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.bhumika.vendor.entities.Vendor;
import com.bhumika.vendor.repos.VendorRepository;

@SpringBootTest
class VendorApplicationTests {
	
	@Autowired
	private VendorRepository vendorRepository;


	@Test
	public void testCreateStudent()
	{
		Vendor vendor=new Vendor();
		vendor.setId(4);
		vendor.setCode("DEL");
		vendor.setName("abhinav");
		vendor.setEmail("abhinavsingh.hhh@hh");
		vendor.setAddress("299,katra chand khan,Delhi");
		vendor.setType("RuRAL");
		vendorRepository.save(vendor);	
	}

	
}
