package week1.day1;

public class FibonnacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1=0;
		int num2=1;
		int range=8;
		int sum;
		for(int i=1;i<range;i++)
		{
 sum=num1+num2;
 num1=num2;
 num2=sum;
 System.out.println(sum);
 
	}
	}
}