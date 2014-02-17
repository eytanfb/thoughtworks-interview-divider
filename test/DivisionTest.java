import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DivisionTest
{

	Division division;
	
	@Before
	public void setUp()
	{
		division = new Division(new NormalDivider());
	}
	
	@Test
	public void testShouldHaveADivisionStrategyForDivision()
	{
		assertNotNull(division.strategy);
	}
	
	@Test
	public void testDivideNormal()
	{	
		assertEquals(5, division.divide(100, 20));
		assertEquals(2, division.divide(100, 50));
		assertTrue(division.strategy instanceof NormalDivider);
	}
	
	@Test
	public void testDivideNegativeNumber()
	{
		assertEquals(-2, division.divide(-8, 4));
		assertEquals(-6, division.divide(-36, 6));
		assertTrue(division.strategy instanceof NegativeDivider);
	}
	
	@Test
	public void testDivideBothNumbersNegative()
	{
		assertEquals(2, division.divide(-8, -4));
		assertEquals(12, division.divide(-144, -12));
		assertTrue(division.strategy instanceof BothNegativeDivider);
	}
	
	@Test(expected=ArithmeticException.class)
	public void testDivideByZeroException() throws ArithmeticException
	{
		division.divide(2, 0);
	}

}
