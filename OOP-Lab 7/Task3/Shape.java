class Shape
{
	protected String color;	
	protected boolean filled;
	public Shape()
	{
		color="red";
		filled=true;
	}
	public Shape(String color, boolean filled)
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
	public String toString()
	{
		return "Shape[Color: "+color+",Filled: "+filled+"]";
	}
}
class Circle extends Shape
{
	protected double radius;
	public Circle()
	{
		radius=1.0;
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
	public double getArea()
	{
		return (3.142*radius*radius);
	}
	public double getPerimeter()
	{
		return (2*3.142*radius);
	}
	public String toString()
	{
		return "Circle[Shape[Radius: "+radius+"]Color: "+color+",Filled: "+filled+"]";
	}
}
class Rectangle extends Shape
{
	protected double width;
	protected double length;
	public Rectangle()
	{
		width=1.0;
		length=1.0;
	}
	public Rectangle(double Width, double length)
	{
		this.width=width;
		this.length=length;
	}
	public Rectangle(double Width, double length, String color, boolean filled)
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
	public void setLenght(double lenght)
	{
		this.length=length;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return (2*(length+width));
	}
	public String toString()
	{
		return "Shape[Rectangle[Width: "+width+",Length: "+length+"],Color: "+color+",Filled: "+filled+"]";
	}
}
class Square extends Rectangle
{
	double side;
	public Square()
	{
		side=2.5;
	}
	public Square(double side)
	{
		this.side=side;
	}
	public Square(double Side, String color, boolean filled)
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
	public void setWidth(double side)
	{
		this.side=side;
	}
	public void setLength(double side)
	{
		this.side=side;
	}
	public String toString()
	{
		return "Shape[Square[Rectangle[Side: "+side+"],Width: "+width+",Length: "+length+"],Color: "+color+",Filled: "+filled+"]";
	}
}