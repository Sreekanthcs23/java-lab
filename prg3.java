class prg3
{
	public static void main(String arg[])
	{
		Complex c1 = new Complex(2,8);
		Complex c2 = new Complex(4,12);
		Complex c3 = new Complex();
		c3 = c1.sum(c2); 
		System.out.println("Result = "+c3.real+" + i"+c3.imaginary);
	}
}
class Complex
{
	float real,imaginary;
	Complex(float r,float i)
	{
		this.real = r;
		this.imaginary = i;
	}
	Complex()
	{
		this.real = 0;
		this.imaginary = 0;
	}
	Complex sum(Complex c)
	{
		Complex s = new Complex();
		s.real = this.real + c.real;
		s.imaginary = this.imaginary + c.imaginary;
		return s;
	}
}
