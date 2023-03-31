/*  Roll no: B20CSB65
    Name: Sreekanth cs
    Name of experiment: Interface inheritance  */

interface P
{
	final int c = 1;
	void f();
} 
interface P1 extends P
{
	final int c1 = 2;
	void f1();
}
interface P2 extends P
{
	final int c2 = 3;
	void f2();
}
interface P12 extends P1,P2
{
	final int c12 = 4;
	void f12();
}
class Q implements P12
{
	public void f()
	{
		System.out.println("Constant of interafce P is "+c);
	}
	public void f1()
	{
		System.out.println("Constant of interafce P1 is "+c1);
	}
	public void f2()
	{
		System.out.println("Constant of interafce P2 is "+c2);
	}
	public void f12()
	{
		System.out.println("Constant of interafce P12 is "+c12);
	}
}
class prg4
{
	public static void main(String arg[])
	{
		Q obj = new Q();
		obj.f();
		obj.f1();
		obj.f2();
		obj.f12();
	}
}

















