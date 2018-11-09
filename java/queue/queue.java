
public class queue 

{
	Node head;
	private int size=0;
	public int size() 
	{
		return size;
	}
	
	public boolean search(int data) 
	{
		return search(data,head);
	}
	public boolean search(int data,Node h)
	
	{
		if(h==null) 
		{
			return false;
		}
		if(h.data==data) 
		{
			return  true;
		}
		else return search(data,h.next);
	
	}
	public void add(int data) {
		head=add( data,head);
		size=size+1;
	}
	public static Node add (int data,Node h) 
	{
		if(h==null) 
		{
			h=new Node(data);
			return h;
		}
		else 
		{
			h.next =add(data,h.next);
		}
		return h;
	}
	
	public void removeLast() 
	{
		if(head==null) {
			System.out.println("Empty List");
		}
		else 
		{
			head=removeLast(head);
		}
	}
	public Node removeLast(Node h) 
	
	{
		if(h.next==null) 
		{
			return null;
		}
		else {
			h.next=removeLast(h.next);
			return h;
		}
	}
	static public class Node
	{
		int data;
		Node next;
		public Node(int data) 
		{
			this.data=data;
			this.next=null;
		}
		
	}
	public void printQueue()
	{
		printQueue(head);
	}
	public void printQueue(Node h) 
	{
		if(h==null) 
		{
			return;
		}
		else 
		{
			System.out.println(h.data);
			printQueue(h.next);
		}
	}
	
	public static void main(String args[]) 
	{
		queue q1=new queue();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		q1.add(4);
		q1.printQueue();
		System.out.println(q1.size());
		System.out.println(q1.search(4));
		q1.removeLast();
		q1.printQueue();
	}
	
}
