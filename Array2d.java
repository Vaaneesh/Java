import java.util.Arrays;
import java.util.Scanner;

public class Array2d {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,m;
        System.out.println("enter size of 2d array");
        n=ob.nextInt();
        m=ob.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        System.out.println(Arrays.toString(arr));
        ob.close();
        
    }
}
