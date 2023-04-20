import java.util.Scanner;

public class spiral {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int r,c;
        r=ob.nextInt();
        c=ob.nextInt();
        int arr[][]=new int[r][c];
        System.out.println("Enter elements");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        int sr,er,sc,ec;
        int n=arr.length*arr[0].length;
        sr=sc=0;
        ec=c-1;
        er=r-1;
        int count=1;
        while(sr<=er && sc<=ec &&count<=n){
            count++;
            for(int j=sc;j<=ec;j++){
                System.out.println(arr[sr][j]);
            }
            sr++;
            for(int i=sr;i<=er;i++){
                System.out.println(arr[i][ec]);
            }
            ec--;
            for(int j=ec;j>=sc;j--){
                System.out.println(arr[er][j]);
            }
            er--;
            for(int i=er;i>=sr;i--){
                System.out.println(arr[i][sc]);
            }
            sc++;
        }
        ob.close();
    }
}
