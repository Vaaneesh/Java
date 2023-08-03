import java.util.*;

public class productArrays {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter elements ");
        for(int i=0;i<5;i++){
            arr[i]=ob.nextInt();
        }
        int left[]=new int[5];
        int right[]=new int[5];
        int product=1;
        for(int i=0;i<5;i++){
            left[i]=product;
            product*=arr[i];
        }
        product=1;
        for(int i=arr.length-1;i>=0;i--){
            right[i]=product;
            product*=arr[i];
        }
        for(int i=0;i<5;i++){
            right[i]=right[i]*left[i];
        }
        System.out.println(Arrays.toString(right));
        ob.close();
    }
}
