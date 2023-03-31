class small
{
	public static void main(String arg[])
	{
		int a[] = {23,2,21,11,30,16};
		int n=6,i,j,temp;
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("\nSecond smallest element is "+a[1]);
	}
}
