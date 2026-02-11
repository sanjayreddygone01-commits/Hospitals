package com.alpha.hospitals.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alpha.hospitals.entity.Doctor;

public interface DoctorRepo extends JpaRepository<Doctor, String>{

}
