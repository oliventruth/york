
/**
 * Favourite class to test a string object and it's methods.
 * 
 * @version (a version number or a date)
 */
import java.util.*;

public class WrappedUp
{
	
	public void guessMyFavouriteThing()
	{
	   //Create a string object with your favourite animal, car ..whatever
	   //e.g String favMotorBikeManufacturer = "bmw"
		String favCar = "vw";
		String tempCar;
			   
	   /* Now prompt for a guess - using the Scanner class
	   ** Using String methods, you should give the length 
	   ** and first letter of your favourite thing in the prompt.
	   */
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess my favourite car. It has "+favCar.length()+" characters and begins with '"+favCar.charAt(0)+"': ");
		
		// Now test if the guess was correct - ignore case 	
		if ( sc.hasNext() )
		{
			tempCar = sc.next();
			if ( tempCar.equalsIgnoreCase(favCar) )
				System.out.println("Good Match!");
			else
				System.out.println("Not Good Match!");
		}
	}//end guessing


	public static void main(String args[]) {
		//Create WrappedUp object and test the methods
		WrappedUp w1 = new WrappedUp();
		w1.guessMyFavouriteThing();
	}
}
