import java.util.Scanner;

class circular_prime
{

	static int prime(int n )
	{
		int flag = 1;
	    for (int i =2; i <= n/2; i++)
	    {
	    	if(n%i == 0)
	    		{
	    		flag = 0;
	   	    	break;
	    		}
	    	
	    }
	    if(flag == 0)
	    	return 0;
	    else 
	    	return 1;
	    }
	static int circularprime(int n)
	{
		int c = 0, temp =n;
		while(temp!= 0)
		{
			c++;
			temp = temp/10;
		}
		
		int num = n;
		while(prime(num) == 1)
		{
			int rem = num%10;
			int div = num/10;
			num = (int)((Math.pow(10,c-1))*rem) + div;
			
		    if (num == n)
		    	return 1;
		}
		return 0 ;
	}
	
	
	public static void main(String[] args) {
      
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number :");
			int  n = s.nextInt();
		if(circularprime(n) == 1)
			System.out.println(n + " is a circular prime number.");
		else 
			System.out.println(n + " is not a circular prime number.");
	
			
		
	}

}
