import java.util.Arrays;
import java.util.Scanner;

public class Stockspan {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int c=1;
        int f=0;
        int arr2[]=new int[n];
        for(int i=1;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    arr2[i]=c;
                    c++;
                    f++;
                    break;
                }
            }
            if(f==0)
            arr2[i]=1;
            f=0;
        }
        arr2[n-1]=1;
        System.out.println(Arrays.toString(arr2));
        ob.close();
    }
}
