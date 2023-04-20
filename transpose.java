import java.util.Scanner;

public class transpose {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,m;
        System.out.println("Enter size");
        n=ob.nextInt();
        m=ob.nextInt();
        System.out.println("Enter elements");
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        System.out.println("Answer=>");
        for(int j=0;j<m;j++){
            for(int i=n-1;i>=0;i--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        ob.close();
    }
}
