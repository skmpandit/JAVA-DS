package arrayList;

import java.util.ArrayList;

public class SetMethod1 
{
	public static void main(String[] args) throws Exception
	{
		try
		{
			ArrayList<Integer> arr=new ArrayList<Integer>();
			arr.add(1);
			arr.add(2);
			arr.add(4);
			arr.add(3);
			arr.add(4);
			System.out.print(arr+" ");
			int i=arr.set(5, 3);
			System.out.println();
			System.out.print(arr+" ");
			System.out.println("Replaced element is "+i);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Thrown Exception "+e);
		}
	}
}
