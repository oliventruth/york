
public class Cat extends Animal
{
	private int livesLeft;
	
	public Cat(String nameIn) 
	{
		super(nameIn); 
		livesLeft = 9;
	}
	
	public void loseLife()
	{
		livesLeft -= 1;
	}
	
	public int getLivesLeft()
	{
		return livesLeft;
	}
	
	public String toString()
	{
		return super.toString()+" LivesLeft: "+getLivesLeft();
	}
}

