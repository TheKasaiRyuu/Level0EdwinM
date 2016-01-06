import org.teachingextensions.logo.Tortoise;

public class RobertGraf {
public static void main(String[] args) {
	int Turns = 400;
	int Turn = 10;
	Tortoise.setSpeed(10);
	
	for (int i = 0; i < Turns; i++) {
		Tortoise.move(10);
		Tortoise.turn(Turn);
		Turn = Turn + 10;
		}
	
	
	
	}
}
