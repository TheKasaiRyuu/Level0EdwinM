import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class RobotGraffiti {
public static void main(String[] args) {
	Tortoise.setSpeed(5);
	Tortoise.setPenColor(PenColors.getRandomColor());
	Tortoise.turn(90);
	Tortoise.move(100);
	Tortoise.turn(180);
	Tortoise.move(100);
	Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(180);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(50);
	Tortoise.turn(90);
	Tortoise.move(100);
	
	}
}
