class Circle
{
	protected double radius;
	protected String color;
	public Circle()
	{
		radius=1.0;
		color="red";
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius, String color)
	{
		this.radius=radius;
		this.color=color;
	}
	public double getRadius()
	{
		return radius;
	}	
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public double getArea()
	{
		return ((3.142)*radius*radius);
	}
	public String toString()
	{
		return "Circle[Radius="+radius+",Color="+color+"]";
	}
}
class Cylinder extends Circle
{
	protected double height;
	public Cylinder()
	{
		height=1.0;
	}
	public Cylinder(double radius)
	{
		this.radius=radius;
	}
	public Cylinder(double radius, double height)
	{
		this.height=height;
		this.radius=radius;
	}
	public Cylinder(double radius, double height, String color)
	{
		this.height=height;
		this.radius=radius;
		this.color=color;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight()
	{
		this.height=height;
	}
	public double getVolume()
	{
		return ((3.142)*radius*radius*height);
	}
}
		
	