import java.util.Arrays;
import java.util.Scanner;

public class rotateArray {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n;
        n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int k;
        System.out.println("enter k");
        k=ob.nextInt();
        while(k-->0){
        int val=arr[n-1];
        for(int i=n-2;i>=0;i--){
                arr[i+1]=arr[i];
        }
        arr[0]=val;
      }
      System.out.println(Arrays.toString(arr));
    //   for(int i=0;i<n;i++){
    //     System.out.print(arr[i]+",");
    //   }
        ob.close();
    }
}
