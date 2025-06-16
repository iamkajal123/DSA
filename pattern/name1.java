class basic
{
	public static void main(String args[])
	{
		BankAccount b1=new BankAccount();
		b1.username="kajal";
		
		System.out.println(b1.setpassward("abcd"));
	}
}
class BankAccount
{
	public string username;
	private String passward;
	public void setpassward(String pwd)
	{
		passward=pwd;
	}
}
	