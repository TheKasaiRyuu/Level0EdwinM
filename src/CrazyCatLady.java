import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		// 1. Ask the user how many cats they have
		String kitty = JOptionPane.showInputDialog("How many cats do you have");
		// 2. Convert their answer into an int
		int amount = Integer.parseInt(kitty);
		// 3. If they have more than 3 cats, tell them they're a crazy cat lady
		if(amount == 3 || amount > 3){
			JOptionPane.showMessageDialog(null, "You're a cray cray cat lady");
		}
		// 4. If they have 3 or less, call the method below to show them a cat video
		if(amount < 3 && amount > 0){
		playVideo("https://www.youtube.com/watch?v=WlRxNSRA7Rg");
		}
		// 5. If they say 0, show them a video of A Frog Sitting on a Bench Like a Human
		if(amount == 0){
			playVideo("https://www.youtube.com/watch?v=SKRgktzRvZ0");
		}
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}