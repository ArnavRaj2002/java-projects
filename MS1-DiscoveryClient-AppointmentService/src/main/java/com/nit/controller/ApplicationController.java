package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.clientcomponent.AppointmentClient;
import com.nit.modal.Appointment;

@RestController
@RequestMapping("appointment")
public class ApplicationController {
	@Autowired
	private AppointmentClient client;
	@GetMapping("display/{id}")
public String displayMessage(@PathVariable Integer id)
{
		Appointment appointment=new Appointment(id, "Sick-Arnav", "arohi@muz");
		String doctorInfo = client.getDoctorInfo(id);
		System.out.println(doctorInfo);
	return "Appointment booked successfully <=Appointment Details :=> "+appointment+"\n:>----<: Doctor Info :=> "+doctorInfo;
}
}
