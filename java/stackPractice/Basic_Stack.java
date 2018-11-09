import java.util.*;
public class Basic_Stack {
	public static void pushElements(Stack<Integer>sk) 
	{
		for(int i=0;i<5;i++)
		{
			sk.push(i);
		}
	}
	public static void popElements(Stack<Integer>sk)
	{
		System.out.println("Poped Elements Are :");
		while(sk.empty()==false)
		{
			Integer y = (Integer) sk.pop();
			System.out.println(y);
		}
	}
	public static void peekElement(Stack<Integer>sk) 
	{
		Integer y=(Integer)sk.peek();
		System.out.println("Peek element is "+y);
	}
	public static void searchElement(Stack<Integer>sk,int element) 
	{
		Integer pos = (Integer)sk.search(element);
		if(pos == -1)
		{
			System.out.println("Element Not Found");
		}
		else
		{
			System.out.println("Element found At index " + pos);
		}
	}
	public static void isEmpty(Stack<Integer>sk )
	{
		boolean x=sk.empty();
		
		System.out.println(x);
	}
	
	public static void main(String args[]) 
	{
		Stack<Integer>stk=new Stack<Integer>();
		pushElements(stk);
		popElements(stk);
		pushElements(stk);
		peekElement(stk);
		searchElement(stk,4);
		searchElement(stk,5);
		isEmpty(stk);
	}

}
