import java.util.Arrays;
import java.util.Scanner;

public class countBit {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=arr[i/2]+i%2;
        }
        System.out.println(Arrays.toString(arr));
        ob.close();
    }
}