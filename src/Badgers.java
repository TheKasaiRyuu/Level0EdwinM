
public class Badgers {
	public static void main(String[] args) {

		for (int o = 0; o < 4; o++){
		for (int i = 0; i < 2; i++) {
			for (int l = 0; l < 12; l++) {
				speak("Badgers");
			}
			for (int p = 0; p < 2; p++) {
				speak("Mushrooms");
			}
		}
		for (int i = 0; i < 12; i++) {
			speak("Badgers");
		}

		speak("Snake, ooooh a snaaaake");

	}
	}
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
