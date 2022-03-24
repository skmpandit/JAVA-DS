package arrayList;

import java.util.ArrayList;

public class IsEmptyMethodInteger 
{
	public static void main(String[] args) {
		ArrayList<Integer> in=new ArrayList<>();
		boolean ans=in.isEmpty();
		if(ans)
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}
		in.add(10);
		boolean ans1=in.isEmpty();
		if(ans1)
		{
			System.out.println("ArrayList is empty");
		}
		else
		{
			System.out.println("ArrayList is not empty");
		}
	}
}
