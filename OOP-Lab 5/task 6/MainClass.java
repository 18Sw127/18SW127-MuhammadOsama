public class MainClass{
	public static void main(String[]args)
	{
		Student s=new Student("Muhammad Osama",19);
		Marksheet m=new Marksheet(90,90,85);
		s.setData(127,"Software",18,"MUET");
		CombinedClass cc=new CombinedClass(s,m);
		cc.createStudentResult();
	}
}