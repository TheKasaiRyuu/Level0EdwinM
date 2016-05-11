import javax.swing.JOptionPane;
public class SpeakAndSpell {
public static void main(String[] args) {
	int Points = 0;
	speak("Handkerchief");
	String Answer = JOptionPane.showInputDialog("What Did I Say?");
	if(Answer.equals("Handkerchief") || Answer.equals("handkerchief"))
	{	
		Points = Points + 1;
		JOptionPane.showMessageDialog(null, "Good Job");
	}
	speak("Cemetary");
	String answer = JOptionPane.showInputDialog("What Did I Say");
	if(answer.equals("Cemetary") || answer.equals("cemetary"))
	{
		Points = Points + 1;
		JOptionPane.showMessageDialog(null, "Good Job");
	}
	speak("Embarrass");
	String Poop = JOptionPane.showInputDialog("WHAT DID I SAY?????");
	if (Poop.equals("Embarrass") || Poop.equals("embarrass")) {
		Points = Points + 1;
		JOptionPane.showMessageDialog(null, "Good Job");
	}
	
	
	
	JOptionPane.showMessageDialog(null, "These are the Points you acquired \n" + Points);
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
