import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Stockspan {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        // int c=0;
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        Stack <Integer>st=new Stack<>();
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& arr[i]>arr[st.peek()]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=i+1;
            }
            else{
                ans[i]=i-st.peek();
            }
            st.push(i);
        }
        System.out.println(Arrays.toString(ans));
        ob.close();
    }
}
