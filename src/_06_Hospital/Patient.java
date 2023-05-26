package _06_Hospital;

public class Patient {
	private boolean feelsCaredFor;
	
	public void checkPulse() {
		this.feelsCaredFor = true;
	}
	
	public void medicineDid() {
		
		this.feelsCaredFor = true;
	}
	
	public boolean feelsCaredFor() {
		return this.feelsCaredFor;
	}
}
