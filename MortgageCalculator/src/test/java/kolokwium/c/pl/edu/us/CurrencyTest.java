package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import org.junit.Test;

public class CurrencyTest
{
	Currency cur = new Currency("Testy",20.0);
	@Test
	public void convertFromPLNTest() {
		assertEquals(5,cur.convertFromPLN(4),80);
	}

	
	@Test
	public void convertToPlnTest() {
		assertEquals(5,cur.convertToPLN(4),80);
	}
}