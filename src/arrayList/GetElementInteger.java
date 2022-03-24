package arrayList;
import java.util.ArrayList;
public class GetElementInteger 
{
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(10);
		i.add(20);
		i.add(30);
		i.add(40);
		for(Integer s:i)
		{
			System.out.println(s);
		}
		int elements=i.get(0);
		System.out.println("The get at index 0 "+elements);
	}
}
