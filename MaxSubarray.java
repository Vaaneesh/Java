import java.util.Arrays;
import java.util.Scanner;

public class MaxSubarray {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter size");
        n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int nkad=kadens(arr);
        System.out.println(nkad);
        int ns=sum(arr);
        System.out.println(ns);
        System.out.println(Arrays.toString(arr));
        int rkad=kadens(arr);
        System.out.println((Math.max(nkad, rkad+ns)));
        ob.close();

    }
    private static int sum(int arr[]){
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            arr[i]=-arr[i];
        }
        return s;
    }
    private static int kadens(int arr[]){
        int ans=Integer.MIN_VALUE;
        int s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
            ans=Math.max(ans, s);
            if(s<0){
                s=0;
            }

        }
        return ans;

    }
}
