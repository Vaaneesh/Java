import java.util.Scanner;

public class climbingStairs {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        int a=1,b=1;
        for(int i=2;i<=n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(b);
        ob.close();

    }
}
