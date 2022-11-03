package n3exercici1exe2exe3;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertjTest1 {
	
	
// EXERCICI 1: metodes per comprobar que dos nombres enters son iguals o son diferents
	@Test
	void EqualNumbers() {
		assertThat(1).isEqualTo(1);
	}
	@Test
	void DiferentNumbers() {
		assertThat(1).isNotEqualTo(2);
	}

//EXERCICI 2: mètodes per compobar que la referencia a un objecte és la mateixa 0 es diferent
	@Test
	void EqualObjects() {
		assertThat("Pau").isEqualTo("Pau");
	}
	@Test
	void DiferentObjects() {
		assertThat("Pau").isNotEqualTo("Laura");
	}
//EXERCICI 3: metode que demostra que 2 arrays d'enterrs son identics
	@Test
	void EqualArrays() {
		int[] array1 = {1, 2, 3, 4};
		int[] array2 = {1, 2, 3, 4};
		
		assertThat(array1).containsExactly(array2);
	}
}
