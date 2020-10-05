import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class DiceRoll extends JPanel
{
    private int firstDice;		// to hold the value for the first dice
	private int secondDice;		// to hold the value for the second dice
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        String msg;
		firstDice  = (int) (Math.random() * 6) + 1; // get a value for the first dice
		secondDice = (int) (Math.random() * 6) + 1; //get a value for the second dice
		// check equality
		//if ( firstDice == secondDice )
			//msg = "Win";
		//else
			//msg = "sorry, try again";
		
		// check if both are greater than 3
		//if ( firstDice > 3 && secondDice > 3 )
			//msg = "Win";
		//else
			//msg = "sorry, try again";
		
		// check if either have score of 6
		//if ( firstDice == 6 || secondDice == 6 )
			//msg = "You win - roll again";
		//else
			//msg = "You lost - try again";
		
		// check if sum of any pair equals 7
		if ( firstDice + secondDice == 7 )
			msg = "Bonus throw - roll again";
		else
			msg = "sorry try again";
		
		// draw the dice squares
		g.setColor(Color.blue);
		g.fillRect(20, 20, 60, 60);
		g.setColor(Color.magenta);
		g.fillRect(120, 20, 60, 60);
		
		// put the values on the dice
		g.setColor(Color.white);
		g.drawString(" " + firstDice, 43, 54);
		g.drawString(" " + secondDice, 143, 54);
		
		// write the values under the dice
		g.setColor(Color.black);
		g.drawString("First dice = " + firstDice, 20, 100); 
		g.drawString("Second Dice = " + secondDice, 120, 100); // print out the dice values
		g.drawString(msg,20,120);
   }
}


