import java.util.Scanner;

public class eggDrop {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter floors and eggs");
        int floors=ob.nextInt();
        int eggs=ob.nextInt();
        int moves=0;
        int dp[]=new int[eggs+1];
        while(dp[eggs]<floors){
            moves++;
            for(int j=eggs;j>0;j--){
                dp[j]+=dp[j-1]+1;
            }
        }
        System.out.println(moves);
        ob.close();
    }
}
