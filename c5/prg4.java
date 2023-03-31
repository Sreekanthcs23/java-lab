import java.io.*;
class prg4
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br1 = new BufferedReader(inp);
		System.out.println("Enter the input file name:");
		String inf = br1.readLine();
		System.out.println("Enter the output file name:");
		String ouf = br1.readLine();
		FileReader f1 = new FileReader(inf);
		BufferedReader br2 = new BufferedReader(f1);
		FileWriter f2 = new FileWriter(ouf);
		String s;
		int c = 1;
		while((s=br2.readLine())!=null)
		{
			f2.write(c+"."+s+"\n");
			c++;
		}
		f2.close();
		f1.close();
	}
}
