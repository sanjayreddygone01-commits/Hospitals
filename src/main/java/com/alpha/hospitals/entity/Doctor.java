package com.alpha.hospitals.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;
	private String name;
	private int age;
	private String specialization;
	private int salary;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(String id, String name, int age, String specialization, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.specialization = specialization;
		this.salary = salary;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, id, name, salary, specialization);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return age == other.age && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& salary == other.salary && Objects.equals(specialization, other.specialization);
	}
	

}
