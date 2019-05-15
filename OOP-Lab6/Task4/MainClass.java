class Area{
	public double area(double length){
		return (length*length);
	} 
	public double area(double length,double breadth){
		return (length*breadth);
	}
}
public class MainClass{
	public static void main(String[]args)
	{
		Area a=new Area();
		System.out.println("Area of square: "+ (a.area(5.5)) );
		System.out.println("Area of rectangle: "+ (a.area(1.2,2.1)) );
	}
}