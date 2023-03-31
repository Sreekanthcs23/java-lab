import java.io.*;
class prg2
{
	public static void main(String arg[]) throws Exception
	{
		try
		{
			FileReader f1 = new FileReader("file1.txt");
			FileReader f2 = new FileReader("file2.txt");
			FileWriter f3 = new FileWriter("file3.txt",true);
			BufferedReader br1 = new BufferedReader(f1);
			BufferedReader br2 = new BufferedReader(f2);
			String s1,s2;
			while(((s1=br1.readLine())!= null) && ((s2=br2.readLine())!=null))
			{
				f3.write(s1);
				f3.write('\n');
				f3.write(s2);
				f3.write('\n');
			}
			while((s1=br1.readLine())!= null)
			{
				f3.write(s1);
				f3.write('\n');
			}
			while((s2=br2.readLine())!= null)
			{
				f3.write(s2);
				f3.write('\n');
			}
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
