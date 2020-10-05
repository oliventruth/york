
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	double cmHeight = 120;
	double kgWeight = 105;
	boolean smoker = true;
	int weeklyAlcholUnits = 50;
	final int RWAL = 52;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse = 100;
	char gender = 'M';

	
	public void checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   System.out.print("Healthy pulse = ");
	   System.out.println(healthyPulse);
	}
	
	public boolean checkDesirability()
	{
	   return (cmHeight < 150 && kgWeight > 100 && smoker && RWAL > 50);
	}
	
	public void checkForAbuse()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      System.out.print("Checking for abuse -- ");
	      System.out.println(abuser);
	
	}
	
	public void displayDetails()
	{
		  System.out.println("Height in cm = " +cmHeight);
		  System.out.println("Weight in kg = " +kgWeight);
		  System.out.println("Is Smoker = " +smoker);
		  System.out.println("Weekly Units of Alcohol = " +weeklyAlcholUnits);
		  System.out.println("RWAL = "+RWAL);
		  System.out.println("Pulse at rest = "+restPulse);
		  System.out.println("Gender = "+gender);
	}
	
}
