class Employee
{
	String name = new String();
	int salary;
	void display()
	{
		System.out.println("Name of class is Employee");
	}
	void calcSalary()
	{
		System.out.println("Salary of employee is 10000");
	}
}
class Engineer extends Employee
{
	void display()
	{
		System.out.println("Name of class is Engineer");
	}
	void calcSalary()
	{
		//super.calcSalary();
		System.out.println("Salary of employee is 20000");
	}
}
class prg2
{
	public static void main(String arg[])
	{
		Engineer emp1 = new Engineer();
		Employee emp2;
		emp2 = emp1;
		emp2.calcSalary();
	}
}
