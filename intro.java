import java.util.Scanner;
class hello{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n;
        n=obj.nextInt();
        for(int i=0;i<=n;i++){
            
            for(int j=1;j<=2*i;j++){
                System.out.print(" ");
            }
            for(int k=4;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
            obj.close();
        }
    }
}