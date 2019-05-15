class Overloading{
	private int n;
	private char ch;
	public void show(int n,char ch){
		this.n=n;
		this.ch=ch;
		System.out.println("Int: "+n);
		System.out.println("Char: "+ch);
	}
	public void show(char ch,int n){
		this.n=n;
		this.ch=ch;
		System.out.println("Int: "+n);
		System.out.println("Char: "+ch);
	}
}
public class Task3{
	public static void main(String[]args)
	{
		Overloading obj=new Overloading();
		obj.show(17,'a');
		obj.show('b',54); 
	}
}