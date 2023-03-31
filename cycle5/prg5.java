import java.util.*;
import java.io.*;

class prg5
{
	public static void main(String arg[]) throws Exception
	{
		InputStreamReader inp = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(inp);
		System.out.println("Enter the integers as a line:");
		String s = br.readLine();
		StringTokenizer s1 = new StringTokenizer(s);
		int sum = 0,n;
		System.out.println("Integers:");
		while(s1.hasMoreTokens())
		{
			n = Integer.parseInt(s1.nextToken());
			System.out.println(n);
			sum += n;
		}
		System.out.println("Sum = "+sum);
	}
}
