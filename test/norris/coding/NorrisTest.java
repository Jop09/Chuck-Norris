package norris.coding;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import norris.coding.Norris;

@RunWith(Enclosed.class)
public class NorrisTest {

	@RunWith(Parameterized.class)
	public static class ParameterizedTest {

		private String text;
		private String norris;

		public ParameterizedTest(String givenText, String expectedNorris) {
			this.text = givenText;
			this.norris = expectedNorris;
		}

		@Parameters
		public static Collection<String[]> createNorrisCodeParameters() {
			return Arrays
					.asList(new String[][] { { "", "" } ,
						{ "CC", "0 0 00 0000 0 000 00 0000 0 00" },
							{ "C", "0 0 00 0000 0 00" }, { "%",
									"00 0 0 0 00 00 0 0 00 0 0 0" },
					{ "Chuck Norris' keyboard has 2 keys: 0 and white space.",
							"0 0 00 0000 0 0000 00 0 0 0 00 000 0 000 00 0 0 0 00 0 0 000 00 000 0 0000 00 0 0 0 00 0 0 00 00 0 0 0 00 00000 0 0 00 00 0 000 00 0 0 00 00 0 0 0000000 00 00 0 0 00 0 0 000 00 00 0 0 00 0 0 00 00 0 0 0 00 00 0 0000 00 00 0 00 00 0 0 0 00 00 0 000 00 0 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0 000 00 000 0 0 00 0 0 00 00 0 0 000000 00 0000 0 0000 00 00 0 0 00 0 0 00 00 00 0 0 00 000 0 0 00 00000 0 00 00 0 0 0 00 000 0 00 00 0000 0 0000 00 00 0 00 00 0 0 0 00 000000 0 00 00 00 0 0 00 00 0 0 00 00000 0 00 00 0 0 0 00 0 0 0000 00 00 0 0 00 0 0 00000 00 00 0 0000 00 00 0 00 00 0 0 000 00 0 0 0 00 00 0 0 00 000000 0 00 00 00000 0 0 00 00000 0 00 00 0000 0 000 00 0 0 000 00 0 0 00 00 00 0 0 00 000 0 0 00 00000 0 000 00 0 0 00000 00 0 0 0 00 000 0 00 00 0 0 0 00 00 0 0000 00 0 0 0 00 00 0 00 00 00 0 0 00 0 0 0 00 0 0 0 00 00000 0 000 00 00 0 00000 00 0000 0 00 00 0000 0 000 00 000 0 0000 00 00 0 0 00 0 0 0 00 0 0 0 00 0 0 000 00 0" } });
		}

		@Test
		public void testNorris() {
			assertEquals(norris, Norris.createChuckNorrisCode(Norris.createAsciiCode(text)));
		}
	}


	public static class StandardTest {

		@Test
		public void testCreateAsciiCode() {
			assertEquals("0100101", Norris.createAsciiCode("%"));
		}

		@Test
		public void testCreateChuckNorrisCode() {
			assertEquals("00 0 0 0 00 00 0 0 00 0 0 0", Norris.createChuckNorrisCode("0100101"));
		}

		@Test
		public void testAddZeros() {
			assertEquals("0100101", Norris.addZeros("100101"));
		}
	}

}
