import java.util.Arrays;
import java.util.Scanner;

public class coinChange {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and ele");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter sum");
        int sum=ob.nextInt();
        long dp[]=new long[sum+1];
        Arrays.fill(dp, 0L);
        dp[0]=1;
        for(int i:arr){
            for(int j=i;j<sum+1;j++){
                dp[j]+=dp[j-i];
            }
        }
        System.out.println(dp[sum]);
        ob.close();
    }
}
