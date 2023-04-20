import java.util.Scanner;

public class p7 {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,a, b;
        n=ob.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            a=i;
            for(int k=1;k<=i;k++){
                System.out.print(a);
                a++;
            }
            b=a-2;
            for(int j=2;j<=i;j++){
                System.out.print(b);
                b--;
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int k=n-1;k>=i;k--){
                System.out.print(" ");
            }
            a=i;
            for(int j=1;j<=i;j++){
                System.out.print(a);
                a++;
            }
            b=a-2;
            for(int j=1;j<i;j++){
                System.out.print(b);
                b--;
            }
            System.out.println();
        }
        
        ob.close();

    }
    
}
