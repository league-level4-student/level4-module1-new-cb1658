package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	
	private ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	private ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	public void addDoctor(Doctor d) {
		doctorList.add(d);
	}
	public ArrayList<Doctor> getDoctors(){
		return doctorList;
	}
	
	
	public void addPatient(Patient p) {
		patientList.add(p);
	}
	public ArrayList<Patient> getPatients() {
		return patientList;
	}
	
	public void assignPatientsToDoctors() {
		// COMPLETE THIS
	}
	
	
}
