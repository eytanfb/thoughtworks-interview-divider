
public class NegativeDivider implements DivisionStrategy
{

	@Override
	public int divide(int dividend, int divisor)
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
