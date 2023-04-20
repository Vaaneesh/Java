import java.util.Scanner;
public class BinarySearchArray {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,m;
        System.out.println("Enter size");
        n=ob.nextInt();
        m=ob.nextInt();
        int c=0;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=ob.nextInt();
            }
        }
        System.out.println("Enter key");
        int key=ob.nextInt();
        int r;
        boolean flag=false;
        r=0;
        c=m-1;
        while(r<n && c>=0){
            if(arr[r][c]==key){
                System.out.println("found");
                flag=true;
                break;
            }
            else if(arr[r][c]<key){
                r++;
            }
            else{
                c--;
        } }
        if(flag==false)
        System.out.println("not found");
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m;j++){
        //         if(arr[i][j]==key)
        //         c++;
        //         break;
        //     }
        // }
        // if(c==1)
        // System.out.println("found");
        // else
        // System.out.println("Not found");
        ob.close();
    }
}
