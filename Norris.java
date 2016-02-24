package NorrisCoding;

import java.util.* ;

public class Norris {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
	    String text = scanner.nextLine();		// Zeichenkette einlesen über scanner
	    scanner.close();
		String ascii = "";						// String zum speichern des ASCII Code
		String ausgabe = "";					// String für die Ausgabe des "Norris-Code"
		boolean Null = true;					// Variable zum festlegen ob aktuell eine Null-Kette vorliegt oder eine Eins-Kette

	    for(int i=0; i<text.length(); i++) {	// eingelesenen Text durchgehen und in ASCII umwandeln
	    	ascii += (Integer.toBinaryString(text.charAt(i)));
	    }

	    if(ascii.charAt(0)=='1') {				// erstes Zeichen definieren und Null-Variable für den Start setzen
			ausgabe += "0 ";
	    	Null = false;
	    }
		else {
			ausgabe += "00 ";
	    	Null = true;
		}


	    for(int j=0; j<ascii.length(); j++) {	// ASCII Zeichenkette durchgehen und je nach Abhängigkeit von gefundenem Zeichen und Wert der Null-Variable die entsprechenden Zeichen in der ausgabe setzen

	    	if(Null){
	    		if(ascii.charAt(j)=='0')
	    			ausgabe += "0";
	    		else {
	    			ausgabe += " 0 0";
	    			Null = false;
	    		}
	    	}
	    	else {
	    		if(ascii.charAt(j)=='1')
	    			ausgabe += "0";
	    		else {
	    			ausgabe += " 00 0";
	    			Null = true;
	    		}
	    	}

	    }

		System.out.println(ausgabe);
	}



}
