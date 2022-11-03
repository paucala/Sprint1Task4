package n2exercici1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.hamcrest.*;
import org.hamcrest.Description; 
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.*;

class HamcrestTest {
	
	//creem el matcher i instanciem la nova FeatureMatcher, el metode featureValueof 
	//ens agafara la llargada de l'objecte actual i la comparar amb la que li entrem per parametre 
	public static Matcher<String> lenght (Matcher<? super Integer> matcher) {
		return new FeatureMatcher<String, Integer>(matcher, "Una paraula de llargada: ", "la llargada ") {
			@Override
	        protected Integer featureValueOf(String actual) {
	            return actual.length();
	        }
		};
	}
	
	@Test
	public void MordorLength() {
	    MatcherAssert.assertThat("Mordor", lenght(is(8)));
	}
}

	
