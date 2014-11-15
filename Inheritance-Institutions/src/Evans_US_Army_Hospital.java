
public class Evans_US_Army_Hospital extends Hospital{

	public void showHospitalType()
	{
	System.out.println("This hospital is a military community hospital.");
	}

public void showSpecialty()
	{
	System.out.println("This hospital specializes in general medicine and smaller medical procedures");
	}	

public void showLocation()
{
	location = "1650 Cochrane Cir, Fort Carson, CO 80913.";
System.out.println("The location of this institution is " + location);
}

public void showName()
{
name = "Evans U.S. Army Community Hospital.";
System.out.println("The name of this institution is " + name);
}

public void performBasicOperations()
{
System.out.println("Evans can only perform basic surgeries and operations, and treat common ailments.");	
}

public void treatSoldiersFamily()
{
System.out.println("Evans is only open to soldiers/family on the base, not common peoples.");	
}

}