package com.bridgelabz.cliniquemanagement.service;

public interface SearchI {

	void searchByPatientName();

	void searchByPatientid();

	void searchByPatientphone();

	void searchByDoctorName();

	void searchByDoctorId();

	void searchByDoctorSpecialization();

	void searchByDoctorAvailability();

	void docSearch();
	
	void patientSearch();

}
