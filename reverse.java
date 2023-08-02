import java.util.*;
class reverse_array{
    private static void display(int arr[]){
        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static void reverse(int arr[]){
        int i,j;
        i=0;
        j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[5];
        // int arr2[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Default Array-> ");
        display(arr);
        reverse(arr);
        // int i,j;
        // i=0;
        // j=arr.length-1;
        // while(i<j){
        //     int temp=arr[i];
        //     arr[i]=arr[j];
        //     arr[j]=temp;
        //     i++;
        //     j--;
        // }
        System.out.println("Array after reverse-> ");
        display(arr);
        ob.close();
    }
}