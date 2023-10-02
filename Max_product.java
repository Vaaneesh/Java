import java.util.Arrays;
import java.util.Scanner;

public class Max_product{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("enter size of array");
        n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        Arrays.sort(arr);
        int ans=(arr[n-2]*arr[n-1])-(arr[0]*arr[1]);
        System.out.println(ans);
        ob.close();
    }
}