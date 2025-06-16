class Shortest_Path
{
	public static void main(String args[])
	{
		String path="WNEENESENNN";
		System.out.println(get_shortest_path(path));
	}
	
	public static float get_shortest_path(String str)
	{
		int x=0,y=0;
		for(int i=0; i<str.length(); i++)
		{
			char dir=str.charAt(i); //direction ghyachi (first element select karaycha)
			
			//south
			if(dir=='S')
			{
				y--;
			}
			//north
			else if(dir=='N')
			{
				y++;
			}
			//west
			else if(dir=='w')
			{
				x--;
			}
			//east
			else 
			{
				x++;
			}
		}
		
		//formula
		int x2=x*x;
		int y2=y*y;
		return (float)(Math.sqrt(x2+y2));
	}
}
		