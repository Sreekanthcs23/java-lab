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
		EvenThread e = new EvenThread();
		OddThread o = new OddThread();
		int se=0,so=0;
		for(int i=0;i<100;i++)
		{
			int num = rand.nextInt(100);
			System.out.println("Generated number = "+num);
			if(num%2==0)
			{
				e.num = num;
				if(se==0)
				{
					e.start();
					se++;
				}
				else
				{
					e.run();
				}
			}
			if(num%2!=0)
			{
				o.num = num;
				if(so==0)
				{
					o.start();
					so++;
				}
				else
				{
					o.run();
				}
			}
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
	OddThread()
	{
		super();
		/*num = n;
		if(num%2!=0)
			start();*/
	}
	public void run()
	{
		System.out.println("Cube = "+num*num*num);
	}
}

class EvenThread extends Thread
{
	int num;
	EvenThread()
	{
		super();
		/*num = n;
		if(num%2==0)
			start();*/
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
