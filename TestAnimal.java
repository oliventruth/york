
public class TestAnimal 
{
	public static void main(String[] args)
	{
		Dog dog1 = new Dog("Alex");
		Cat cat1 = new Cat("Jonathan");
		
		dog1.setExerciseTime(10);
		System.out.println("Dog Name is: "+dog1.getName());
		System.out.println("Exercise Time is: "+dog1.getExerciseTime());
		System.out.println(dog1.toString());
		
		System.out.println();
		
		System.out.println("Cat Name is: "+cat1.getName());
		cat1.getLivesLeft();
		cat1.loseLife();
		cat1.getLivesLeft();
		cat1.loseLife();
		System.out.println("Lives left Time is: "+cat1.getLivesLeft());
		System.out.println(cat1.toString());
		
	}
}
