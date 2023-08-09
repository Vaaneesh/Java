import java.util.Scanner;

public class Selection_sort {
    private static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<5;i++){
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int min_ind=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min_ind])
                min_ind=j;
                int temp=arr[min_ind];
                arr[min_ind]=arr[i];
                arr[i]=temp;
            }
        }
        display(arr);
        ob.close();
    }
}
