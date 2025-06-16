import java.util.*;
class Activity_selection
{
	public static void main(String args[])
	{
		int start[]={1,3,0,5,8,5};
		int end[]={2,4,6,7,9,9};
		
		/* //sorting end time
		int activity[][]=new int[start.length][3];
		for(int i=0;i<start.length;i++)
		{
			activity[i][0]=i;
			activity[i][1]=start[i];
			activity[i][2]=end;
		}
		
		//lambda function -> shortform
		Arrays.sort(activity, Comparator.comparingDouble(o->o[2]));
		
		*/
		
		//end time basis sorted
		int maxAct=0;   
		ArrayList<Integer> ans=new ArrayList<>();
		
		//1st activity
		maxAct=1;
		ans.add(0);   			//ans.add(activity[0][0]
		int lastEnd=end[0];		//activity[0][2]
		for(int i=1;i<end.length;i++)
		{
			if(start[i]>=lastEnd)	//if(activity[i][1]>=lastEnd)
			{
				//activity select
				maxAct++;
				ans.add(i);			//activity[i][0]
				lastEnd=end[i];		//activity[i][2]
			}
		}
		System.out.println("max activity ="+maxAct);
		for(int i=0;i<ans.size();i++)
		{
			System.out.print("A" +ans.get(i)+ " ");
		}
		System.out.println();
	}
}