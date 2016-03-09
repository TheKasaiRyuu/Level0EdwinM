import javax.swing.JOptionPane;

public class ActualFizzBuzz {
public static void main(String[] args) {
	for(int i = 0; i < 100; i++){
		if(i % 3 == 0 && i % 5 == 0){
			JOptionPane.showMessageDialog(null, "FizzBuzz");
		}
		else if(i % 5 == 0){
			JOptionPane.showMessageDialog(null, "Buzz");
		}
		else if(i % 3 ==0) {
			JOptionPane.showMessageDialog(null, "Fizz");
		}
		else{
			JOptionPane.showMessageDialog(null, i);
		}
	}
		
	
}
}
