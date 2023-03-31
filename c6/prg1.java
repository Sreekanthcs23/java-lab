class MyThread extends Thread
{
	int first;
	MyThread(String m,int f)
	{
		super(m);
		first = f;
		start();
	}
	public void run()
	{
		for(int i=first;i<=100;i+=2)
			System.out.println(i);
	}
}

class prg1
{
	public static void main(String arg[])
	{
		MyThread t1 = new MyThread("Odd",1);
		MyThread t2 = new MyThread("Even",2);
		try
		{
			t1.join();
			t2.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	} 
}
