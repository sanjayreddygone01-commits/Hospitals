package com.alpha.hospitals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.hospitals.repository.DoctorRepo;

@Service
public class DoctoreService {
@Autowired
private DoctorRepo doctorRepo;
	
	public String deleteDoctor(String id) {
		
		doctorRepo.deleteById(id);
		return "deleted doctor with  "+id;}

}
