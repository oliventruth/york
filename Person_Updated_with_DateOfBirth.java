
/**
 * To demonstrate boolean.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Person
{
	double cmHeight;
	double kgWeight;
	boolean smoker = true;
	int weeklyAlcholUnits; // 1 pint = 2 units, 1 short = 1 unit)
	final int RWAL = 21;   //RWAL - Recommended Weekly Alcohol Limit
	int restPulse;
	String name;
	YorDate dateOfBirth; 
	
	public Person( String nameIn, YorDate dateOfBirthIn ) 
	{
		name = nameIn;
		dateOfBirth = dateOfBirthIn;
	}
	
	public String getName()
	{
		return name;
	}
	
	public YorDate getDateOfBirth()
	{
		return dateOfBirth;
	}
	
	public void displayPersonalDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("Date of Birth is: "+dateOfBirth.getDay()+"/"+dateOfBirth.getMonth()+"/"+dateOfBirth.getYear());
	}

	public boolean checkPulse()
	{
	   boolean healthyPulse;
	   healthyPulse = ((restPulse > 30) && (restPulse < 180));
	   return healthyPulse;
	}
	
	public boolean checkAbuser()
	{
	      boolean abuser ;
	      abuser = ((weeklyAlcholUnits > RWAL) || (smoker) );
	      return abuser;
	}
	
	public void displayProfile()
	{
	   System.out.println("………Health Profile……");
	   
	   System.out.println("Healthy pulse check = " + checkPulse());
	   System.out.print("Abusing Body = " + checkAbuser());
	   
	}
	//Put curseAndSwear method here
	
	public void curseAndSwear()
	{
		int random;
		random = (int) (Math.random()*5) + 1;
		switch (random) {
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					System.out.println("Not swearing for "+random);
		}
	}
	
	
}
