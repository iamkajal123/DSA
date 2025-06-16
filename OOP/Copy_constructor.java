public class Copy_constructor
{
	public static void main(String args[])
	{
		student s1=new student();
		s1.name="kajal";
		s1.roll=123;
		s1.passward="asd";
		s1.marks[0]=100;
		s1.marks[1]=90;
		s1.marks[2]=80;
		
		student s2 = new student(s1);
		s2.passward="xyz";
		s1.marks[2]=120;                       
												
		for(int i=0;i<3;i++)
		{
			System.out.println(s2.marks[i]);     //100
												 //90
		}										 //120
		System.out.println(s2.passward);         //xyz  
	}
}
class student
{
	String name;
	int roll;
	String passward;
	int marks[]=new int [3];
	
	student()
	{
		System.out.println("Constructor");    //Constructor
	}
	student(student s1)
	{
		//marks=new int[3];
		this.name=s1.name;
		this.roll=s1.roll;
		//this.marks=s1.marks;
		for(int i=0;i<3;i++)
		{
			this.marks[i]=s1.marks[i];
		}
		System.out.println(this.passward=s1.passward);  //	asd
	}
}
		