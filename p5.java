import java.util.*;
public class p5 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n,a,b;
        a=1;
        n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n;k>i;k--){
                System.out.print("  ");
            }
            a=i;
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
            }
            b=a-2;
            for(int r=2;r<=i;r++){
                System.out.print(b+" ");
                b--;
            }
            System.out.println();
        }
        obj.close();
    }
}
