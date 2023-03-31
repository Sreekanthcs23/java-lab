import java.util.Random;

class Generate extends Thread
{
	Generate()
	{
		super();
		start();
	}
	public void run()
	{
		Random rand = new Random();
		for(int i=0;i<100;i++)
		{
			int num = rand.nextInt(100);
			System.out.println("Generated number = "+num);
			EvenThread e = new EvenThread(num);
			OddThread o = new OddThread(num);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}

class OddThread extends Thread
{
	int num;
	OddThread(int n)
	{
		super();
		num = n;
		if(num%2!=0)
			start();
	}
	public void run()
	{
		System.out.println("Cube = "+num*num*num);
	}
}

class EvenThread extends Thread
{
	int num;
	EvenThread(int n)
	{
		super();
		num = n;
		if(num%2==0)
			start();
	}
	public void run()
	{
		System.out.println("Square = "+num*num);
	}
} 

class prg3
{
	public static void main(String arg[])
	{
		Generate t1 = new Generate();
	}
}

























