abstract class Shape
{
	String color;
	boolean filled;
	Shape()
	{
		color="red";
		filled=true;
	}
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	public String getColor()
	{
		return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public boolean isFilled()
	{
		return filled;
	}
	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();		
}
class Circle extends Shape
{
	double radius;
	Circle()
	{
		radius=5.5;	
	}
	public Circle(double radius)
	{
		this.radius=radius;
	}
	public Circle(double radius, String color, boolean filled)
	{
		this.radius=radius;
		this.color=color;
		this.filled=filled;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
}
class Rectangle extends Shape
{
	double width;
	double length;
	Rectangle()
	{
		width=2.5;
		length=3.5;
	}
	public Rectangle(double width, double length)
	{
		this.width=width;
		this.length=length;
	}
	public Rectangle(double width, double length,String color, boolean filled)
	{
		this.width=width;
		this.length=length;
		this.color=color;
		this.filled=filled;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public abstract double getArea();
	public abstract double getPerimeter();
	public abstract String toString();
}
class Square extends Rectangle
{
	double side;
	public Square()
	{
		side=2.2;
	}
	public Square(double side)
	{
		this.side=side;
	}
	public Square(double side,String color, boolean filled)
	{
		this.side=side;
		this.color=color;
		this.filled=filled;
	}
	public double getSide()
	{
		return side;
	}
	public void setSide(double side)
	{
		this.side=side;
	}
	public abstract void setWidth(double side);
	public abstract void setLength(double side);
	public abstract String toString();
}