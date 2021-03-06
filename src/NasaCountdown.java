import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
/**
 * Kata: NASA Countdown
 * 
 * The NASA wants to shoot yet another rocket to the orbit. As this is your first day as a wannabe scientist
 * at the ground control, you are very excited. So excited that when the gal responsible for the countdown
 * asks you to bring her some coffee, you accidentally spill it all over her lap and the computer – both are
 * not capable of doing their job now.
 * 
 * But the liftoff is only seconds away. Somebody has to do the countdown – or the rocket can’t start and
 * millions of dollars are lost! In a moment of great bravery you remember you learned how to count (a long
 * time ago in High School). So you take the chance!
 * 
 * The ground control chief will tell you where to start – then count to 0. 
 * (example for ’11’: 11 10 9 8 7 6 5 4 3 2 1 0)
 **/
public class NasaCountdown {
	public static void main(String[] args) {
		// 2. ask the user when to start (JOptionPane.showInputDialog)
		String answer = JOptionPane.showInputDialog("When do you want to start? \nChoose between 0-10");
		// 3. convert the user's answer to an int (Integer.parseInt)
		int number = Integer.parseInt(answer);
		// 4. countdown from user's starting point
		
		// 1. countdown from 10 to 0
		for(int i = number; i > -1; i = i - 1){
		
			JOptionPane.showMessageDialog(null, i);
			if (i == 0) {
			
			JOptionPane.showMessageDialog(null, "Blastoff");
			// 5. when the counting is done, print "blastoff!"
		}
		}
	}

static void speak(String words) {
   	 try {
   		 Runtime.getRuntime().exec("say " + words).waitFor();
   	 } catch (Exception e) {
   		 e.printStackTrace();
   	 }
  }
}

