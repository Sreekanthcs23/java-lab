class MyThread extends Thread
{
	MyThread(String m,int p)
	{
		super(m);
		this.setPriority(p);
		start();
	}
	public void run()
	{
		System.out.println("Thread:"+getName()+" Priority="+getPriority());
	}
} 

class prg2
{
	public static void main(String arg[])
	{
		MyThread t1 = new MyThread("One",7);
		MyThread t2 = new MyThread("Two",3);
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
