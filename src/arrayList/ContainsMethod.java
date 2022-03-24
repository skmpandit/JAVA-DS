package arrayList;

import java.util.ArrayList;

public class ContainsMethod 
{
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(30);
		i.add(20);
		i.add(50);
		i.add(10);
		boolean ans=i.contains(20);
		if(ans)
		{
			System.out.println("The list Contains 20");
		}
		else
		{
			System.out.println("The list does not contain 20");
		}
		boolean ans1=i.contains(60);
		if(ans1)
		{
			System.out.println("The list contain 60");
		}
		else
		{
			System.out.println("The list does not contain 60");
		}
	}
}
