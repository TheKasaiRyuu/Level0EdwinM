
public class Badgers {
	public static void main(String[] args) {

		int Badgers = 12;

		for (int i = 0; i < 12; i++) {
			speak("Badgers");
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
