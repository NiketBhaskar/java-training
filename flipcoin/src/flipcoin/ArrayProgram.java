package flipcoin;
import java.util.Scanner;
public class ArrayProgram {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter no. of rows : ");
		int m = scanner.nextInt();
		System.out.println("Enter no. of columns : ");
		int n = scanner.nextInt();
		int [][] a  = arrayInt(m,n);
		double[][] d = arrayDouble(m,n);
		boolean[][] b = arrayBoolean(m,n);
		display(a,d,b,m,n);
	}
	public static int[][] arrayInt(int m,int n)
	{
		int a[][]=new int[m][n];
	 
		System.out.println("Integer Array");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
		    {
				a[i][j] = scanner.nextInt();
		    }   
		}
		return a;
	}
	public static double[][] arrayDouble(int m,int n)
	{
		double d[][]=new double[m][n];
	 
		System.out.println("double Array");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
		    {
				d[i][j] = scanner.nextDouble();
		    }   
		}
		return d;
	}
	public static boolean[][] arrayBoolean(int m,int n)
	{
	boolean b[][]=new boolean[m][n];
	System.out.println();
	System.out.println("Boolean Array");

		for(int i = 0; i<m; i++)
		{
			for (int j = 0; j<n; j++)
			{
				b[i][j] = scanner.nextBoolean();
			}   
		}
	return b;
	}
	public static void display(int[][]a,double[][]d,boolean[][]b,int m, int n)
	{
	
	//display integers
	System.out.println();
	
	for(int i = 0; i<m; i++)
	{
		for (int j = 0; j<n; j++)
        {
			System.out.println("\t"+a[i][j]+" ");
        } 
		System.out.println("\t");
    }
	//display double
			System.out.println();
				
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
			    {
					System.out.println("\t"+d[i][j]+" ");
			    } 
				System.out.println("\t");
			}
			//display boolean
			System.out.println();
						
			for(int i = 0; i<m; i++)
			{
				for (int j = 0; j<n; j++)
				{
					System.out.println("\t"+b[i][j]+" ");
				} 
				System.out.println("\t");
			}
}

}