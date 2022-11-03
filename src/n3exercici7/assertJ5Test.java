package n3exercici7;

import static org.assertj.core.api.Assertions.*;
import java.util.Optional;
import org.junit.jupiter.api.Test;

class assertJ5Test {
	
	Optional<Object> emptyObject = Optional.empty();

	@Test
	void emptyObject_esta_buit() {
		assertThat(emptyObject).isEmpty();
	}

}
