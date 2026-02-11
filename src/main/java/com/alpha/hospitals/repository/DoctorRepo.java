package com.alpha.hospitals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alpha.hospitals.entity.Doctor;
@Repository
public interface DoctorRepo extends JpaRepository<Doctor, String>{

}
