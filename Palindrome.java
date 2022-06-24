package week1.day3;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "MalayalaM";
		String rev ="";
		int length=test.length();

for(int i=length-1;i>=0;i--)
{
 rev=rev+test.charAt(i);
	
}
System.out.println(rev);
	if(test.equals(rev))
	{
		System.out.println(test+ "  String is Palindrome");
	}
	else
	{
		System.out.println(test+ "  Not Palindrome");
	}

}
	}


