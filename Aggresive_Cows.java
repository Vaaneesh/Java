import java.util.Scanner;

public class Aggresive_Cows {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size");
        int n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter cows");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        int lo=1;
        int hi=arr[arr.length-1]-arr[0];
        int ans=0;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(ispossible(arr,n,mid)==true){
                ans=mid;
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        System.out.println(ans);
        ob.close();
    }
    public static boolean ispossible(int arr[],int cows,int dist){
        int placedcows=1;
        int position=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]-position>=dist){
                placedcows++;
                position=arr[i];
            }
            if(placedcows==cows){
                return true;
            }
        }
        return false;
    }
}
