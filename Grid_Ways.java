import java.util.Scanner;

public class Grid_Ways {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int m=ob.nextInt();
        int n=ob.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++){
            arr[i][n-1]=1;
        }
        for(int j=0;j<n;j++){
            arr[m-1][j]=1;
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                arr[i][j]=arr[i+1][j]+arr[i][j+1];
            }
        }
        System.out.println(arr[0][0]);
        ob.close();
    }
}
