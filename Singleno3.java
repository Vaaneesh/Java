import java.util.Scanner;

public class Singleno3 {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,ans;
        ans=0;
        System.out.println("Enter size");
        n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        for(int i:arr){
            ans=ans^i;
        }
        int mask=ans&(~(ans-1));
        System.out.println("Mask= "+mask);
        int a=0;
        for(int k:arr){
            if((mask&k)!=0){
                a=a^k;
            }
        }
        //Unique numbers->
        System.out.println(a);
        System.out.println(ans^a);
        ob.close();
    }
}
