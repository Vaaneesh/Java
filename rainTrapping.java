import java.util.Scanner;
public class rainTrapping{
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,ans;
        ans=0;
        System.out.println("Enter size");
        n=ob.nextInt();
        System.out.println("Enter elements");
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=ob.nextInt();
        }
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=height[0];
        for(int i=1;i<n;i++){
            left[i]=Math.max(left[i-1],height[i]);
        }
        right[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],height[i]);
        }
        for(int i=0;i<n;i++){
            ans+=Math.min(left[i],right[i])-height[i];
        }
        System.out.println(ans);
        ob.close();
    }
}