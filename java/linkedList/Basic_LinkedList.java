
public class Basic_LinkedList {
	Node head;
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public  void printList() 
	{
		Node n=head;
		while(n!=null) 
		{
			System.out.print(n.data+" ");
			n=n.next;
		}
	}


	public static void main(String[] args) 
	{
		Basic_LinkedList l= new Basic_LinkedList();
		 l.head= new Node(5);
		 Node second = new Node (6);
		 Node third = new Node (7);
		 l.head.next=second;
		 second.next=third;
		 l.printList();

	}

}
