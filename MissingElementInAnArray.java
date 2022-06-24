package week1.day1;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,2,3,4,8,7,5};
	   Arrays.sort(A);
		for(int i=0;i<A.length;i++)
		{
			if(A[i]!=i+1)
			{
				System.out.println(i+1);
				break;
			}
			
		}
	}

}
