package week1.day3;

public class ReverseString {

	public static void main(String[] args) {
				String test = "hello hi";
			    String rev="";
				int length=test.length();
//char [] A= test.toCharArray();
for(int i=length-1;i>=0;i--)
{
	 rev=rev+test.charAt(i);
}
System.out.println(rev);
}

	}

