package com.alpha.hospitals.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.hospitals.entity.Doctor;
import com.alpha.hospitals.service.DoctoreService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
   @Autowired
   private DoctoreService doctoreService;
	@PostMapping("/register")
	public ResponseEntity<Doctor> register(@RequestBody Doctor d){
		Doctor doc=doctoreService.register(d);
		return new ResponseEntity<>(doc,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	
	
	
	
	
}
