package week1.day1;

public class printDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int []A = {14,12,13,11,15,14,18,16,17,19,18,17,20};
System.out.println("The duplicate numbers in the array is");
int length=A.length;
//System.out.println("length is " +length);
for(int i=0;i<=length-1;i++)
{
for(int j=i+1;j<=length-1;j++)
{
	if (A[i]==A[j])
	System.out.println(A[i]);
}
	
}

}


}
