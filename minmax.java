import java.util.Scanner;

public class minmax {
    private static void min(int arr[]){
        int min=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("MINIMUM=> "+min);
    }
    private static void max(int arr[]){
        int max=arr[0];
        for(int i=1;i<5;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("MAXIMUM=> "+max);
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=ob.nextInt();
        }
        min(arr);
        max(arr);
        ob.close();
    }
}
