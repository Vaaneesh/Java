import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class NextGreatest {
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
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        System.out.println(Arrays.toString(ans));
        // int arr2[]=new int[n];
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[j]>arr[i]){
        //             arr2[i]=arr[j];
        //             c++;
        //             break;
        //         }
        //     }
        //     if(c==0)
        //     arr2[i]=-1;
        //     c=0;
        // }
        // arr2[n-1]=-1;
        // System.out.println(Arrays.toString(arr2));
        ob.close();
    }
}
