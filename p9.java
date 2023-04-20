import java.util.Scanner;

public class p9 {
    public static void main(String args[]){
        int n;
        Scanner ob=new Scanner(System.in);
        n=ob.nextInt();
        for(int i=n;i>=0;i--){
            for(int k=n;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int k=n;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=i;j>=0;j--){
                System.out.print(j+" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");    
            }
            System.out.println();
        }
        ob.close();
    }
}
