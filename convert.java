class convert
{
	public static void main(String arg[])
	{
		int num=255,b=2,d,i=0;
		int a[] = new int[20];
		while(num>0)
		{
			d = num%b;
			a[i] = d;
			i++;
			num/=b;
		}
		for(int j=i-1;j>=0;j--)
			System.out.print(a[j]);
	}
}
