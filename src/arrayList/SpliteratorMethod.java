package arrayList;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorMethod 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Sonu");
		arr.add("Rajan");
		arr.add("Mohan");
		arr.add("Anup");
		arr.add("Depak");
		Spliterator<String> email=arr.spliterator();
		email.forEachRemaining((n)->System.out.print(n+" "));
	}
}
