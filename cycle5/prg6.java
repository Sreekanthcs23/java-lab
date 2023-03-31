import java.io.*;
import java.util.*;

class prg6
{
	public static void main(String arg[]) throws Exception
	{
		FileReader f = new FileReader("file1.txt");
		BufferedReader br = new BufferedReader(f);
		int charact=0,lines=0,words=0,c;
		char ch;
		String line;
		while((line=br.readLine())!=null)
		{
			lines++;
			StringTokenizer s = new StringTokenizer(line);
			words += s.countTokens();
			charact += line.length();
		}
		System.out.println("Characters = "+charact);
		System.out.println("Words = "+words);
		System.out.println("Lines = "+lines);
	}
}
