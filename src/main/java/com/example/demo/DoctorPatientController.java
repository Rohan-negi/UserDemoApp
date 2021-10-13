package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/health")
@RestController
public class DoctorPatientController {
	
	@Autowired
	DoctorPatientService doctorPatientService;
	
	@GetMapping
	public String getCall() {
		return doctorPatientService.saveMethodCall();
	}
	
	@PostMapping("/addDoctor")
	public String addDoctor(@RequestBody Doctor doctor) {
		return doctorPatientService.saveDoctor(doctor);
	}

}
