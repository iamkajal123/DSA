class FriendPairing
{
	public static int friendpair(int n)
	{
		if(n == 1 || n==2)
		{
			return n;
		}
		
		int fnm1 = friendpair(n-1);
		int fnm2 = n-1 * friendpair(n-2);
		int totways = fnm1 + fnm2;
		return totways;
	
		//reutrn friendpair(n-1) + (n-1 * friendpair(n-2));
	}
	public static void main(String args[])
	{
		System.out.println(friendpair(3));
	}
}