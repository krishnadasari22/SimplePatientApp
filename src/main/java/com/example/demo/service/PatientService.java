package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;

public interface PatientService {
	List<Patient> getAllPatients();

	Patient savePatient(Patient student);

	Patient getPatientById(Long id);

	Patient updatePatient(Patient student);
	
	void deletePatientById(Long id);
}
