import java.util.Scanner;
import java.util.Stack;

public class Largest_Rectangular_Area {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        Stack <Integer> st=new Stack<>();
        System.out.println("Enter total no of bars");
        int n=ob.nextInt();
        int arr[]=new int[n];
        int area=0;
        int a;
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++){
            while(!st.empty()&& arr[i]<arr[st.peek()]){
                int rm=i;
                int height=arr[st.pop()];
                if(st.isEmpty()){
                    a=rm*height;
                    area=Math.max(area,a);
                }
                else{
                    int lm=st.peek();
                    a=(rm-lm-1)*height;
                    area=Math.max(area, a);
                }
        }
    }
        for(int i=0;i<n;i++){
            while(!st.empty()&& arr[i]<arr[st.peek()]){
                int rm=arr.length;
                int height=arr[st.pop()];
                if(st.isEmpty()){
                    a=rm*height;
                    area=Math.max(area,a);
                }
                else{
                    int lm=st.peek();
                    a=(rm-lm-1)*height;
                    area=Math.max(area,a);
                }
            }
            System.out.println(area);
        }
        ob.close();
    }
}