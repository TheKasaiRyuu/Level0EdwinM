 // Copyright Wintriss Technical Schools 2013
import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momb = "January 1st";
		String dadb = "June 9th";
		String edwinb = "August 13th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String quest = JOptionPane.showInputDialog( "Who's Birthday do you want to know?  edwin? dad? or mom?");
		// 3. Print out what the user typed
		if (quest.equals("mom"))
		{
			JOptionPane.showMessageDialog(null, "It's " + momb);
		}
		else if (quest.equals("dad"))
		{
			JOptionPane.showMessageDialog(null, "It's " + dadb);
		}
		else if (quest.equals("edwin"))
		{
			JOptionPane.showMessageDialog(null, "It's " + edwinb);
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Sorry, i don't remember that person's birthday");
		}
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
