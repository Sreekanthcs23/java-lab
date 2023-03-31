import java.io.*;
class prg3
{
	public static void main(String arg[]) throws Exception
	{
		int nums[] = new int[20];
		double i=0,min=0,max=0,total=0;
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		System.out.println("Enter the name of input file:");
		String s = br.readLine();
		FileReader f = new FileReader(s);
		BufferedReader br1 = new BufferedReader(f);
		while((s=br1.readLine())!=null)
		{
			double num = Double.parseDouble(s);
			if(i==0)
			{
				min = num;
				max = num;
			}
			if(num<min)
				min = num;
			if(num>max)
				max = num;
			total += num;
			i++;
		}
		System.out.println("Minimum = "+min);
		System.out.println("Maximum = "+max);
		System.out.println("Average = "+(total/i));
		System.out.println("Range = "+min+" - "+max);
		f.close();
	}
}
