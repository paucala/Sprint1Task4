package n1exercici1;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class MonthsTest {
	
	Months month = new Months();
	

	//comprobem llargada del array (també es podria fer amb un assertEquals)
	@Test
	public void testMonths1() {
		ArrayList<String> months = Months.months();
		assertTrue(months.size() == 12);
	}
	// cmoprobem que no sigui null
	@Test
	public void testMonths2() {
		ArrayList<String> months = Months.months();
		assertNotNull(months);
	}
	// comprobem que Agost està en la posició correcte
	@Test
	public void testmonths3() {
		ArrayList<String> months = Months.months();
		int expected = 7;
		int position = months.indexOf("Agost");
		assertEquals(expected, position);
	}

}
