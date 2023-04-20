import java.util.Scanner;

public class wave2dd{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int r,c;
        System.out.println("Enter rows & columns");
        r=ob.nextInt();
        c=ob.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            if(i%2==0){
                for(int j=0;j<c;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=c-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
        ob.close();
    }
}
