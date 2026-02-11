package com.alpha.hospitals.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alpha.hospitals.entity.Doctor;
import com.alpha.hospitals.service.DoctoreService;

@RestController
@RequestMapping("/doctors")
public class DoctorController {
@Autowired
	private DoctoreService doctoreService;
@GetMapping("/findalldoctors")
 public List<Doctor> findalldoctors(){
	 return doctoreService.findalldoctors();
 }
}
