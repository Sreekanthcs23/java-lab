import java.io.*;

class prg3
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		System.out.println("Enter the name of the file: ");
		String s = br.readLine();
		FileReader f1 = new FileReader(s);
		BufferedReader br1 = new BufferedReader(f1);
		double num,min=0,max=0,total=0,c=0;
		while((s=br1.readLine())!=null)
		{
			num = Double.parseDouble(s);
			if(min==0)
			{
				min = num;
				max = num;
			}
			if(num<min)
			{
				min = num;
			}
			if(num>max)
			{
				max = num;
			}
			total += num;
			c++;
		}
		System.out.println("Minimum = "+min);
		System.out.println("Maximum = "+max);
		System.out.println("Average = "+(total/c));
		System.out.println("Range = [ "+min+" - "+max+" ]");
	}
}
