import javax.swing.JOptionPane;

public class RollerCoaster {
public static void main(String[] args) {
	String hight = JOptionPane.showInputDialog("How Tall Are You? \nRound To The Nearest Ft.");
	int Height = Integer.parseInt(hight);
	if(Height > 4 || Height == 4){
		JOptionPane.showMessageDialog(null, "Okie You Can Haz Ride");
	}
	if(Height < 4){
		JOptionPane.showMessageDialog(null, "No No You Grow Taller Then You Get Ride");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
