package flipcoin;

public class HarmonicNumber {
	public static void main(String[] args) 
	{
		double num=4;
    	for(int i=1; i<=num ; i++) {
    		if(i == num) {
    			System.out.print("1/"+i);
    		}
    		else {
    			System.out.print("1/"+i+ "+ ");		
    		}
    	}
    	double result=harmonicValue(num);
		
		if(num>0)
	 	{
			System.out.println("The Harmonic Value for the number is: "+result);
	 	}
		else
		{
			System.out.println("The number should be greater than zero");
		}
	}
	public static double harmonicValue(double n)
	{
	    double val = 0.0;

		for (int i = 1; i <= n; i++) 
		{
		val = val + (1.0/i);
		System.out.println(val);
		}
	return val;
	}
}