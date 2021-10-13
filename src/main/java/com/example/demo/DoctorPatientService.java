package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorPatientService {

	@Autowired
	DoctorRepository doctorRepository;
	
	public String saveDoctor(Doctor doctor) {
			doctorRepository.save(doctor);
			return "Doctor successfully saved";
	}

	public String saveMethodCall() {
		// TODO Auto-generated method stub
		return "get called";
	}
}
	

