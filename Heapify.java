import java.util.Arrays;
import java.util.Scanner;

public class Heapify {
    public static void Heapify1(int arr[],int n){
        for(int i=n/2-1;i>=0;i--){
            Heapify2(arr,n,i);
        }
    }
    public static void Heapify2(int arr[],int n,int i){
        int smallest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]<arr[smallest]){
            smallest=left;
        }
        if(right<n && arr[right]<arr[smallest]){
            smallest=right;
        }
        if(smallest!=i){
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;

            Heapify2(arr, n, smallest);
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size and ele");
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        ob.close();
        Heapify1(arr,n);
        System.out.println(Arrays.toString(arr));
    }
}
