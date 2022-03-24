package arrayList;

import java.util.ArrayList;

public class ContainsStringMethod 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		s.add("Sonu");
		s.add("Ramu");
		s.add("Rajan");
		s.add("Mohan");
		boolean ans=s.contains("Sonu");
		if(ans)
		{
			System.out.println("The list contains Sonu");
		}
		else
		{
			System.out.println("The list does not contains Sonu");
		}
		boolean ans1=s.contains("Ranjeet");
		if(ans1)
		{
			System.out.println("The list contains Ranjeet");
		}
		else
		{
			System.out.println("The list does not contains Ranjeet");
		}
	}
}
