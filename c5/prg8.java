import java.io.*;

class SalesException extends Exception
{
	String msg = new String();
	SalesException(String m)
	{
		msg = m;
	}
	public String toString()
	{
		return "SalesException: "+msg;
	}
}

class SalesMan
{
	String name = new String();
	int code,amount;
	double commission;
	SalesMan(String n,int c,int am)
	{
		name = n;
		code = c;
		amount = am;
	}
	double calculate() throws SalesException
	{
		if(amount<0)
			throw new SalesException("Sales amount entered is less than zero");
		if(amount<2000)
		{
			commission = (8*amount/100);
			return commission;
		}
		if((amount>=2000)&&(amount<=5000))
		{
			commission = (10*amount/100);
			return commission;
		}
		else
		{
			commission = (12*amount/100);
			return commission;
		}
	}
	void display()
	{
		System.out.println("Name : "+name+"  Sales code:"+code+"  sales amount"+amount+"  Commision: "+commission);
	}
}

class prg8
{
	public static void main(String arg[])
	{
		try
		{
			InputStreamReader inp = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(inp);
			System.out.println("Enter the name of the employee:");
			String n = br.readLine();
			System.out.println("Enter the sales man code:");
			int c = Integer.parseInt(br.readLine());
			System.out.println("Enter the sales amount:");
			int am = Integer.parseInt(br.readLine());
			SalesMan s1 = new SalesMan(n,c,am);
			double cm =s1.calculate();
			s1.display();
		}
		catch(SalesException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}




































