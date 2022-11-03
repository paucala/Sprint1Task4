package n1exercici3;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;

class IndexTest {
	

	@Test
	//amb aquest test comprobem si es llença una excepció ArrayIndexOutOfBounds
	void testsearchIndexIsOutOfBounds() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			String[] cotxes = {"Seat", "Toyota", "Renault", "Volkswagen", "LandRover", "BMW"};
			Index.searchIndex(cotxes, 9);
		});
	}

}
