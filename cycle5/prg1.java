import java.io.*;
class prg1
{
	public static void main(String arg[]) throws Exception
	{
		try
		{
			FileInputStream f1 = new FileInputStream("file1.txt");
			FileInputStream f2 = new FileInputStream("file2.txt");
			FileOutputStream f3 = new FileOutputStream("file3.txt",true);
			int c;
			do
			{
				c = f1.read();
				if(c!=-1)
				{
					f3.write(c);
				}
			}while(c!=-1);
			
			do
			{
				c = f2.read();
				if(c!=-1)
				{
					f3.write(c);
				}
			}while(c!=-1);
			f1.close();
			f2.close();
			f3.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			return;
		}
	}
}
