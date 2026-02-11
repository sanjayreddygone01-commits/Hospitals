package com.alpha.hospitals.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.hospitals.entity.Doctor;
import com.alpha.hospitals.repository.DoctorRepo;

@Service
public class DoctoreService {
	@Autowired
	private DoctorRepo doctorRepo;

	public List<Doctor> findalldoctors() {
		
		return doctorRepo.findAll();
	}

}
