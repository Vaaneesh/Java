import java.util.*;
class pattern2{
    public static void main(String args[]){
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter limit ");
        n=obj.nextInt();
        for(int i=0;i<n;i++){
            for(int j=1;j<=2*i;j++){
                System.out.print("  ");
            }
            for(int k=n;k>i;k--){
                    System.out.print("* ");
                }
                System.out.println();
            }
        for(int i=n-1;i>=1;i--){
            for(int k=2;k<(2*i);k++){
                System.out.print("  ");
            }
            for(int j=n;j>i-1;j--){
                System.out.print("* ");
            }
            System.out.println();
            obj.close();
        }
    }
}
    
