class prg1
{
	public static void main(String arg[])
	{
		Shape circle = new Shape();
		Shape rectangle = new Shape();
		Shape triangle = new Shape();
		Shape trapezoid = new Shape();
		circle.area(5);
		rectangle.area(3,8);
		triangle.area(11,11,12);
		trapezoid.area(2.0f,5.1f,4.0f);
	}
}
class Shape
{
	int length,breadth,radius,a,b,c;
	float a1,b1,h;
	void area(int r)
	{
		System.out.println("Area of the circle = "+ 3.14*r*r);
	}
	void area(int l,int b)
	{
		System.out.println("Area of the rectangle = "+ l*b);
	}
	void area(int a,int b,int c)
	{
		int s = (a+b+c)/2; 
		int x = s-a;
		int y = s-b;
		int z = s-c;
		double ar = Math.sqrt(s*x*y*z);
		System.out.println("Area of triangle = "+ ar);
	}
	void area(float a,float b,float h)
	{
		System.out.println("Area of trepezoid = "+ 0.5*(a+b)*h);	
	}
}




























