/*
	Roll no: B20CSB65
	Name: Sreekanth cs
	Name of experiment: Abstact classes of shapes */

abstract class Shape
{
	abstract void numberOfSides();
}
class Rectangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("This shape has 4 sides");
	}
}
class Triangle extends Shape
{
	void numberOfSides()
	{
		System.out.println("This shape has 3 sides");
	}
}
class Hexagon extends Shape
{
	void numberOfSides()
	{
		System.out.println("This shape has 6 sides");
	}
}
class prg1
{
	public static void main(String arg[])
	{
		Rectangle r = new Rectangle();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		r.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}
