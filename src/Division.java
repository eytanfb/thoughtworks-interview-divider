
public class Division
{

	public int divide(int dividend, int divisor)
	{
		if(divisor == 0)
			return -1;
			
		int counter = 0;
		while(dividend >= divisor)
		{
			dividend -= divisor;
			counter++;
		}
		return counter;
	}

}
