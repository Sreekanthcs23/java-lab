import java.io.*;

class prg2
{
	public static void main(String arg[])
	{
		try
		{
			FileReader f1 = new FileReader("file1.txt");
			FileReader f2 = new FileReader("file2.txt");
			BufferedReader br1 = new BufferedReader(f1);
			BufferedReader br2 = new BufferedReader(f2);
			FileWriter f3 = new FileWriter("file4.txt",true);
			String s1,s2;
			while(((s1=br1.readLine())!=null) && ((s2=br2.readLine())!=null))
			{
				f3.write(s1);
				f3.write('\n');
				f3.write(s2);
				f3.write('\n');
			}
			while((s1=br1.readLine())!=null)
			{
				f3.write(s1);
				f3.write('\n');
			}
			while((s2=br2.readLine())!=null)
			{
				f3.write(s2);
				f3.write('\n');
			}
			f1.close();
			f2.close();
			f3.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}











