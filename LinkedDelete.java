import java.util.*;
public class LinkedDelete {
		
	public Node insert_beg(Node n, int data)
	{
		Node p;
		if(n == null)
		{
			p = new Node(data);
			n = p;
			return n;
			
		}
		p = new Node(data);
		p.next = n;
		n = p;
		return n;
	}
	public Node insert_end(Node n, int data)
	{
		Node current = n;
		Node p;
		Node x = n;
		if(n == null)
		{
			p = new Node(data);
			n = p;
			return n;
		}
		while(current != null)
		{
			x = current;
			current = current.next; 
		}
		p = new Node(data);
		x.next = p;
		return n;
	}
	public Node insert_ind(Node n, int data, int index)
	{
		if(n == null)
		{
			System.out.println("List is Empty");
			return n;
		}
		int count = 1;
		Node current = n;
		Node p;
		while(count < index - 1)
		{
			current = current.next;
			count++;
		}
		p = new Node(data);
		p.next  = current.next;
		current.next = p;
		return n;
	}
	public Node del_beg(Node n)
	{
		if(n == null)
		{
			System.out.println("List is Empty");
			return n;
		}
		n = n.next;
		return n;
	}
	public Node del_end(Node n)
	{
		if(n == null)
		{
			System.out.println("List is empty");
			return n;
		}
		Node current = n;
		Node x = n;
		while(current.next != null)
		{
			x = current;
			current = current.next;
		}
		x.next = null;
		return n;
	}
	public Node del_ind(Node n, int index)
	{
		if(index == 1)
		{
			del_beg(n);
			return n;
		}
		int count = 0;
		Node current = n;
		while(current != null)
		{
			current = current.next;
			count++;
		}
		if(count < index)
		{
			System.out.println("Index is not present");
			return n;
		}
		Node x = n;
		count = 1;
		current = n;
		while(count < index)
		{
			x = current;
			current = current.next;
			count++;
		}
		x.next = current.next;
		return n;
	}
	
	public void print(Node current)
	{
		while(current != null)
		{
			System.out.print(current.data+" ");
			current = current.next;
		}
		System.out.println();
	}
	
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		LinkedDelete ld = new LinkedDelete();
		Node start = null;
		int nodes;
		int more = 0;
		do
		{
		System.out.println("1-Insertion at Beginnig");
		System.out.println("2-Insertion at End");
		System.out.println("3-Insertion at Given Index");
		System.out.println("4-Deletion from Begning");
		System.out.println("5-Deletion from End");
		System.out.println("6-Deletion from Given Index");
		int u = scan.nextInt();
		switch (u) 
		{
			case 1 : System.out.println("How many nodes");
					 nodes = scan.nextInt();
					 ld.print(start);
					 System.out.println("Enter values");
					 for(int i = 0; i < nodes; i++)
					 {
						 int x = scan.nextInt();
						 start = ld.insert_beg(start, x);
					 }
					 ld.print(start);
					 break;
			case 2 : System.out.println("How many nodes");
					 nodes = scan.nextInt();
					 ld.print(start);
					 System.out.println("Enter values");
					 for(int i = 0; i < nodes; i++)
					 {
						 int x = scan.nextInt();
						 start = ld.insert_end(start, x);
					 }
					 ld.print(start);
					 break;
			case 3 : System.out.println("Enter the Index");
					 nodes = scan.nextInt();
					 ld.print(start);
					 System.out.println("Enter value");
					 int x = scan.nextInt();
					 start = ld.insert_ind(start, x, nodes);
					 ld.print(start);
					 break;
			case 4 : System.out.print("Previous list -> ");
					 ld.print(start);
					 start = ld.del_beg(start);
					 System.out.print("Current list -> ");
					 ld.print(start);
					 break;
			case 5 : System.out.print("Previous list -> "); 
					 ld.print(start);
					 start = ld.del_end(start);
					 System.out.print("Current list -> ");
					 ld.print(start);
					 break;
			case 6 : System.out.println("Enter index");
					 nodes = scan.nextInt();
					 System.out.print("Previous list -> ");
					 ld.print(start);
					 start = ld.del_ind(start, nodes);
					 System.out.print("Current list -> ");
					 ld.print(start);
		}
		System.out.println("1 for More & 0 for Exit");
		more = scan.nextInt();
		}while(more == 1);
		
	}
	class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data = data;
		}
	}
} 



