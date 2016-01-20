import org.jointheleague.graphical.robot.Robot;
import org.teachingextensions.logo.PenColors;

import java.awt.Color;

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
		Robot ArmBot = new Robot();
		ArmBot.moveTo(500, 300);

	    ArmBot.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 10
		ArmBot.setSpeed(10);
		// 13. Make all the code below repeat 25 times
		for (int i = 0; i < 200; i++) {
			
		
			// 2. Turn the robot 1/8 of a circle
		ArmBot.turn(45);
			// 3. Move the robot 64 pixels
		ArmBot.move(64);
			
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
		ArmBot.turn(-40);
			// 5. Move the robot the distance in the variable flameSize
		ArmBot.setPenColor(PenColors.Oranges.OrangeRed);
		ArmBot.move(flameSize);
			// 6. Turn the robot 170 degrees
		ArmBot.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
		ArmBot.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
		ArmBot.setPenColor(PenColors.Grays.DimGray);
		ArmBot.turn(64);
			// 9. Move the robot the distance in the variable baseSize
		ArmBot.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			// 11. Color your ninja star like Figure 2.
		}
	}

}



