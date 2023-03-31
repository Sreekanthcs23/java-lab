import java.io.*;

class AgeException extends Exception
{
	String msg = new String();
	AgeException(String m)
	{
		msg = m;
	}
	public String toString()
	{
		return "AgeException: "+msg;
	}
}

class Student
{
	int roll,age;
	String name = new String();
	String course = new String();
	
	Student(String n,int r,int a,String c)
	{
		name = n;
		roll = r;
		age = a;
		course = c;
	}
	void display()
	{
		System.out.println("Name : "+name+"  Roll no: "+roll+"   Age: "+age+"   Course: "+course);
	}
}

class prg7
{
	public static void main(String arg[])
	{
		try
		{
			InputStreamReader inp = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(inp);
			System.out.println("Enter the name of the student:");
			String n = br.readLine();
			System.out.println("Enter the roll no:");
			int r = Integer.parseInt(br.readLine());
			System.out.println("Enter the age:");
			int a = Integer.parseInt(br.readLine());
			System.out.println("Enter the course:");
			String c = br.readLine();
			if(a<15 || a>21)
				throw new AgeException("Age is not between 15 and 21");
			Student s1 = new Student(n,r,a,c);
			s1.display();	
		}
		catch(AgeException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}













