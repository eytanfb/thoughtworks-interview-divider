public class DivisionStrategy
{
	public int normalDivision(int dividend, int divisor)
	{
		int counter = 0;
		while(dividend >= divisor)
		{
			dividend -= divisor;
			counter++;
		}
		return counter;
	}
	
	public int negativeDividendDivision(int dividend, int divisor)
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