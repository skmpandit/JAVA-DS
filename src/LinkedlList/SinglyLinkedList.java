package LinkedlList;

public class SinglyLinkedList 
{
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
			next=null;
		}
	}
	public static SinglyLinkedList insert(SinglyLinkedList list,int data)
	{
		Node newNode=new Node(data);
		newNode.next=null;
		if(list.head==null)
		{
			list.head=newNode;
		}
		else
		{
			Node last=list.head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=newNode;
		}
		return list;
	}
	public static void Display(SinglyLinkedList list)
	{
		Node currentNode=list.head;
		System.out.print("Linked List :- ");
		while(currentNode!=null)
		{
			System.out.print(currentNode.data+" ");
			currentNode=currentNode.next;
		}
		
	}
	public static void main(String[] args) 
	{
		SinglyLinkedList list=new SinglyLinkedList();
		list=insert(list, 3);
		list=insert(list, 5);
		list=insert(list, 8);
		Display(list);
		
	}
}
