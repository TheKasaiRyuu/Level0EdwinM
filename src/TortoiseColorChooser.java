import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

public class TortoiseColorChooser {
public static void main(String[] args) {
	int Number =  new Random().nextInt(500);
	Robot EdwinBot = new Robot();
	EdwinBot.penDown();
	EdwinBot.setPenColor(PenColors.getRandomColor());
	EdwinBot.setSpeed(10);
	String answer = JOptionPane.showInputDialog("What Shape Do You Want? \nOptions: Square, Triangle, Pentagon \nMust Use Capitals for first Letter!!! ");
	if (answer.equals("Triangle")) {
		for (int i = 0; i < 3; i++) {	
		EdwinBot.turn(120);
		EdwinBot.move(Number);
		}
		EdwinBot.penUp();
		EdwinBot.moveTo(50, 50);
		}
	else if (answer.equals("Square")) {
		for (int i = 0; i < 4; i++) {
			EdwinBot.move(Number);
			EdwinBot.turn(90);	
		}
			EdwinBot.penUp();
			EdwinBot.moveTo(50, 50);
	}
	else if (answer.equals("Pentagon")) {
		for (int i = 0; i < 5; i++) {
			EdwinBot.move(Number);
			EdwinBot.turn(360/5);
		}
			EdwinBot.penUp();
			EdwinBot.moveTo(50, 50);
		
	}
	else {
			JOptionPane.showMessageDialog(null, "Sorry, I Think You Misspelled Something \n -EdwinBot");
	} 
	
	
	
	
	
	
	
 	}	
}
