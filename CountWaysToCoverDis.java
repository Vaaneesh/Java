import java.util.Scanner;

public class CountWaysToCoverDis {
    public static int countWays(int n){
        if(n==0)
        return 1;
        int dp[]=new int[n+1];
        dp[0]=1;
        for(int i=1;i<=n;i++){
            dp[i]+=dp[i-1];
            if(i>=2){
                dp[i]+=dp[i-2];
            }
            if(i>=3){
                dp[i]+=dp[i-3];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter distance");
        int dist=ob.nextInt();
        int result=countWays(dist);
        System.out.println(result);
        ob.close();
    }
}
