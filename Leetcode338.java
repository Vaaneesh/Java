import java.util.Arrays;
import java.util.Scanner;

public class Leetcode338{
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter no");
        int n=ob.nextInt();
        int arr[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int c=0;
            int j=i;
            while(j!=0){
                if((j&1)==1){
                    c++;
                }
                j>>=1;
            }
            arr[i]=c;
        }
        System.out.println(Arrays.toString(arr));
        ob.close();
    }
}