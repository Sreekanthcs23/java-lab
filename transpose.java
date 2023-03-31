class transpose
{
	public static void main(String arg[])
	{
		int a[][] = {{2,3},{4,5},{6,7}};
		int i,j;
		for(i=0;i<2;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[j][i]+"  ");
			}
			System.out.println("");
		}
	}
}
