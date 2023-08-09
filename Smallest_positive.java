import java.util.Arrays;
import java.util.Scanner;

public class Smallest_positive {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("enter elements");
        for(int i=0;i<5;i++){
            arr[i]=ob.nextInt();
        }
        Arrays.sort(arr);
        int a=1;
        for(int i=0;i<5;i++){
            if(arr[i]>0 && a==arr[i])
            a++;
        }
        System.out.println(ainsert);
        ob.close();
    }
}
