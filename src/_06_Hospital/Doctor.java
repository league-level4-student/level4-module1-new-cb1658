package _06_Hospital;

import java.util.ArrayList;

public abstract class Doctor {
	
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	
	public void assignPatient(Patient p) throws DoctorFullException{
		if(patientList.size() == 3) {
			throw new DoctorFullException();
		}
		
		patientList.add(p);
		
	}
	
	public ArrayList<Patient> getPatients(){
		return patientList;
	}
	
	
	public void doMedicine() {
		for(Patient p : patientList) {
			p.checkPulse();
		}
	}
	
	abstract boolean performsSurgery();
	
	abstract boolean makesHouseCalls();
}
