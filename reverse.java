class reverse
{
	public static void main(String arg[])
	{
		String s = "hello there";
		String rev = new String();
		int i;
		char ch;
		for(i=10;i>=0;i--)
		{
			ch = s.charAt(i);
			rev = rev + ch;
		}
		System.out.println(rev);
	}
}
