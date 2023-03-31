import java.io.*;
class test
{
	public static void main(String arg[]) throws Exception
	{
		try
		{
			FileInputStream f1 = new FileInputStream("sample.mp4");
			FileOutputStream f3 = new FileOutputStream("copy.mp4");
			int c;
			do
			{
				c = f1.read();
				if(c!=-1)
				{
					f3.write(c);
				}
			}while(c!=-1);
			
			f1.close();
			f3.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
			return;
		}
	}
}
