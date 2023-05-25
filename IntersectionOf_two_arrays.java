import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOf_two_arrays {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        HashSet<Integer> n1=new HashSet<>();
        HashSet<Integer>n2=new HashSet<>();
        int arr1[]=new int[3];
        int arr2[]=new int[3];
        for(int i=0;i<3;i++){
            arr1[i]=ob.nextInt();
        }
        for(int i=0;i<3;i++){
            arr2[i]=ob.nextInt();
        }
        for(int k:arr1){
            n1.add(k);
        }
        for(int k:arr2){
            if(n1.contains(k)){
                n2.add(k);
            }
        }
        int arr[]=new int[n2.size()];
        int c=0;
        for(int k:n2){
            arr[c]=k;
            c++;
        }
        System.err.println(Arrays.toString(arr));
        ob.close();
    }
}
