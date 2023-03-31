package Exercici1;

import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class ModelPersonalMatcherTest {


	@Test
	void test() {
		
		String paraulaActual="Mordor";
		
		assertThat(paraulaActual,ModelPersonalMatcher.longitud(8));
	}

}
