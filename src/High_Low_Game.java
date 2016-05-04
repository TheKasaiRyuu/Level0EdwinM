 import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class High_Low_Game {
	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++){
			// 1. ask the user for a guess using a pop-up window, and save their response 
			String Answer = JOptionPane.showInputDialog("Guess a number between 1-100");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int guess = Integer.parseInt(Answer);
			// 5. if the guess is correct
			if(guess == random){
				// 6. win
				JOptionPane.showMessageDialog(null, "Yay... You WIN");
				break;
			}else if(guess > random){	
			// 7. if the guess is high
				// 8. tell them it's too high
				JOptionPane.showMessageDialog(null, "Nope Your Answer is too High");
			}else if(guess < random){
				// 9. if the guess is low
				// 10. tell them it's too low
				JOptionPane.showMessageDialog(null, "Nope Your Answer is too Low");
			}
			}
		
		// 12. tell them they lose
		JOptionPane.showMessageDialog(null, "Well afterall you lose for \n spending time on this");
	}

}


