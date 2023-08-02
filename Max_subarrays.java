import java.util.Scanner;

public class Max_subarrays {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    // System.out.print(arr[k]+" ");
                }
                ans=Math.max(sum,ans);
                // System.out.println();
            }
        }
        System.out.println(ans);
        ob.close();
    }
}
