import java.util.Scanner;

public class cumulative_binary {
    // public static int countbits(int n){
    //     int c=0;
    //     while(n!=0){
    //         if((n&1)==1){
    //             c++;
    //         }
    //         n=n>>1;
    //     }
    //     return c;
    // }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter number");
        int n=ob.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=Integer.bitCount(i);
        }
        System.out.println(sum);
        ob.close();
    }
}

