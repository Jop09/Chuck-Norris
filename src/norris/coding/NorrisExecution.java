package norris.coding;

import java.util.*;

public class NorrisExecution {

	private NorrisExecution() {}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();

		String ascii = Norris.createAsciiCode(text);

		String chuckNorisCode = Norris.createChuckNorrisCode(ascii);

		System.out.println(chuckNorisCode);
	}

}
