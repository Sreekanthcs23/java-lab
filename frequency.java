class frequency
{
	public static void main(String arg[])
	{
		String s = "hello world";
		char ch =  'l';
		int i,f=0;
		for(i=0;i<11;i++)
		{
			if(s.charAt(i)==ch)
				f++;
		}
		System.out.println("Freqency of 'l' is "+f);
	}
}
