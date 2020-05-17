package com.bhumika.vendor.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bhumika.vendor.entities.Vendor;
import com.bhumika.vendor.service.VendorService;

@Controller
public class VendorController 
{
	@Autowired
	VendorService service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		return "createVendor";
	}

	@RequestMapping("/saveVendor")
	public String saveVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		Vendor vendorSaved = service.saveVendorInfo(vendor);
		String msg = "Vendor saved with id: " + vendorSaved.getId();
		modelMap.addAttribute("msg", msg);
		return "createVendor";
	}

	@RequestMapping("/displayVendor")
	public String displayVendors(ModelMap modelMap) {
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendor";
	}

	@RequestMapping("deleteVendor")
	public String deleteVendor(@RequestParam("id") int id, ModelMap modelMap) {
		// Vendor vendor = service.getVendorById(id);
		Vendor vendor = new Vendor();
		vendor.setId(id);
		service.deleteVendorInfo(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendor";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id, ModelMap modelMap) {
		Optional<Vendor> vendor = service.getVendorById(id);
		modelMap.addAttribute("vendor", vendor);
		return "updateVendor";
	}

	@RequestMapping("/updateVendor")
	public String updateVendor(@ModelAttribute("vendor") Vendor vendor, ModelMap modelMap) {
		service.updateVendorInfo(vendor);
		List<Vendor> vendors = service.getAllVendors();
		modelMap.addAttribute("vendors", vendors);
		return "displayVendor";
	}
}