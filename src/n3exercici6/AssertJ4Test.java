package n3exercici6;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import n1exercici3.Index;

class AssertJ4Test {
	String[] cotxes = {"Seat", "Toyota", "Renault", "Volkswagen", "LandRover", "BMW"};

	@Test
	void comprobar_excepcio_ArrayIndexOutOfBounds() {
		assertThatExceptionOfType(ArrayIndexOutOfBoundsException.class).isThrownBy(() -> {
		      AssertJ4.searchIndex(cotxes, 9);
		    });

		  
	}

}
