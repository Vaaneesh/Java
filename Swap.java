import java.util.*;
public class Swap
{
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(Arrays.toString(arr));
    }
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
        System.out.println("enter elements");
		int arr[]=new int[5];
		for(int i=0;i<5;i++){
		    arr[i]=ob.nextInt();
		}
		System.out.println("enter 2 keys");
		int a=ob.nextInt();
		int b=ob.nextInt();
		swap(arr,a,b);
	}
}
