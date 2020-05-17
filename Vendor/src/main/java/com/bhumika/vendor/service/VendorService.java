package com.bhumika.vendor.service;


import java.util.List;
import java.util.Optional;

import com.bhumika.vendor.entities.Vendor;

public interface VendorService {
	
	Vendor saveVendorInfo(Vendor vendor);
	
	Vendor updateVendorInfo(Vendor vendor);
	
	void  deleteVendorInfo(Vendor vendor);
	
	List<Vendor> getAllVendors();

	Optional<Vendor> getVendorById(int id);



}
