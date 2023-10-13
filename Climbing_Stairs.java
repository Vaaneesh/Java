import java.util.Scanner;

public class Climbing_Stairs {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        if(n==1 || n==2){
            System.out.println(n);
        }
        else{
            int arr[]=new int[n];
            arr[0]=1;
            arr[1]=2;
            for(int i=2;i<n;i++){
                arr[i]=arr[i-1]+arr[i-2];
            }
            System.out.println(arr[n-1]);
        }
        ob.close();
    }
}
