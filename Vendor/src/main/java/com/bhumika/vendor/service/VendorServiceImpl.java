package com.bhumika.vendor.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bhumika.vendor.entities.Vendor;
import com.bhumika.vendor.repos.VendorRepository;

@Service
public class VendorServiceImpl implements VendorService {
	
	@Autowired
	VendorRepository repository;

	@Override
	public Vendor saveVendorInfo(Vendor vendor) {
		return repository.save(vendor);	
	}

	@Override
	public Vendor updateVendorInfo(Vendor vendor) {
		return repository.save(vendor);
	}
	

	@Override
	public Optional<Vendor> getVendorById(int id) {
		return repository.findById(id);
	}

	@Override
	public List<Vendor> getAllVendors() {
		return repository.findAll();
	}

	public VendorRepository getRepository() {
		return repository;
	}

	public void setRepository(VendorRepository repository) {
		this.repository = repository;
	}

	@Override
	public void deleteVendorInfo(Vendor vendor) {
		repository.delete(vendor);
		
	}

	

	
	}
	


