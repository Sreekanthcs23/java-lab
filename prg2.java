class prg2
{
	public static void main(String arg[])
	{
		Rectangle r1 = new Rectangle(10,20);
		Rectangle r2 = new Rectangle(20,30);
		int ar1,ar2,pr1,pr2,c;
		ar1 = r1.area();
		pr1 = r1.perimeter();
		ar2 = r2.area();
		pr2 = r2.perimeter();
		System.out.println("1st rectangle  Area = "+ar1+"  Perimeter = "+pr1);
		System.out.println("1st rectangle  Area = "+ar2+"  Perimeter = "+pr2);
		c = r1.sameArea(r2);
		if(c == 1)
			System.out.println("The rectangles have same area");
		else
			System.out.println("The rectangles dont have same area");
	}
}
class Rectangle
{
	int length,breadth;
	Rectangle(int l,int b)
	{
		this.length = l;
		this.breadth = b;
	}
	Rectangle()
	{
		this.length=0;
		this.breadth=0;
	}
	int perimeter()
	{
		int p = 2*(length+breadth);
		return p;
	}
	int area()
	{
		return length*breadth;
	}
	int sameArea(Rectangle r)
	{
		int a1 = this.area();
		int a2 = r.area();
		if(a1==a2)
			return 1;
		else
			return 0;
	}
}

