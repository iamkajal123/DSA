class Basic_concept
{
	public static void main(String args[])
	{
		BankAccount b1=new BankAccount();
		b1.username="kajal";
		
		b1.setpassward("abcd");
	}
}
class BankAccount
{
	public String username;
	private String passward;
	public void setpassward(String pwd)
	{
		passward=pwd;
		System.out.println(passward);
	}
	
}
	