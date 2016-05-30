package kolokwium.c.pl.edu.us;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MortgageCalculatorTest
{
	private double _sum;
	private double interest;
	private int _periods;
	
	 public MortgageCalculatorTest(double sum, double interest, int periods){
		_sum = sum;
		this.interest = interest;
		_periods = periods;
	}
	 
	 @Parameters
	 public static Collection<Object[]> data() {
		 Object[][] data = new Object[][] { { 1 }, { 5 } };
		 return Arrays.asList(data);
	 }
	
	@Test
	public void numberOfInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfFirstInstallmentsTest() {
		fail("Not yet implemented");
	}
	
	@Test
	public void valueOfLastInstallmentsTest() {
		fail("Not yet implemented");
	}
}

