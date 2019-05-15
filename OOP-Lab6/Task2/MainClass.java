public class MainClass{
	public static void main(String[]args)
	{
		Author a1=new Author("Robert Boylested",'m',"rb@gmail.com");
		Author a2=new Author("Robert Lafore",'m',"rl@gmail.com");
		Author []authors={a1,a2};
		Book b1=new Book("Fundamentals of Java",authors,404.6,8);
		System.out.println(b1.toString());
		System.out.println("Author names: "+b1.getAuthorNames());

	}
}