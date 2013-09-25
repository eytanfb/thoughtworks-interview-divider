import static org.junit.Assert.*;

import org.junit.Test;


public class DivisionTest
{
	
	
	@Test
	public void testDivide()
	{
		Division division = new Division();
		int result = division.divide(100, 20);
		assertEquals(5, result);
		
		result = division.divide(100, 50);
		assertEquals(2, result);
	}

}
