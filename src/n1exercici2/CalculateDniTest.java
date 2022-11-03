/**
 * 
 */
package n1exercici2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameters;


class CalculateDniTest {
	
	CalculateDni testclass;

	
	@ParameterizedTest
	@CsvSource ({"46698547, Z", "45689754, R", "45896356, V", "68914758, L", "23541256, C", "88965439, J", "46589215, R", "57861245, F", "23894267, G", "78956217, T"})
	void testCalculateDni(int dni, char letter) {
		testclass = new CalculateDni(dni);
		assertEquals(letter, testclass.getLetter());
	}


}
