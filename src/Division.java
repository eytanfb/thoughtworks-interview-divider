public class Division
{
	
	public DivisionStrategy strategy;

	public Division(DivisionStrategy strategy)
	{
		this.strategy = strategy;
	}

	public int divide(int dividend, int divisor)
	{
		if(divisor == 0)
			throw new ArithmeticException();
		
		if(dividend >= divisor)
		{
			strategy = new NormalDivider();
			return strategy.divide(dividend, divisor);
		}
			
		
		if(dividend < 0)
		{
			if(divisor < 0)
			{
				strategy = new BothNegativeDivider();
				return strategy.divide(dividend, divisor);
			}
			strategy = new NegativeDivider();
			return strategy.divide(dividend, divisor);
		}
			
		return 0;
	}
}
