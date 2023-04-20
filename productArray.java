import java.util.Scanner;
public class productArray {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n,pro;
        n=ob.nextInt();
        int arr[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++){
            pro=1;
            for(int j=0;j<n;j++){
                if(i!=j)
                pro*=arr[j];
            }
            arr2[i]=pro;
        }
        for(int i=0;i<n;i++){
            if(i!=n-1)
            System.out.print(arr2[i]+",");
            else
            System.out.println(arr2[i]);
        }
        ob.close();
    }
}
