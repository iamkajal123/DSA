import java.util.*;
class Container_Most_Water_2ptrApp
{
	public static int storewater(ArrayList<Integer> height)
	{
		int maxwater =Integer.MIN_VALUE;
		int lp=0;
		int rp=height.size()-1;
		if(lp<rp)
		{
			int ht=Math.min(height.get(lp) , height.get(rp));
			int weigth = rp-lp;
			int currwater = ht*weigth;
			maxwater = Math.max(maxwater, currwater);
			if(height.get(lp) < height.get(rp))
			{
				lp++;
			}
			else
			{
				rp--;
			}
		}
		return maxwater;
	}
	public static void main(String agrs[])
	{
		ArrayList<Integer> height =new ArrayList<>();
		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);
		
		System.out.println(storewater(height));
	}
}