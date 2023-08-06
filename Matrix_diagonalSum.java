import java.util.Scanner;

public class Matrix_diagonalSum {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("Enter 2Darray size");
        n=ob.nextInt();
        int arr[][]=new int[n][n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        int i=0,j=0;
        int sum=0;
        while(i<arr.length){
            sum+=arr[i][j];
            i++;
            j++;
        }
        i=0;
        j=(arr.length)-1;
        while(j>=0){
            if(j!=i)
            sum+=arr[i][j];
            i++;
            j--;
        }
        System.out.println("Sum of diagonals=> "+sum);
        ob.close();
    }
}
