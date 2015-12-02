import javax.swing.JOptionPane;

public class AirlineReg {
public static void main(String[] args) { 
	String Name = JOptionPane.showInputDialog("What is your First Name");
	String Last = JOptionPane.showInputDialog("What is your Last Name");
	String Dest = JOptionPane.showInputDialog("Where is your Destination");
	String Birth = JOptionPane.showInputDialog("What is your Date of Birth (M/D/Y)");
	String Gender = JOptionPane.showInputDialog("what is your Gender");
	JOptionPane.showMessageDialog(null, Last + "/" + Name + " (" + Gender + ", " + Birth + ")" + "\nTraveling to: " + Dest);
	
 }
}

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/

