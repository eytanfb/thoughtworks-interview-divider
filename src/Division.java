public class Division
{

	public int divide(int dividend, int divisor)
	{
		if(divisor == 0)
			return -1;
		
		if(dividend >= divisor)
			return new NormalDivider().divide(dividend, divisor);
		
		if(dividend < 0)
		{
			if(divisor < 0)
				return new BothNegativeDivider().divide(dividend, divisor);
			return new NegativeDivider().divide(dividend, divisor);
		}
			
		return 0;
	}
}
