import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {

		// 1. Watch the first 2 minutes of this movie: http://vimeo.com/2485018
		
		// 2. On paper, write all the numbers that get printed when you run this class
		for(int i = 0; i< 11; i++)
{	
			int randomNumber = new Random().nextInt(5);
		System.out.println(randomNumber);
		if(randomNumber == 0)
		{
			JOptionPane.showMessageDialog(null, "You are Important");
		}
		else if(randomNumber == 1)
		{
			JOptionPane.showMessageDialog(null, "You look Lovely");
		}
		else if(randomNumber == 2)
		{
			JOptionPane.showMessageDialog(null, "You are Amazing");
		}
		else if(randomNumber == 3)
		{
			JOptionPane.showMessageDialog(null, "You are Awesome");
		}
		else if(randomNumber == 4)
		{
			JOptionPane.showMessageDialog(null, "You are as smart as Edwin");
		}
		
		// 3. Use the randomNumber to give the user a random compliment.
		
		// 4. Repeat all the code above 10 times
}		
		// 5. Find someone to test out your program. They will like it :)
	}
}
