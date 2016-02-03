import javax.swing.JOptionPane;

public class RiddleMeThis {
public static void main(String[] args) {
	String answer = JOptionPane.showInputDialog("What is brown and sticky?");
	int score = 0;
	if (answer.equals("a stick"))
	{
	JOptionPane.showMessageDialog(null, "YES you are right Sir");
	score = score - 1;
	}
	else 
	{
		JOptionPane.showMessageDialog(null, "Ewww no why would it be that???");
	score = score + 1;
	}
	JOptionPane.showMessageDialog(null, "Your score is " + score);
	

	
	}
}
