
public class Division
{

	public int divide(int dividend, int divisor)
	{
		int counter = 0;
		while(dividend >= divisor)
		{
			dividend -= divisor;
			counter++;
		}
		return counter;
	}

}
