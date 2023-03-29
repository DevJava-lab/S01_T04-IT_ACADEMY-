package Exercici1;

import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;

public class MesosAnyTest {

	private MesosAny mesos = new MesosAny();

	@Test
	public void testLlistaCompleta() {
		List<String> llista = mesos.getMesos();
		assertEquals(12, llista.size());
		assertNotNull(llista);
		assertEquals("Agost", llista.get(7));
	}

}
