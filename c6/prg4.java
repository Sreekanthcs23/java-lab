class MyThread implements Runnable
{
	Thread t;
	MyThread(String n)
	{
		t = new Thread(this,n);
		t.start();
	}
	public void run()
	{
		try
		{
			Thread.sleep(500);
			System.out.println("Thread:"+t.getName());
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class prg4
{
	public static void main(String args[])
	{
		MyThread obj1 = new MyThread("One");
		MyThread obj2 = new MyThread("Two");
		MyThread obj3 = new MyThread("Three");
		try
		{
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
