package com.alpha.hospitals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.hospitals.service.DoctoreService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
	@Autowired
	private DoctoreService doctoreService;
	@DeleteMapping("/deleteDoctor/{id}")
	public String deleteDoctor(@PathVariable String id){
		return doctoreService.deleteDoctor(id);
	}
	
	
	

}
