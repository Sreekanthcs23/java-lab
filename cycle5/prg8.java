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
			throw new SalesException("Amount entered is less than zero");
		if(amount<2000)
		{
			this.commission = (8*amount/100);
			return commission;
		}
		else if((amount>=2000) && (amount<=5000))
		{
			this.commission = (10*amount/100);
			return commission;
		}
		else
		{
			this.commission = (12*amount/100);
			return commission;
		}
	}
	void display()
	{
		System.out.println("Name: "+name+"  Salesman code: "+code+"  sales amount: "+amount+"  Commission: "+commission);
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
			System.out.println("Enter the name of the salesman: ");
			String n = br.readLine();
			System.out.println("Enter the salesman code: ");
			int c = Integer.parseInt(br.readLine());
			System.out.println("Enter the sales amount: ");
			int am = Integer.parseInt(br.readLine());
			SalesMan s1 = new SalesMan(n,c,am);
			double cm = s1.calculate();
			s1.display();
		}
		catch(SalesException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
}


















