import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int f=1;
        for(int i=0;i<n;i++)
        {
            while(arr[i]%2==0)
            arr[i]/=2;
            while(arr[i]%3==0)
            arr[i]/=3;

            if(arr[i]==arr[0])
            {
                f=1;
            }
            else
            {
                f=0;
                break;

            }

        }
        if(f==1)
        System.out.println("true");
        else
        System.out.println("false");
        ob.close();
    }
}
