/*  Roll no:B20CSB65
    Name: Sreekanth cs
    Name of experiment: Geometric shapes and operations */

interface Area
{
	double area();
}
interface Volume 
{
	double volume();
}
class Shape
{
	String name = new String();
	Shape(String n)
	{
		this.name = n;
	}
	String getName()
	{
		return name;
	}
}
class Circle extends Shape implements Area
{
	double radius;
	Circle(String n,double r)
	{
		super(n);
		this.radius = r;
	}
	public double area()
	{
		return (3.14*radius*radius);
	}
}
class Square extends Shape implements Area
{
	double side;
	Square(String n,double s)
	{
		super(n);
		this.side = s;
	}
	public double area()
	{
		return (side*side);
	}
}
class Cylinder extends Circle implements Volume
{
	double height;
	Cylinder(String n,double r,double h)
	{
		super(n,r);
		this.height = h;
	}
	public double area()
	{
		return (2*3.14*radius*height);
	}
	public double volume()
	{
		return (3.14*radius*radius*height);
	}
}
class Sphere extends Circle implements Volume
{
	Sphere(String n,double r)
	{
		super(n,r);
	}
	public double area()
	{
		return (4*3.14*radius*radius);
	}
	public double volume()
	{
		return (4/3*3.14*radius*radius*radius);
	}
}
class Cube extends Square implements Volume
{
	Cube(String n,double r)
	{
		super(n,r);
	}
	public double area()
	{
		return (6*side*side);
	}
	public double volume()
	{
		return (side*side*side);
	}
}
class Glome extends Sphere
{
	Glome(String n,double r)
	{
		super(n,r);
	}
	public double area()
	{
		System.out.println("No area");
		return 0;
	}
	public double volume()
	{
		return (0.5*3.14*3.14*radius*radius*radius*radius);
	}
}
class prg2
{
	public static void main(String arg[])
	{
		Circle c = new Circle("Circle 1",4);
		double a1 = c.area();
		System.out.println("Area of "+c.getName()+" is "+a1);
		Square s = new Square("Square 1",6);
		double a2 = s.area();
		System.out.println("Area of "+s.getName()+" is "+a2);
		Cylinder cl = new Cylinder("Cylinder 1",3,4);
		double a3 = cl.area();
		double v3 = cl.volume();
		System.out.println("Area of "+cl.getName()+" is "+a3);
		System.out.println("Volume of "+cl.getName()+" is "+v3);
		Sphere sp = new Sphere("Sphere 1",6);
		double a4 = sp.area();
		double v4 = sp.volume();
		System.out.println("Area of "+sp.getName()+" is "+a4);
		System.out.println("Volume of "+sp.getName()+" is "+v4);
		Cube cb = new Cube("Cube 1",3);
		double a5 = cb.area();
		double v5 = cb.volume();
		System.out.println("Area of "+cb.getName()+" is "+a5);
		System.out.println("Volume of "+cb.getName()+" is "+v5);
		Glome gl = new Glome("Glome 1",5);
		//double a6 = gl.area();
		double v6 = gl.volume();
		//System.out.println("Area of "+gl.getName()+" is "+a6);
		System.out.println("Volume of "+gl.getName()+" is "+v6);
	}
}

















