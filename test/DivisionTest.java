import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DivisionTest
{

	Division division;
	
	@Before
	public void setUp()
	{
		division = new Division();
	}
	
	@Test
	public void testDivideNormal()
	{	
		assertEquals(5, division.divide(100, 20));
		assertEquals(2, division.divide(100, 50));
	}
	
	@Test
	public void testDivideByZero()
	{
		assertEquals(-1, division.divide(20, 0));
		assertEquals(-1, division.divide(-1, 0));
	}

}
