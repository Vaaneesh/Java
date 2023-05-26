import java.util.*;
public class Array_intersection_CB {
    public static void main(String args[]) {
        // Your Code Here
		Scanner ob=new Scanner(System.in);
		ArrayList<Integer>li = new ArrayList<>();
		int n=ob.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
    	for(int i=0;i<n;i++){
			a1[i]=ob.nextInt();
		}
		for(int i=0;i<n;i++){
			a2[i]=ob.nextInt();
		}
		int c1=0;
		int c2=0;
		Stack <Integer> st=new Stack<>();
		for(int i=0;i<n;i++){
			int key=a1[i];
			if(!st.contains(key)){
			for(int j=0;j<n;j++){
				if(key==a1[j])
				c1++;
				if(key==a2[j])
				c2++;
			}
			if((c1!=0)&&(c2!=0)){
				int min=Math.min(c1,c2);
				for(int k=1;k<=min;k++){
					li.add(key);
				}
			}
			c1=c2=0;
			}
			st.add(key);
		}
		System.out.println(li);
        ob.close();
    }
}


