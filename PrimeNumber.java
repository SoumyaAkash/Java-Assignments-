package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=13;
		int m=n/2;
		int flag=0;
		if(n==0||n==1)
		{
			System.out.println(n+" is not a Prime number");
			
		}
		else
		{
			for(int i=2;i<=m;i++)
			{
				if(n%i==0)
				{
					System.out.println(n+ " is not a prime number");
					flag=1;
					break;
							
				}
			}
			
			if(flag==0)
				System.out.println(n+" is a prime number");
		
		}
}
}