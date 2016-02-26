package NorrisCoding;


public class Norris {


	public static String addZeros(String ascii){

		int asciiLength = ascii.length();
		for(int i = 0; i < 7 - asciiLength; i++) {
			ascii = "0" + ascii;
		}
		return ascii;
	}

	public static String createAsciiCode(String text) {

		String ascii = "";

		for (int i = 0; i < text.length(); i++) {
			ascii += addZeros(Integer.toBinaryString(text.charAt(i)));
		}

		return ascii;
	}

	public static String createChuckNorrisCode(String ascii) {

		String chuckNorrisCode = "";

		if (ascii.length() == 0)
			return "";
		char first = ascii.charAt(0);
		chuckNorrisCode += createStartPattern(ascii, 0, first);

		for (int j = 1; j < ascii.length(); j++) {

			if (ascii.charAt(j) == first) {
				chuckNorrisCode += "0";
			} else {
				chuckNorrisCode += " ";
				first = ascii.charAt(j);
				chuckNorrisCode += createStartPattern(ascii, j, first);
			}

		}
		return chuckNorrisCode;
	}

	public static String createStartPattern(String ascii, int index, char first) {
		if (first == '1') {
			return "0 0";
		} else {
			return "00 0";
		}
	}



}
