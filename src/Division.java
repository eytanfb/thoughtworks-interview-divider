
public class Division
{

	public int divide(int dividend, int divisor)
	{
		if(divisor == 0)
			return -1;
		
		int counter = 0;
		
		if(dividend < 0)
		{			
			dividend -= dividend + dividend;
			System.out.println(dividend);
			while(dividend >= divisor)
			{
				dividend -= divisor;
				counter--;
			}
			return counter;
		}
	
		
		while(dividend >= divisor)
		{
			dividend -= divisor;
			counter++;
		}
		return counter;
	}

}
