package n3exercici5;

import static org.assertj.core.api.Assertions.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

class AssertJ3Test {

	Map<String, String> comarques = AssertJ3.createMap();
	@Test
	void comprobar_valor_key() {
		assertThat(comarques).containsKey("Barcelones");
	}

}
