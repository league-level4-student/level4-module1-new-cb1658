package _06_Hospital;

public class GeneralPractitioner extends Doctor{


	
	@Override
	boolean performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}

}
