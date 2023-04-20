import java.util.Scanner;

public class p8{
    public static void main(String args[]) {
        int n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        for(int i=n;i>=0;i--){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            for(int k=(2*i)-1;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                if(j!=0)
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            for(int k=(2*i)-1;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        ob.close();
    }
}