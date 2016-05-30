package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class CurrencyTest
{
	Currency cur = new Currency("Testy",20.0);
	@Test
	public void convertFromPLNTest() {
		assertEquals(0.25,cur.convertFromPLN(5),0.001);
	}
	
	@Test
	public void convertToPlnTest() {
		assertEquals(80,cur.convertToPLN(4),0.001);
	}
}