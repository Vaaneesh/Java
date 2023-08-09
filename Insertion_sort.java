import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        ob.close();
    }
}
