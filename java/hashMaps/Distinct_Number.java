import java.util.*;

public class Distinct_Number 
{
	public static ArrayList<Integer> distinct_count(ArrayList<Integer> arr,int k) 
	{
HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		
		int distinct_count=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		for(int i=0;i<k;i++)
		{
			if(h.get(arr.get(i))==null) 
			{
				h.put(arr.get(i),1);
				distinct_count++;
			}
			else 
			{
				int count = h.get(arr.get(i)); 
				h.put(arr.get(i), count+1);
			}
		}	
			a.add(distinct_count);
		for(int i=k;i<arr.size();i++) 
		{
			if(h.get(arr.get(i-k))==1) 
			{
				h.remove(arr.get(i-k));
				distinct_count--;
			}
			else 
			{
				int count=h.get(arr.get(i-k));
				h.put(arr.get(i-k), count-1);
			}
			if(h.get(arr.get(i))==null) 
			{
				h.put(arr.get(i),1);
				distinct_count++;
			}
			else 
			{
				int count = h.get(arr.get(i)); 
				h.put(arr.get(i), count+1);
			}	
			a.add(distinct_count);
			}
		
		return a;
	}
	public static void printList(ArrayList<Integer>ar) 
	{
		int i=0;
		System.out.println("Resultant ArrayList : ");
		while(ar.size()!=i) 
		{
			System.out.println(ar.get(i));
			i++;
		}
	}
	public static void main(String args[]) 
	{
	ArrayList<Integer> array=new ArrayList<>();
	int size,k;
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Size of ArrayList");
	size = sc.nextInt();
	for(int j=0;j<size;j++)
	{
		int x=sc.nextInt();
		array.add(x);
	}
	System.out.println("Enter Size of window");
	k=sc.nextInt();
	ArrayList<Integer>result=new ArrayList<Integer>();
	result=distinct_count(array,k);
	printList(result);
	sc.close();
	}

}
