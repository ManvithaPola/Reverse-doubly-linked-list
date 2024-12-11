import java.util.*;
class DoublyLinkedList
{
	Node head;
	class Node
	{
		int data;
		Node prev;
		Node next;
		public Node(int data)
		{
			this.data = data;
			prev = null;
			next = null;
		}
	}
	public void dllcreation(int num)
	{
		Node newNode = new Node(num);
		if (head == null)
		{
			head = newNode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=newNode;
			newNode.prev=temp;
		}
	}
	public void reverse(Node node)
	{
		Node temp=head;
		Node prev=null;
		Node nextnode;
		while(temp!=null)
		{
			nextnode=temp.next;
			temp.next=prev;
			temp.prev=nextnode;
			prev=temp;
			temp=nextnode;
		}
		head=prev;
	}
	public void display()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		DoublyLinkedList dll = new DoublyLinkedList();
		System.out.println("Enter the items to insert:");
		while (true)
		{
			int num = s.nextInt();
			if (num == -1)
			{
				break;
			}
			dll.dllcreation(num);
		}
		dll.reverse(dll.head);
		dll.display();
	}
}