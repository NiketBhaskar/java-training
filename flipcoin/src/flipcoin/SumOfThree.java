package flipcoin;
import java.util.Scanner;
public class SumOfThree {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Size Array :");
		int size=scanner.nextInt();
		int arr[]=new int [size];

		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter "+(i+1)+" Value :");
			arr[i]=scanner.nextInt();
		}


		int sum=Triplets(arr,size);//pass the arguments to method 1
		System.out.println("No.of Tripltes :"+sum);
		System.out.println();
	}
	public static int Triplets(int b[],int length)
	{
		int i,j,k,count=0;
		for(i=0;i<length;i++)
		{
			for(j=i+1;j<length;j++)
			{
				for(k=j+1;k<length;k++)
				{
					if (b[i] + b[j] + b[k] == 0)
					{
						System.out.println(b[i] + " " + b[j] + " " + b[k]);
						count++;
					}
				}
			}
		}
		return count;
	}

}
