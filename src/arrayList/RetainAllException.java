package arrayList;

import java.util.ArrayList;

public class RetainAllException 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> i=null;
		ArrayList<String> in=new ArrayList<String>();
		in.add("Sonu");
		in.add("Rajan");
		in.add("Mohan");
		in.add("Ranjeet");
		System.out.print(in+" ");
		in.retainAll(i);
		System.out.print(in+" ");
		
	}
}
