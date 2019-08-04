interface AdvancedArithmetic
{
	public int sumOfFactors(int n);
}
class MyCalculator implements AdvancedArithmetic
{
	public int sumOfFactors(int n)
	{
		int sum=0;
		if(n<=1000)
		{
			for(int x=1; x<=n; x++)
			{
				if(n%x==0)
					sum+=x;
			}
		}
		return sum;
	}
}