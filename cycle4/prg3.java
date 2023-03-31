/*  Roll no: B20CSB65
    Name: Sreekanth cs
    Name of experiment: Interface inheritance-1*/

interface Operations
{
	final float PI = (float) 3.14;
	void area();
	void volume();
}
class Cylinder implements Operations
{
	float radius,height;
	Cylinder(float r,float h)
	{
		this.radius = r;
		this.height = h;
	}
	public void area()
	{
		System.out.println("Area = "+(2*PI*radius*height));
	}
	public void volume()
	{
		System.out.println("volume = "+(PI*radius*radius*height));
	}
}
class prg3
{
	public static void main(String arg[])
	{
		Cylinder c = new Cylinder(3,4);
		c.area();
		c.volume();
	}
}
