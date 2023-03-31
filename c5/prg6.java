import java.io.*;
import java.util.*;

class prg6
{
	public static void main(String arg[]) throws Exception
	{
		FileReader f1 = new FileReader("file1.txt");
		BufferedReader br = new BufferedReader(f1);
		int words=0,charact=0,lines=0;
		String line;
		while((line=br.readLine())!=null)
		{
			lines++;
			StringTokenizer s = new StringTokenizer(line);
			words += s.countTokens();
			charact += line.length();
		}
		System.out.println("words = "+words);
		System.out.println("lines = "+lines);
		System.out.println("characters = "+charact);
		f1.close();
	}
}
