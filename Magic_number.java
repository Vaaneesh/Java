import java.util.Scanner;

public class Magic_number {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
         int n;
         System.out.println("Enter no.");
         n=ob.nextInt();
         int ans=0;
         int mul=5;
         while(n!=0){
            if((n&1)!=0){
                ans+=mul;
            }
            n>>=1;
            mul*=5;
         }
         System.out.println(ans);
        ob.close();
    }
}
