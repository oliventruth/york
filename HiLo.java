/*
 * @author Tommy Yuan
 * The purpose is to practise the use of if statement.
 * 
 * */


import java.util.*;

public class HiLo {
    
     int random;
     boolean isNotCorrect = true;
 	 int counter = 0;
    
    public void generateNumber() 
    {
       //The following lines generate and output a random number between 1 and 10
        random = (int)(Math.random()*100)+1;
    }
    
    public void startGuessing() 
    {
    	
    	int counter = 0;
    	while ( isNotCorrect )
    	{
    		counter++;
  	      	System.out.println("Counter is "+counter);
    		generateNumber();
    		guess();
    	}
    }
   //Write the guess() method below 
    public void guess()
    {
	   //Use scanner to accept a user input 
	   //Create a new scanner object to receive user input
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter you guess ");
	    int guess = sc.nextInt();
	      
	    //write your code below
	    System.out.println("Random: "+random);
	    if ( guess == random ) {
	      System.out.println("Hit");
	      isNotCorrect = false;
	    }
	    else if ( guess > random )
	      System.out.println("High");
	    else
	      System.out.println("Low");
	   
    }
   
    
}
 