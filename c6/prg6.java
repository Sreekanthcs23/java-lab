class MyThread extends Thread
{
	MyThread(String n)
	{
		super(n);
		start();	
	}
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread:"+i);
			Thread.yield();
		}
	}
}

class prg6
{
	public static void main(String args[])
	{
		MyThread t1 = new MyThread("Child");
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread:"+i);
			Thread.yield();
		}
		/*try
		{
			t1.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}*/
	}
}
