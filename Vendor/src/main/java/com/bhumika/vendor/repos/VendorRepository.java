package com.bhumika.vendor.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.bhumika.vendor.entities.Vendor;

public interface VendorRepository extends JpaRepository<Vendor, Integer> {

}
