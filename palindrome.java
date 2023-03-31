class palindrome 
{
	public static void main(String arg[])
	{
		String s="Malayalam";
		int i,flag=0,l=8;
		for(i=0;i<5;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i))
			{
				flag++;
				break;
			}
		}
		if(flag==0)
			System.out.println("Palindrome");
		else
			System.out.println("not palindrome");
	}
}
