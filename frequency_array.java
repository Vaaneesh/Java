import java.util.Arrays;
import java.util.Scanner;

class frequency_array{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter total no of elements");
        int n=ob.nextInt();
        System.out.println("enter elements b/w 0-5");
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int freq[]=new int[6];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        System.out.println(Arrays.toString(freq));
        sort(arr,freq);
        ob.close();
    }
    private static void sort(int arr[],int freq[]){
        int j=0;
        for(int i=0;i<freq.length;i++){
            int n=freq[i];
            while(n-->0){
                arr[j]=i;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}