
import java.util.*;
public class Bubble_Sort {

	public static void sort(int []arr) {
		for(int i=0;i<arr.length-1;i++) 
		{
			for(int j=0;j<arr.length-i-1;j++) 
			{
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	public static void swap(int []arr,int i,int j) 
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void main(String args[]) 
	{
		int []a=new int[5];
		Scanner scan = new Scanner(System.in);
		for(int k=0;k<5;k++) 
		{
			a[k] = scan.nextInt();
		}
		scan.close();
		//Bubble_Sort b=new Bubble_Sort();
		//b.sort(a);
		Bubble_Sort.sort(a);
		for(int k=0;k<a.length;k++) 
		{
			System.out.print(a[k]+" " );
		}
				
	}

	}
