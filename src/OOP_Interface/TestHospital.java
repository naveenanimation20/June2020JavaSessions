package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh = new FortisHospital();
		fh.cardioServices();
		fh.oncologyServices();
		fh.entServices();
		fh.emergencyServices();
		fh.neuroServices();
		fh.medicalInsurance();
		fh.medicalTraining();
		USMedical.covidTest();
		System.out.println(USMedical.min_fee);
		
		fh.billing();
		fh.swineFlu();
		fh.covid19();
		
		
		//top casting:
		USMedical us = new FortisHospital();//child class object can be referred by parent interface ref variable...
		us.ambulanceServices();
		us.cardioServices();
		us.emergencyServices();
		us.orthoServices();
		us.billing();
		us.swineFlu();
		us.covid19();
		
		
		
		UKMedical uk = new FortisHospital();
		uk.entServices();
		uk.neuroServices();
		uk.covid19();
		uk.swineFlu();
		
		
		
		
	}

}
