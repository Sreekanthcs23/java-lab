class Employee
{
	int age,salary;
	long phone;
	String name = new String();
	String address = new String();
	void printSalary()
	{
		System.out.println("Name : "+this.name+"  Salary = Rs."+this.salary);
	}
}
class Officer extends Employee
{
	String specialization = new String();
	String department = new String();
	Officer(String n,int a,long pn,String ad,int s,String d,String sp)
	{
		this.name = n;
		this.age = a;
		this.phone = pn;
		this.address = ad;
		this.salary = s;
		this.department = d;
		this.specialization = sp;
	}
}
class Manager extends Employee
{
	String specialization = new String();
	String department = new String();
	Manager(String n,int a,long pn,String ad,int s,String d,String sp)
	{
		this.name = n;
		this.age = a;
		this.phone = pn;
		this.address = ad;
		this.salary = s;
		this.department = d;
		this.specialization = sp;
	}
}
class prg1
{
	public static void main(String arg[])
	{
		Officer emp1 = new Officer("Lando",21,86064533,"silverstone england",3000000,"IT","Programmer");
		Manager emp2 = new Manager("Max",24,70563458,"zandvort netherlands",5000000,"HR","hr");
		System.out.println("Name :"+emp1.name+" Age : "+emp1.age+" Phone number : "+emp1.phone+" Address : "+emp1.address+" Salary = Rs."+emp1.salary);
		System.out.println("Name :"+emp2.name+" Age : "+emp2.age+" Phone number : "+emp2.phone+" Address : "+emp2.address+" Salary = Rs."+emp2.salary);
	}
}
