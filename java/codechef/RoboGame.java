package codechef;
import java.util.*;
 class RoboGame {
	public static void calculate(String st) {
		int flag=0;
		boolean arr[] = new boolean[st.length()];
		Arrays.fill(arr, Boolean.FALSE);
		char []str=st.toCharArray();
		int i=0;
		for(i=0;i<st.length()&&flag==0;i++) {
		if(str[i]=='.') {
			continue;
		}
		else {
			int x=Integer.parseInt(String.valueOf(str[i]));
		
				int l=i-x;
				
				if(l<0) {
					l=0;
				}
				int r=i+x;
				if(r>=st.length()) {
					r=st.length()-1;
				}
				for(int j=l;j<=r;j++) {
					if(arr[j]==false) {
						
					arr[j]=true;
					}
					
					else {
						flag=1;
						break;
					}
				}
		}
		
			
		}
		if(flag==0) {
			System.out.println("safe");
		}
		else {
			System.out.println("unsafe");
		}
		
	}
public static void main(String args[]) {
	int test;
	Scanner sc= new Scanner(System.in);
	test=sc.nextInt();
	while(test!=0) {
		String st=new String();
		st=sc.next();
		calculate(st);
		test--;
	}
}
}
