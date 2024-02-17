import java.util.Scanner;

public class LinearSearch_Recursion {
    public static int LinearSearch(int arr[],int size,int key){
        if(size==0)
        return -1;
        else if(arr[size-1]==key)
        return size-1;

        return LinearSearch(arr,size-1,key);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size ");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter ele");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter key");
        int key=ob.nextInt();
        int idx=LinearSearch(arr,arr.length,key);
        if(idx!=-1)
        System.out.println("Element found");
        else
        System.out.println("Element not found");
        ob.close();
    }
}
