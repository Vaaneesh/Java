import java.util.*;
class pattern3{
    public static void main(String args[]){
        int n;
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=n;k>=i;k--){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                if(j%2!=0)
                System.out.print("* ");
                else
                System.out.print("! ");
            }
            for(int k=2;k<=i;k++){
                if(k%2==0)
                System.out.print("* ");
                else
                System.out.print("! ");
            }
            System.out.println();
            obj.close();
          }
        }
    }
