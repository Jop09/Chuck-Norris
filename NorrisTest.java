package NorrisCoding;

import static org.junit.Assert.*;

import org.junit.Test;

public class NorrisTest {



	//Norris norristest = new Norris();
	String CC_ascii = "10000111000011";
	String CC_norris = "0 0 00 0000 0 000 00 0000 0 00";


	@Test
	public void testasciiUmwandlung() {
		System.out.println("Inside testasciiUmwandlung()");
		assertEquals(CC_ascii, Norris.asciiUmwandlung("CC"));
	}

	@Test
	public void testNorrisCode() {
		System.out.println("Inside testNorrisCode()");
		assertEquals(CC_norris, Norris.NorrisCode(CC_ascii));
	}


}
