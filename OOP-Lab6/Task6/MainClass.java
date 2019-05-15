class Task6{
	static String name;
	static String gender;
	static{
		name="Muhammad Osama";
	}
}
public class MainClass{
	public static void main(String[]args)
	{
		Task6.gender="Male";
		System.out.println("Gender: "+Task6.gender);
	    System.out.println("Name: "+Task6.name);
	} 
}