package Exercici2;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class CalculDniTest {

	private int numero;
	private String lletra;

	public CalculDniTest(int numero, String lletra) {
		this.numero = numero;
		this.lletra = lletra;
	}

	@Parameters
	public static Collection<Object[]> data() {

		return Arrays.asList(new Object[][] {

				{ 43523424, "H" }, { 38806560, "V" }, { 30072011, "V" }, { 29091973, "D" }, { 14111976, "G" },
				{ 15657143, "P" }, { 78901234, "X" }, { 89012345, "E" }, { 30032008, "B" }, { 87450134, "V" }

		});
	}

	@Test
	public void testCalculoLetraDni() {
		String lletraMostra = CalculDni.getLletra(numero);
		assertEquals(lletra, lletraMostra);
	}
}
