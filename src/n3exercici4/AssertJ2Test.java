package n3exercici4;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class AssertJ2Test {
	ArrayList<Object> llista = AssertJ2.createList();

	//si vull comprobar cada index
	@Test
	void La_llista_conte_els_objectes_en_ordre() {
		assertThat(llista).contains("Pau", atIndex(0))
							.contains(2, atIndex(1))
							.contains('c', atIndex(2))
							.contains(5.4, atIndex(3));					
	}
	//si vull comprobar la llista sencera
	@Test
	void La_llista_conte_els_objectes_en_ordre_2() {
		assertThat(llista).containsExactly("Pau", 2, 'c', 5.4);					
	}
	@Test
	void La_llista_conte_els_objectes_en_qualsevol_ordre() {
		assertThat(llista).contains("Pau", 'c', 2, 5.4);					
	}
	
	@Test
	void La_llista_conte_un_sol_objecte_igual() {
		assertThat(llista).containsOnlyOnce("Pau");					
	}
	@Test
	void La_llista_no_conte_un_objecte() {
		assertThat(llista).doesNotContain(1987);					
	}
	

}
