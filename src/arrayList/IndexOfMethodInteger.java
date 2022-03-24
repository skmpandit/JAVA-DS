package arrayList;
import java.util.ArrayList;
import java.util.Iterator;
public class IndexOfMethodInteger {
	public static void main(String[] args) {
		ArrayList<Integer> n=new ArrayList<>(5);
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(40);
		Iterator<Integer> i=n.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		int  number=n.indexOf(10);
		System.out.println("The index of number 10 is "+number);
	}
}
