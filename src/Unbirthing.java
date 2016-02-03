import javax.swing.JOptionPane;

public class Unbirthing {
public static void main(String[] args) {
	String date = "02/03";
	String answer = JOptionPane.showInputDialog("When is your birthday");
	if (answer.equals(date))
	{
	JOptionPane.showMessageDialog(null, "Happy Birthday to you person");
	}
	else
	{
		JOptionPane.showMessageDialog(null, "Merry unbirthday to you person");
	}
}
}
