class Account
{
	int balance,accno;
	String name;
	Account(String n,int an,int b)
	{
		name = n;
		accno = an;
		balance = b;
	}
	synchronized void deposit(int am)
	{
		balance += am;
		System.out.println("Amount deposited Current balance in account no."+accno+" is Rs."+balance);
	}
	synchronized void withdraw(int am)
	{
		if(am>balance)
		{
			System.out.println("No sufficient balance available in account no."+accno+" to perform this deposit");
			return;
		}
		balance -= am;
		System.out.println("Amount withdrawn, current balance in account no."+accno+" is Rs."+balance);
		return;
	}
}

class MyThread implements Runnable
{
	Thread t;
	Account ac;
	int d,w;
	MyThread(String n,Account ob,int de,int wi)
	{
		t = new Thread(this,n);
		ac = ob;
		d = de;
		w = wi;
		t.start();
	}
	public void run()
	{
		ac.deposit(d);
		ac.withdraw(w);
	}
}

class prg5
{
	public static void main(String arg[])
	{
		Account acc1 = new Account("Lando",20004,5000);
		Account acc2 = new Account("Max",20033,1000);
		Account acc3 = new Account("Lewis",20044,500);
		MyThread ob1 = new MyThread("Lando",acc1,1000,4000);
		MyThread ob2 = new MyThread("Max",acc2,1000,3000);
		MyThread ob3 = new MyThread("Lewis",acc3,1000,1500);
		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

















