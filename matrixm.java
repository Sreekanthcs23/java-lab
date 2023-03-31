class matrixmul
{
	public static void main(String arg[])
	{
	int a[][] = {{2,4,7},{5,1,4}};
	int b[][] = {{5,3},{8,1},{7,2}};
	int r[][] = new int[2][2];
	int i,j,k,r1=2,c1=3,r2=3,c2=2;
	if(c1!=r2)
		System.out.println("Multilication not possible");
	else
	{
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				r[i][j] = 0;
				for(k=0;k<c1;k++)
				{
					r[i][j] += a[i][k]*b[k][j];
				}
			}
		}
	}
	for(i=0;i<r1;i++)
		{
			for(j=0;j<c2;j++)
			{
				System.out.print(r[i][j]+"  ");
			}
			System.out.println("");
		}
	}
}
