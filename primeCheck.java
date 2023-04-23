import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        int n;
        System.out.println("enter size");
        n=ob.nextInt();
        System.out.println("enter elements ");
        int arr[]=new int[n];
        int c=0;
        for(int i=0;i<n;i++){
            arr[i]=ob.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<=arr[i];j++){
                if(arr[i]%j==0){
                    c++;
                }
            }
            if(c==2)
            System.out.println(arr[i]);
            c=0;
        }
        ob.close();
    }
}
