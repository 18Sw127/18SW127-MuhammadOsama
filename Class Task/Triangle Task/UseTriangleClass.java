public class UseTriangleClass{
	public static void main(String[]args)
	{
		Triangle t=new Triangle();
		System.out.println("Hypotenuse= "+t.getHyp(16,12));
		System.out.println("Perpendicular= "+t.getPerp(4,5));
		System.out.println("Base= "+t.getBase(2,7));
	}
} 