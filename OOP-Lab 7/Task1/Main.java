class Main
{
	public static void main(String []abcd)
	{
		Cylinder a=new Cylinder(1.2,5.4);
		a.setRadius(8.2);
		System.out.println("Area of Circle: "+a.getArea());
		System.out.println(a.toString());
		System.out.println("volume of Cylinder: "+a.getVolume());
	}
}