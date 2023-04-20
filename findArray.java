import java.util.Scanner;

public class findArray {
    public static void main(String [] args){
        int n,c;
        c=0;
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter size of array");
        n=ob.nextInt();
        int arr[]=new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        System.out.println("Enter Target");
        int key=ob.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]+arr[j])==key){
                    c++;
                    System.out.println(arr[i]+","+arr[j]);
                }
            }
        }
        if(c==0)
        System.out.println("Error not found");
        ob.close();
    }    
}
