class Tiling
{
	public static int tilingproblem(int n)
	{
		//base case
		if(n == 0 || n == 1)
		{
			return 1;
		}
		
		//kaaam 
		//vertically choice
		int fnm1 = tilingproblem( n-1);
		
		
		//horizontally choice
		int fnm2 = tilingproblem( n-2);
		
		int totways = fnm1 + fnm2;
		return totways;
	}
	public static void main(String args[])
	{
		System.out.println( tilingproblem (3));
	}
}