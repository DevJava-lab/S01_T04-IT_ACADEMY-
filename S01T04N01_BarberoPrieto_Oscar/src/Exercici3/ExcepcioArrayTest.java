package Exercici3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcepcioArrayTest {

	@Test
	void test() {
		ExcepcioArray mostra = new ExcepcioArray();
		
		Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> mostra.foraControl());

		assertEquals("Index fora dels limits del array ", exception.getMessage());
	}

}
