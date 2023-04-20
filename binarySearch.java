import java.util.Scanner;

public class binarySearch {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,s,e;
        n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter key");
        int k=ob.nextInt();
        s=0;
        e=n-1;
        int mid=(s+e)/2;
        int c=0;
        while(s<=e){
            if(k<arr[mid]){
                e=mid-1;
            }
            else if(k==arr[mid]){
                c++;
                System.out.println("Found index= "+mid);
                break;
            }
            else{
                s=mid+1;
            }
            mid=(s+e)/2;
        }
        if(c==0)
        System.out.println("Error not found");
        ob.close();

    }
}
