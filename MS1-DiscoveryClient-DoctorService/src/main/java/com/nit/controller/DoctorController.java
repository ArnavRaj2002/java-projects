package com.nit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.modal.Doctor;

@RestController
@RequestMapping("doctor")
public class DoctorController {
	@GetMapping("display/{id}")
public String displayMessage(@PathVariable Integer id)
{
		 //Doctor d=new Doctor no all args ??
		Doctor d=new Doctor();
		d.setDoctorId(id);
		d.setName("Arnav");
		d.setSpecialization("NeuroSergeon");
	return "Doctor Details:=> "+ d;
}
}
