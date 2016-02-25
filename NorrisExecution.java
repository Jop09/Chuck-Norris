package NorrisCoding;

import java.util.*;

public class NorrisExecution {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();
		String ascii = "";
		String chuckNorisCode = "";

		ascii = Norris.createAsciiCode(text);

		chuckNorisCode = Norris.createChuckNorrisCode(ascii);

		System.out.println(chuckNorisCode);
	}

}
