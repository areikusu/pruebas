package codigo;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class PruebaTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		Menor m = new Menor();
		m.setA(5);
		m.setB(3);
		assertEquals(3, m.menor());
		
	}

}
