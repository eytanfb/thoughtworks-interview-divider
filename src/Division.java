
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
}
