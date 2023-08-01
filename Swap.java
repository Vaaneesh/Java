import java.util.*;
public class Swap
{
    public static void swap(int arr[],int arr2[]){
        int []temp=arr;
        arr=arr2;
        arr2=temp;
        System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
    }
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
        System.out.println("enter elements");
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
		    arr[i]=ob.nextInt();
		}
		 System.out.println("enter elements");
		int arr2[]=new int[5];
		for(int i=0;i<5;i++){
		    arr2[i]=ob.nextInt();
		}
		// System.out.println("enter 2 keys");
		// int a=ob.nextInt();
		// int b=ob.nextInt();
		swap(arr,arr2);
        ob.close();
	}
}
