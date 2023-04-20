import java.util.*;
public class p6 {
    public static void main(String args[]) {
		Scanner ob=new Scanner(System.in);
		int n;
		n=ob.nextInt();
		for(int i=1;i<=n;i++){
			for(int k=n;k>i;k--){
				System.out.print(" ");
			}
            if(i==1 || i==n){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for(int j=1;j<n-1;j++){
                        System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
		}
        ob.close();

    }
}