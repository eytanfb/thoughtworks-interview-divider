
public class Division
{

	public int divide(int dividend, int divisor)
	{
		if(divisor == 0)
			return -1;
		
		if(dividend < 0)
			return new DivisionStrategy().negativeDividendDivision(dividend, divisor);
		
		if(dividend >= divisor)
			return new DivisionStrategy().normalDivision(dividend, divisor);
		
		return 0;
	}
	
	private class DivisionStrategy
	{
//		abstract protected int divide(int divident, int divisor);
		
		private int normalDivision(int dividend, int divisor)
		{
			int counter = 0;
			while(dividend >= divisor)
			{
				dividend -= divisor;
				counter++;
			}
			return counter;
		}
		
		private int negativeDividendDivision(int dividend, int divisor)
		{
			int counter = 0;
			
			dividend -= dividend + dividend;
			System.out.println(dividend);
			while(dividend >= divisor)
			{
				dividend -= divisor;
				counter--;
			}
			return counter;
		}
	}

}
