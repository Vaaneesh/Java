import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter size");
        n=ob.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        int a,b;
        b=n-1;
        a=0;
        int s1,s2;
        s1=s2=0;
        for(int i=0;i<n;i++){
            s2+=arr[a][b];
            a++;
            b--;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                s1+=arr[i][j];
            }
        }
        System.out.println("Sum of Primary Diagonal= "+s1);
        System.out.println("Sum of Seconary diagonal= "+s2);
        ob.close();
    }
}
