package arrayList;

import java.util.ArrayList;

public class IsEmptyMethodString 
{
	public static void main(String[] args) {
		ArrayList<String> s=new ArrayList<>();
		boolean ans=s.isEmpty();
		if(ans)
		{
			System.out.println("Arraylist is empty");
		}
		else
		{
			System.out.println("Arraylist is not empty");
		}
		s.add("Sonu");
		boolean ans1=s.isEmpty();
		if(ans1)
		{
			System.out.println("Arraylist is empty");
		}
		else
		{
			System.out.println("Arraylist is not empty");
		}
	}
}
