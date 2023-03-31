class prime 
{
	public static void main(String arg[])
	{
		int n=3,j,fl;
		
		
			fl=0;
			for(j=2;j<=n/2;j++)
			{
				if(n%j==0)
				{
					fl=1;
					break;
				}
			}
			if(fl==0)
				System.out.println("prime number");
			else
				System.out.println("Not prime number");
		
	}
}
		
					
