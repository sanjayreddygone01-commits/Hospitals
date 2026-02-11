package com.alpha.hospitals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alpha.hospitals.entity.Doctor;
import com.alpha.hospitals.repository.DoctorRepo;

@Service
public class DoctoreService {
@Autowired
private DoctorRepo doctorRepo;
	public Doctor register(Doctor d) {
		Doctor doc=new Doctor();
		doc.setName(d.getName());
		doc.setAge(d.getAge());
		doc.setSalary(d.getSalary());
		doc.setSpecialization(d.getSpecialization());
		
		doctorRepo.save(doc);
		return doc;
		
	}
      
}
