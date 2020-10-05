
/**
 * Class to demonstrate Arrays, using JTextArea and 
 * a review of running programs as stand-alone apps
 * 
 * 
 */

import javax.swing.*;

public class BirdTable {


   // main method begins execution of Java application
   public static void main( String args[] )
   {
      //Declare and build an array interactively - see the Temperature Project
	   int [] birdArray = new int[7];
	   String header = "Day\tNo. Blue Tits\tHistogram";
	   
	   for ( int i = 0; i < birdArray.length; i++ ) 
	   {
		   String strElem = JOptionPane.showInputDialog("Enter Integer "+(i+1));
		   int inElem = Integer.parseInt( strElem );
		   birdArray[i] = inElem;
	   }
	   System.out.println(header);
	   for ( int i = 0; i < birdArray.length; i++ )
	   {
		   String bar = ""; 
		   for ( int j = 0; j < birdArray[i]; j++ )
		   {
			   bar += "*";
		   }
		   System.out.println((i+1)+"\t"+birdArray[i]+"\t\t"+bar);
	   }
	     
      
      
      //Display Output using a histogram of '*' - see Histogram Project
   
   }
}