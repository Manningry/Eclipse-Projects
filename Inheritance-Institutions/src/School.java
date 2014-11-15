
public class School extends Institution
	{
	
	protected String educationLevel;
	protected String sportsDivision;

	public void showLevel()
		{
		System.out.println("...teaches students of the " + educationLevel +" level.");
		}
	
	public void showDivision()
		{
		System.out.println("... has various sports that compete in the " + sportsDivision + " division.");
		}
	}
