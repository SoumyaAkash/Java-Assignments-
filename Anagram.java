package week1.day3;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="DEAR";
		String s2="READ";
		int l1=s1.length();
		int l2=s2.length();
		if(l1!=l2)
		{
			System.out.println("Not Anagram");
		}
		else
		{
			char[] t1=s1.toCharArray();
			char[]t2=s2.toCharArray();
			Arrays.sort(t1);
			Arrays.sort(t2);
			
if(Arrays.equals(t1, t2))
{
	System.out.println("Anagaram");
	
}
else
	System.out.println("Not Anagram");
		}
	}

}
