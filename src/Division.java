public class Division
{

	public int divide(int dividend, int divisor)
	{
		if(divisor == 0)
			return -1;
		
		if(dividend < 0)
			return new NegativeDivider().divide(dividend, divisor);
		
		if(dividend >= divisor)
			return new NormalDivider().divide(dividend, divisor);
		
		return 0;
	}
}
