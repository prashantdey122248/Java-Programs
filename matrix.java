import java .util.Scanner;
class matrix
{
	public static void main(String ars[])
	{
		int a[][]= new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		int i,j;

	  Scanner sc=new Scanner (System.in);

		System.out.println("enter first matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("enter value in position ["+i+"] ["+j+"]");
				 a[i][j]=sc.nextInt();
			}
				
		}

		System.out.println("enter second matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.println("enter value in position ["+i+"] ["+j+"]");
				 b[i][j]=sc.nextInt();
			}
			
		}


		
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				c[i][j]=a[i][j]*b[i][j];
			}
		}

			System.out.println("first matrix display");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j] +" ");
				
			}
				System.out.println();
		}

		System.out.println("display second matrix");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(b[i][j]  +" ");
				
			}
			System.out.println();
		}
		System.out.println("display  matrix multiplaction");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(c[i][j] +" ");
				
			}
			System.out.println();
		}
	}
}