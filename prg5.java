class prg5
{
	public static void main(String arg[])
	{
		int bal;
		Account acc1 = new Account("Lando",1024,1000000);
		Account acc2 =new Account("Lewis",1055,"silverstone London","savings",250000);
		acc1.deposit(345000);
		acc2.withdraw(15000);
		bal = acc1.getBalance();
		System.out.println("Current balance in account n.o : "+acc1.accno+" is Rs:"+bal);
	} 
}
class Account 
{
	String name = new String();
	String address = new String();
	String type = new String();
	int accno,inamt,balance;
	Account(String n,int an,int ia)
	{
		this.name = n;
		this.accno = an;
		this.inamt = ia;
		this.balance = ia;	
	}
	Account(String n,int an,String ad,String t,int b)
	{
		this.name = n;
		this.accno = an;
		this.address = ad;
		this.type = t;
		this.balance = b;
	}
	void deposit(int am)
	{
		this.balance += am;
		System.out.println("Current balance in account n.o : "+this.accno+" is Rs:"+this.balance);	
	}
	void withdraw(int am)
	{
		this.balance -= am;
		System.out.println("Current balance in account n.o : "+this.accno+" is Rs:"+this.balance);
	}
	int getBalance()
	{
		return this.balance;
	}
}
