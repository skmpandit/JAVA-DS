package arrayList;

import java.util.ArrayList;

public class AddAllIndexInteger 
{
	public static void main(String[] args) {
		ArrayList<Integer> i=new ArrayList<>();
		i.add(40);
		i.add(10);
		i.add(20);
		i.add(30);
		System.out.println("First arrayList : - ");
		for(Integer number:i)
		{
			System.out.println("Number "+number);
		}
		ArrayList<Integer> j=new ArrayList<>();
		j.add(50);
		j.add(60);
		j.add(70);
		j.add(80);
		System.out.println("Second arraylist : - ");
		for(Integer number:j)
		{
			System.out.println("Number "+number);
		}
		i.addAll(2,j);
		System.out.println("Addition of arrayList : -");
		for(Integer number:i)
		{
			System.out.println("Number "+number);
		}
	}
}
