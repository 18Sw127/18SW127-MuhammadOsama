class Task3
{
	public final void over()
	{
		System.out.println("default");
	}
}
class Again extends Task3
{
	public void over()
	{
		System.out.println("override");
	}
	public static void main(String []abcd)
	{
		Again a=new Again();
		a.over();
	}
}