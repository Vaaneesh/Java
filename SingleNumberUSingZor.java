import java.util.Scanner;

public class SingleNumberUSingZor {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter total no of elements");
        int n=ob.nextInt();
        System.out.println("Enter elements");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int res=0;
        for(int i=0;i<n;i++){
            res=res^arr[i];
        }
        System.out.println("No with only 1 count=> "+res);
        ob.close();
    }
}
