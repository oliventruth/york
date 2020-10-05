
public class Dog extends Animal
{
	private int exerciseTime;
	
	public Dog(String nameIn) 
	{
		super(nameIn);
	}
	
	public void setExerciseTime(int exerciseTimeIn)
	{
		exerciseTime = exerciseTimeIn;
	}
	
	public int getExerciseTime()
	{
		return exerciseTime;
	}
	
	public String toString()
	{
		return super.toString()+" Exercise Time: "+getExerciseTime();
	}
}
