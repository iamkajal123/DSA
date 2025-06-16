class OptimizePower
{
	public static int optimizedpower(int a,int n)
	{
		if(n == 0)
		{
			return 1;
		}
		
		//even
		int halfpower = optimizedpower(a , n/2);
		int halfpowersq = halfpower * halfpower;
		//halfpowersq = optimizedpower(a , n/2) * optimizedpower(a , n/2);
		
		
		//odd
		if(n%2 !=0)
		{
			
			halfpowersq = a * halfpowersq;
		}
		return halfpowersq;
	}
	public static void main(String args[])
	{
		int a=2;
		int n=10;
		System.out.println(optimizedpower(a,n));
	}
}