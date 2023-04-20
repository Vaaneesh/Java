import java.util.*;
public class p3 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n;
        System.out.println("Enter limit");
        n=obj.nextInt();
        for(int i=1;i<=n;i++){
            if(i==n || i==1){
                for(int j=1;j<=n;j++){
                System.out.print("*");
            }
        }
            else if(i<=(n/2)+1){
                for(int j=(n/2)+1;j>=i;j--){
                System.out.print("*");
                }
                for(int k=2;k<(2*i)-1;k++){
                    System.out.print(" ");
                }
                for(int r=(n/2)+1;r>=i;r--){
                    System.out.print("*");
                
            }
        }
            else{
                for(int j=1;j<=
                (i/2);j++){
            System.out.print("*");
            }
            for(int k=n;k>=i;k--){
                if(i!=n-1)
                System.out.print(" ");
                else{
                    k--;
                System.out.print(" ");
                }
            }
            for(int r=1;r<=(i/2);r++){
                System.out.print("*");
            }

            }
            

            
            System.out.println();
            
        }
        obj.close();

    }
}

