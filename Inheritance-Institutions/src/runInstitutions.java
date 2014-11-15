
public class runInstitutions {

	public static void main(String[] args) {
		
		Institution institution = new Institution();
		
		Hospital hospital = new Hospital();
		School school = new School();
		
		Mullen mullen = new Mullen();
		School_Of_Mines school_of_Mines = new School_Of_Mines();
		Swedish_Medical_Center center = new Swedish_Medical_Center();
		Evans_US_Army_Hospital army = new Evans_US_Army_Hospital();
		
		
		institution.showLocation();
		institution.showName();
		
		System.out.println("");
		
		school.showDivision();
		school.showLevel();
		
		System.out.println("");
		
		mullen.showDivision();
		mullen.showLevel();
		mullen.showLocation();
		mullen.showName();
		mullen.findStudentCollege();
		mullen.learnInClass();
		
		System.out.println("");
		
		school_of_Mines.showDivision();
		school_of_Mines.showLevel();
		school_of_Mines.showLocation();
		school_of_Mines.showName();
		school_of_Mines.findStudentJob();
		school_of_Mines.learnOnYourOwn();
		
		System.out.println("");
		
		hospital.showHospitalType();
		hospital.showLocation();
		
		System.out.println("");
		
		center.showHospitalType();
		center.showLocation();
		center.showName();
		center.showSpecialty();
		center.performComplexProcedures();
		center.treatCommonPersons();
		
		System.out.println("");
		
		army.showHospitalType();
		army.showLocation();
		army.showName();
		army.showSpecialty();
		army.treatSoldiersFamily();
		army.performBasicOperations();

	}

}
