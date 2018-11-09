
	import java.util.*;

	public class RunningNumber {
		public static void reBalance(PriorityQueue<Integer> min, PriorityQueue<Integer> max,int diff) 
		{
			if(diff>=2)
			{
				min.add(max.poll());
			}
			else 
			{
				max.add(min.poll());
			}
		}
		public static void addElement(PriorityQueue<Integer> q1, PriorityQueue<Integer> q2,int x) 
		{
			if(q2.size()==0||q2.peek()>x) 
			{
				q2.add(x);
			}
			else if(q2.peek()<x)
			{
				
				q1.add(x);
		    }
			
		}

		public static void main(String[] args) {
			PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
			PriorityQueue<Integer> q2 = new PriorityQueue<Integer>
			(new Comparator<Integer>() 
			{public int compare(Integer a,Integer b)
			{
				return b-a;
			}
			});
			
			Scanner scan = new Scanner(System.in);
			int n=scan.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++)
			{	
				arr[i]=scan.nextInt();
				addElement(q1,q2,arr[i]);
				
				int diff = q2.size()-q1.size();
				
				if(diff>=2||diff<=-2) 
				{
					reBalance(q1,q2,diff);
				}
				
				if(q1.size()==q2.size()) 
				{
					System.out.println("Median = " +((float)q1.peek()+(float)q2.peek() )/2.0);
				}
				else if(q2.size()>q1.size()) 
				{
					System.out.println("Median = "+q2.peek());
				}
				else 
				{
					System.out.println("Median = "+q1.peek());
			
				}
			}
			
			
			scan.close();

		}

	}



