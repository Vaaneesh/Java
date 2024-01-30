import java.util.*;

public class Overlapping {
    public static int overlap(int arr[][]){
        if(arr.length==0)
        return 0;
        Arrays.sort(arr,Comparator.comparingInt(c->c[1]));
        int count=0;
        int end=arr[0][1];
        for(int i=0;i<arr.length;i++){
            int start=arr[i][0];
            if(start<end)
            count++;
            else end=arr[i][1];
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter n");
        int n=ob.nextInt();
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=ob.nextInt();
            arr[i][1]=ob.nextInt();
        }
        int result=overlap(arr);
        System.out.println(result);
        ob.close();
    }
}
