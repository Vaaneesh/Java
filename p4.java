import java.util.*;
public class p4 {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int n,a;
        a=1;
        n=obj.nextInt();
        int k=1;
        for(int i=1;i<=n;i++){
            for(int j=n;j>i;j--){
                System.out.print("\t");
            }
            for(int r=1;r<=a;r++){
                if(k<10)
                System.out.print(k+"\t");
                else
                System.out.print(k+"\t");
                k++;
            }
            a=a+2;
            System.out.println();
        }

        obj.close();
    }
}
